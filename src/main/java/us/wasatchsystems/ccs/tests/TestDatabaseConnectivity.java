package us.wasatchsystems.ccs.tests;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import us.wasatchsystems.ccs.datasource.PropertyLoader;

import java.sql.*;


/**
 * This class is used to test weather your database is properly configured or not
 *
 *
 */

public class TestDatabaseConnectivity {





    public TestDatabaseConnectivity() {
        System.out.println("Testing connection to the database");

        try {
            Connection connection = getConnection();
            if(connection != null) {
                System.out.println("Connected successfully");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.out.println("Unable to connect to database");
        }

    }

    public static Connection getConnection() throws SQLException {



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



            return con;

        } catch (Exception ex1) {
            ex1.printStackTrace();

            return null;
        }


    }


    public static void main(String[] args) {
        new TestDatabaseConnectivity();
    }
}
