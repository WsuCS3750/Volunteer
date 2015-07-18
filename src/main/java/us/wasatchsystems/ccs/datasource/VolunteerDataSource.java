package us.wasatchsystems.ccs.datasource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import us.wasatchsystems.ccs.models.Volunteer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jake on 7/16/2015.
 */
public class VolunteerDataSource {

    private static final Logger log = LogManager.getLogger(VolunteerDataSource.class);

    //jdbc:sqlserver://[serverName[\instanceName][:portNumber]][;property=value[;property=value]]

    Connection connection;

    public VolunteerDataSource() {

        try {
            connection = LoadDatabase.getConnection();
            log.info("Successfully loaded the connection");

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            log.error("Error initializing the database connection");
        }

    }


    public List<Volunteer> queryAll() {

        try {

            List<Volunteer> volunteers = new ArrayList<Volunteer>();

            // Setup the query
            String SQL = "SELECT * FROM dbo.VOLUNTEER;";
            String result = connection.nativeSQL(SQL);
            CallableStatement cstmt = null;
            cstmt = connection.prepareCall(SQL);

            // Get the result set
            ResultSet rs = cstmt.executeQuery();

            // Get the data from the result set
            while (rs.next()) {
                String firstName = rs.getString("VolunteerFirstName");
                String lastName = rs.getString("VolunteerLastName");
                Date dob = rs.getDate("VolunteerDoB");

                log.info("FirstName: " + firstName);
                log.info("LastName: " + lastName);
                log.info("Volunteer DOB: " + dob.toString());

                volunteers.add(new Volunteer(firstName, lastName, dob.toString()));

            }
            return volunteers;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            log.info("Unable to query");
            return new ArrayList<Volunteer>();

        }


        // CLOSE THE CONNECTION!!!


    }


    /**
     VolunteerID			smallint		NOT NULL	IDENTITY(1, 1),
     VolunteerFirstName	varchar(25)		NOT NULL,
     VolunteerLastName	varchar(30)		NOT NULL,
     VolunteerDoB		smalldatetime	NOT NULL


     * @param volunteer to insert
     */


    public void addVolunteer(Volunteer volunteer) {

        try {


            if (connection == null) {
                return;
            }

            CallableStatement cstmt = null;


            String query = "INSERT INTO dbo.Volunteer (VolunteerFirstName, VolunteerLastName, VolunteerDoB)values('" +
                    volunteer.getFirstName() + "', '" + volunteer.getLastName() + "', '" + volunteer.getDob() +
                    "');";

            cstmt = connection.prepareCall(query);


            if (cstmt.execute()) {
                log.info("Inserted into database");
            } else {
                log.error("Error inserting into the database");
            }


            //        cstmt = connection.prepareCall();

            // Get the result set
            //        ResultSet rs = null;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            log.error("Error inserting into the database");
        }







    }


    public static void main(String[] args) {
        VolunteerDataSource volunteerDataSource = new VolunteerDataSource();
        Volunteer volunteer = new Volunteer("Shane", "Abel", "3/3/3");
        volunteerDataSource.addVolunteer(volunteer);


    }
}
