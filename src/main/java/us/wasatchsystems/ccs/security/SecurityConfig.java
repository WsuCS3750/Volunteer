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

/**
 * Created by Jake on 8/6/2015.
 *
 *
 *
 *
 */



//
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("password")
                .roles("USER")



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

                .anyRequest().authenticated()
                .and()
                .formLogin()
//                .loginPage("/login")          // enable this to add the custom login form
                .permitAll()
                .and()

                .logout()


//                .logoutUrl("j_spring_security_logout")
//                .addLogoutHandler(logoutHandler)
//                .logoutSuccessUrl("/logoutPage")



                .permitAll()


        ;
    }




}
