package us.wasatchsystems.ccs.datasource;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;
import com.microsoft.sqlserver.jdbc.*;


/**
 * Created by Jake on 7/16/2015.
 *
 *
 *
 */

public class LoadDatabase {

    public LoadDatabase() {

        PropertyLoader propertyLoader = new PropertyLoader();

        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());

        } catch (Exception ex1) {
            ex1.printStackTrace();
        }

        Connection con = null;
        CallableStatement cstmt = null;
        ResultSet rs = null;

        try {
            // Establish the connection.
            SQLServerDataSource ds = new SQLServerDataSource();

            // Use windows based authentication.
            ds.setIntegratedSecurity(false);


            // Load the properties and get it to load
            ds.setServerName(propertyLoader.getServerName());
            ds.setDatabaseName(propertyLoader.getDatabaseName());
            ds.setPortNumber(propertyLoader.getPort());
            ds.setUser(propertyLoader.getUserName());
            ds.setPassword(propertyLoader.getUserPassword());


            // Connect to the database.
            con = ds.getConnection();


            System.out.println("You successfully connected to the database");

        } catch (Exception ex1) {
            ex1.printStackTrace();
            System.out.println("An error occurred in connecting to the database");
        }

    }



    public static void testDriver() throws Exception {
//        Driver d = (Driver)Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance();
        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());

        System.out.println("Successfully loaded the driver.");
    }

    public static void main(String[] args) throws Exception {


        // Tests the driver
//        LoadDatabase.testDriver();

        // Test the
        LoadDatabase.testDriver();


    }




}
