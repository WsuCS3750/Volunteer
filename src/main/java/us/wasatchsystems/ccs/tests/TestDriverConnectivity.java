package us.wasatchsystems.ccs.tests;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.sql.DriverManager;


/**
 * Tests weather or not the driver is properly configured or not
 *
 *
 * Might want to move this to a junit test and have it called on compile
 * to let you know if you are not connected to the database before the application
 * is created.
 *
 */

public class TestDriverConnectivity {




    public TestDriverConnectivity() {

        System.out.println("Testing to see if the driver works or not");
        try {

            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            System.out.println("Successfully loaded the driver.");

        } catch (Exception ex1) {
            ex1.printStackTrace();
            System.out.println("Unable to load the driver");
        }


    }

    public static void main(String[] args) {
        new TestDriverConnectivity();
    }
}
