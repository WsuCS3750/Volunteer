package us.wasatchsystems.ccs.controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import us.wasatchsystems.ccs.models.Login;
import us.wasatchsystems.ccs.models.Volunteer;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Jake on 8/3/2015.
 *
 *
 * The basic login controller for the website.
 *
 *
 *
 */


@Controller
@RequestMapping("/")
public class LoginController {

    private Logger log = LogManager.getLogger(LoginController.class);



    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(ModelMap modelMap) {
        return new ModelAndView("loginPage", "command", new Login());
    }




    @RequestMapping(value = "/loginError", method = RequestMethod.GET)
    public String loginError(ModelMap modelMap) {
        modelMap.addAttribute("error", "true");
        return "loginPage";
    }


    /**
     * Handled automatically, will modify this to check within the database later.
     */
//
//    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
//    public String doLogin(@ModelAttribute("SpringWeb")Login login,
//                          ModelMap modelMap) {
//
//        modelMap.addAttribute("username", login.getUserName());
//        modelMap.addAttribute("password", login.getPassword());
//
//
//        return "result";
//
//    }


    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String doLogout(ModelMap modelMap) {
        // do logout

        SecurityContextHolder.getContext().setAuthentication(null);

        // put you have logged out here


        return "/logoutPage";
    }





    @RequestMapping(value = "/showLogout", method = RequestMethod.GET)
    public String showContact(ModelAndView modelAndView) {
        return "admin/admin";
    }






    public void manualLogout() {
        SecurityContextHolder.getContext().setAuthentication(null);
    }

    public void manualLogin(HttpServletRequest request, String u, String p) {
//        UsernamePasswordAuthenticationToken token =
//                new UsernamePasswordAuthenticationToken(u, p);
//        token.setDetails(new WebAuthenticationDetails(request));
//        Authentication auth = authenticationProvider.authenticate(token);
//        SecurityContextHolder.getContext().setAuthentication(auth);
    }


}
