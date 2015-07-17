package us.wasatchsystems.ccs.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Jake on 7/16/2015.
 */
public class VolunteerDataSource {

    //jdbc:sqlserver://[serverName[\instanceName][:portNumber]][;property=value[;property=value]]


    public VolunteerDataSource() {

        PropertyLoader propertyLoader = new PropertyLoader();
//        String url = propertyLoader.getDbUrl();
//        String dbName = propertyLoader.getDbName();

        try {
//            Connection connection = DriverManager.getConnection("jdbc:sqlserver://" + url + "\\" + dbName);

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost");
            if(connection.isValid(1)) {
                System.out.println("The connection is valid");
            }



        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.out.println("Could not load the database");
        }


    }


    public static void main(String[] args) {
        new VolunteerDataSource();
    }
}
