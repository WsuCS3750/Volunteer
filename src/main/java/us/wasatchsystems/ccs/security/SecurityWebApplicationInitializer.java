package us.wasatchsystems.ccs.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created by Jake on 8/6/2015.
 *
 *
 * Initialized the security for the application
 *
 * Anything that extends AbstractSecurityWebApplication will be called when
 * the site is first created
 *
 */

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {


    public SecurityWebApplicationInitializer() {
        super(SecurityConfig.class);
    }




}
