package us.wasatchsystems.ccs.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by Jake on 7/22/2015.
 *
 *
 *
 *
 */


public class Bootstrap implements WebApplicationInitializer {

    private static final Logger log = LogManager.getLogger(Bootstrap.class);


    /**
     * This method is called when the application is first started.
     * @param servletContext
     * @throws ServletException
     */


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        log.info("Bootstrap class called");


    }
}
