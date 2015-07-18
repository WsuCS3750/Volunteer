package us.wasatchsystems.ccs.datasource;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.DriverManager;


import java.sql.*;



/**
 * Created by Jake on 7/16/2015.
 *
 *
 *
 */

public class LoadDatabase {


    public static Connection connection = null;



    public static Connection getConnection() throws SQLException {

        if(connection != null) {
            return connection;
        }


        //Load the properties
        PropertyLoader propertyLoader = new PropertyLoader();

        // Initialize the driver
        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());

        Connection con = null;
        CallableStatement cstmt = null;
        ResultSet rs = null;

        //jdbc:sqlserver://localhost:1433;databaseName=CCS_PROTOTYPE
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
            return con;

        } catch (Exception ex1) {
            ex1.printStackTrace();
            System.out.println("An error occurred in connecting to the database");

            return null;
        }

    }


    public LoadDatabase(boolean isJdts) {


    }


    public static void testDriver() throws Exception {
//        Driver d = (Driver)Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance();
        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());

        System.out.println("Successfully loaded the driver.");
    }

    public static void main(String[] args) throws Exception {




    }




}
