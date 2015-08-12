package us.wasatchsystems.ccs.datasource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Jake on 7/16/2015.
 *
 *
 *
 * Used to load the properties from the file so they can be use throughout the application,
 * prevents having to hardcode the parameters
 *
 *
 *
 * NOTE: This is very time consuming reading and writing from the file,
 * you may want to statically load the data if it is not loaded
 *
 * consider using a static hash map to match the properties.
 *
 */


public class PropertyLoader {

    private static final Logger log = LogManager.getLogger(PropertyLoader.class);

    // The names of the properties
    public static final String SERVER_NAME = "serverName";
    public static final String DATABASE_NAME = "databaseName";
    public static final String USER_NAME = "userName";
    public static final String USER_PASSWORD = "userPassword";
    public static final String PORT = "port";



    // Properties from the class path resource application.properties
    Properties properties;


    /**
     * Setup the properties file so they can be accessed.
     */

    public PropertyLoader() {
        ClassPathResource propertiesResource = new ClassPathResource("application.properties");
        try {

            InputStream in;
            in = propertiesResource.getInputStream();
            properties = new Properties();
            properties.load(in);

            log.info("Successfully loaded the properties");

        } catch (IOException ioe) {
            ioe.printStackTrace();
            log.error("Error in loading the config file");
        }


    }



    public String getServerName() {
        return properties.getProperty(SERVER_NAME);
    }

    public String getDatabaseName() {
        return properties.getProperty(DATABASE_NAME);
    }

    public String getUserName() {
        return properties.getProperty(USER_NAME);
    }

    public String getUserPassword() {
        return properties.getProperty(USER_PASSWORD);
    }

    public int getPort() {
        return Integer.parseInt(properties.getProperty(PORT));
    }




    public static void main(String[] args) {
        PropertyLoader propertyLoader = new PropertyLoader();
        System.out.println(propertyLoader.getDatabaseName());
        System.out.println(propertyLoader.getServerName());
        System.out.println(propertyLoader.getUserName());
        System.out.println(propertyLoader.getUserPassword());
        System.out.println(propertyLoader.getPort());


    }














}
