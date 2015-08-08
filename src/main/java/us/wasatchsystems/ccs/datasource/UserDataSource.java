package us.wasatchsystems.ccs.datasource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import us.wasatchsystems.ccs.models.User;

import java.sql.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jake on 7/16/2015.
 *
 *
 *
 *
 * Handles all of the insert update, and delete for the volunteer. Gets the connection if it does not exist
 * the executes the sql stuff.
 */

public class UserDataSource {

    private static final Logger log = LogManager.getLogger(UserDataSource.class);


    private static final DateFormat iso8601Format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");

    //jdbc:sqlserver://[serverName[\instanceName][:portNumber]][;property=value[;property=value]]

    Connection connection;

    public UserDataSource() {

        try {
            connection = LoadDatabase.getConnection();
            log.info("Successfully loaded the connection");

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            log.error("Error initializing the database connection");
        }

    }


    /**
     * Gets all the volunteers as a list.
     * @return List of all volunteers
     */

//    CREATE TABLE UserTable
//            (
//                    user_id INT PRIMARY KEY NOT NULL IDENTITY,
//                    firstName VARCHAR(50) NOT NULL,
//    lastName VARCHAR(50) NOT NULL,
//    userName VARCHAR(50) NOT NULL,
//    password VARCHAR(200) NOT NULL,
//    adminStatus VARCHAR(3) DEFAULT 'n' NOT NULL,
//    joinDate DATETIME DEFAULT '(getdate())' NOT NULL,
//    modifiedOn IMAGE NOT NULL
//    );


    // todo
    public static List<User> queryAll() {

        try {
            Connection connection = LoadDatabase.getConnection();

            List<User> users = new ArrayList<User>();

            // Setup the query
            String SQL = "SELECT * FROM volunteer.dbo.UserTable;";
            String result = connection.nativeSQL(SQL);
            CallableStatement cstmt = null;
            cstmt = connection.prepareCall(SQL);

            // Get the result set
            ResultSet rs = cstmt.executeQuery();

            // Get the data from the result set
            while (rs.next()) {
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
//                Date dob = rs.getDate("VolunteerDoB");
                Date joinDate = rs.getDate("joinDate");

                log.info("FirstName: " + firstName);
                log.info("LastName: " + lastName);
                log.info("Volunteer DOB: " + joinDate.toString());

                users.add(new User(firstName, lastName, joinDate.toString()));

            }
            return users;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            log.info("Unable to query");


            return new ArrayList<User>();
        }


        // CLOSE THE CONNECTION!!!


    }


    /**
     VolunteerID			smallint		NOT NULL	IDENTITY(1, 1),
     VolunteerFirstName	varchar(25)		NOT NULL,
     VolunteerLastName	varchar(30)		NOT NULL,
     VolunteerDoB		smalldatetime	NOT NULL


     * @param user to insert
     */


    public static void addVolunteer(User user) {

        try {

            Connection connection = LoadDatabase.getConnection();


            if (connection == null) {
                return;
            }

            CallableStatement cstmt;
            System.out.println("Attempting to insert: " + user.toString());

            String realDoB = user.getDob().replace("/", "");

            char[] realDobArray = realDoB.toCharArray();


            String finalDoB = "'" + realDobArray[0] + realDobArray[1] + "/" + realDobArray[2] + realDobArray[3] + "/" + realDobArray[4] + realDobArray[5] + realDobArray[6] + realDobArray[7] + "'";

//            String query = "INSERT INTO dbo.VOLUNTEER (VolunteerFirstName, VolunteerLastName, VolunteerDoB)values('" +
//                    //user.getFirstName() + "', '" + user.getLastName() + "', sysdatetime());";
//                    user.getFirstName() + "', '" + user.getLastName() + "', " + finalDoB + ");";


//            String query = "use user; go INSERT INTO dbo.UserTable (firstName, lastName, userName) "

            String query = "INSERT INTO volunteer.dbo.UserTable(firstName, lastName, userName, password, adminStatus)" +
                "VALUES " +
                    "('" + user.getFirstName() + "', '" + user.getLastName() + "', '" + user.getUsername() + "', '" + user.getPassword() + "', " +
                    "'" + user.getAdminStatus() + "');";



            cstmt = connection.prepareCall(query);

            cstmt.execute();

            connection.commit();

            log.info("Inserted ok");


        } catch (SQLException sqle) {
            sqle.printStackTrace();
            log.error("Error inserting into the database");
        }

    }


    public static void main(String[] args) {
////        UserDataSource volunteerDataSource = new UserDataSource();
//        User user = new User("Shane", "Abel", "3/3/3");
//        UserDataSource.addVolunteer(user);
        for(User v : UserDataSource.queryAll()) {
            System.out.println(v.toString());
        }

    }
}
