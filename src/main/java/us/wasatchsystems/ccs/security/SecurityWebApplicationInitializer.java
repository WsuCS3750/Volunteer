package us.wasatchsystems.ccs.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created by Jake on 8/6/2015.
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {


    public SecurityWebApplicationInitializer() {
        super(SecurityConfig.class);
    }




}
