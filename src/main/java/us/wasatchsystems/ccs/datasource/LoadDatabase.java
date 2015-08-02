package us.wasatchsystems.ccs.datasource;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.activation.DataSource;
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

    private static Logger log = LogManager.getLogger(LoadDatabase.class);

    public static Connection connection = null;


    /**
     * Opens up the connection if it is not open already, if it is open then it establishes the connection with the database.
     * @return the connection for querying.
     * @throws SQLException
     */

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


            log.info("You successfully connected to the database");
            return con;

        } catch (Exception ex1) {
            ex1.printStackTrace();
            log.error("An error occurred in connecting to the database");

            return null;
        }

    }


    /**
     * Use this to test if your driver works properly.
     * @throws Exception
     */



    public static void testDriver() throws Exception {
//        Driver d = (Driver)Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance();
        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        log.info("Successfully loaded the driver.");
    }







    /**
     * Tests the logger to see if it works.
     */

    public static void testLogger() {
        log.info("Calling test logger");

    }




    public static void main(String[] args) throws Exception {


        LoadDatabase.testLogger();


    }




}
