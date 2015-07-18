package us.wasatchsystems.ccs.datasource;

import us.wasatchsystems.ccs.models.Volunteer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jake on 7/16/2015.
 */
public class VolunteerDataSource {

    //jdbc:sqlserver://[serverName[\instanceName][:portNumber]][;property=value[;property=value]]

    Connection connection;

    public VolunteerDataSource() {

        try {
            connection = LoadDatabase.getConnection();

        } catch (SQLException sqle) {
            sqle.printStackTrace();

        }

    }


    public void queryAll() {
        try {
            List<Volunteer> volunteers = new ArrayList<Volunteer>();

            // Setup the query
            String SQL = "SELECT * FROM dbo.VOLUNTEER;";
            String result = connection.nativeSQL(SQL);
            CallableStatement cstmt = null;
            cstmt = connection.prepareCall(SQL);

            // Get the result set
            ResultSet rs = null;
            rs = cstmt.executeQuery();

            // Get the data from the result set
            while (rs.next()) {
                String firstName = rs.getString("VolunteerFirstName");
                String lastName = rs.getString("VolunteerLastName");
                Date dob = rs.getDate("VolunteerDoB");

                System.out.println("FirstName: " + firstName);
                System.out.println("LastName: " + lastName);
                System.out.println("Volunteer DOB: " + dob.toString());

                volunteers.add(new Volunteer(firstName, lastName, dob));
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.out.println("Unable to query");
        }



    }


    public static void main(String[] args) {
        new VolunteerDataSource().queryAll();
    }
}
