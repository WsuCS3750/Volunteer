package us.wasatchsystems.ccs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import us.wasatchsystems.ccs.datasource.UserDataSource;
import us.wasatchsystems.ccs.models.Login;
import us.wasatchsystems.ccs.models.User;

import java.util.List;

/**
 * Created by Jake on 8/6/2015.
 *
 *
 *
 * This controller is used to access all the basic pages used for the things the CCS reps need to use
 *
 *
 * @Note Must have admin privelages to access this part of the website
 *
 */

@Controller
@RequestMapping("/")
public class AdministrationController {





    /**
     * Show the management console for CCS reps
     * @param modelAndView the view
     * @return location of the jsp page
     */


//    @RequestMapping(value = "/admin/admin", method = RequestMethod.GET)
//    public String showAdminPage(ModelAndView modelAndView) {
//
//
//
//
//        return "/admin/admin";
//
//    }



    @RequestMapping(value = "/admin/admin", method = RequestMethod.GET)
    public ModelAndView showAdminPage(ModelAndView modelAndView) {
//        return new ModelAndView("/public/loginPage", "command", new Login());

        List<User> allUsers = UserDataSource.queryAll();

        String users = "";
        for(User u : allUsers) {
            users += u.toString();
        }


        modelAndView.addObject("allUsers", users);


        return new ModelAndView("/admin/admin", "allUsers", users);

    }




















}
