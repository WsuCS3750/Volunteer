package us.wasatchsystems.ccs.security;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.logout.CookieClearingLogoutHandler;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import us.wasatchsystems.ccs.datasource.LoadDatabase;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;

/**
 * Created by Jake on 8/6/2015.
 *
 *
 *
 *
 */



@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private Logger log = LogManager.getLogger(SecurityConfig.class);

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        DataSource dataSource = LoadDatabase.getDataSource();
        if(dataSource == null) {
            log.error("Unable to get the datasource");
        }
        else {
            log.error("Loaded the data source successfully");
        }




        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("select userName as username, password, (select 1) as enabled from volunteer.dbo.UserTable as users where userName = ?;")
                .authoritiesByUsernameQuery("select username, (select case when adminStatus = 'y' then 'ROLE_ADMIN' else 'ROLE_USER' END as varchar) as role from volunteer.dbo.UserTable as user_roles where username = ?;")
                ;





    }



    protected void configure(HttpSecurity http) throws Exception {

        LogoutHandler logoutHandler = new CookieClearingLogoutHandler("all");

        http
                .authorizeRequests()
                .antMatchers("/resources/**").permitAll()
                .antMatchers("/").permitAll()
                .antMatchers("/showLogout").permitAll()
                .antMatchers("/signup").permitAll()
                .antMatchers("/public/**").permitAll()              // permit all pages within the public folder.
                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")

                .anyRequest().authenticated()
                .and()
                .formLogin()
//                .loginPage("/login")          // enable this to add the custom login form
                .permitAll()
                .and()

                .logout()

//                        .logoutSuccessUrl("/public/")

//                .logoutUrl("j_spring_security_logout")
//                .addLogoutHandler(logoutHandler)
//                .logoutSuccessUrl("/logoutPage")



                .permitAll()

//                .and().exceptionHandling().accessDeniedPage("/public/loginError")


        ;
    }




}
