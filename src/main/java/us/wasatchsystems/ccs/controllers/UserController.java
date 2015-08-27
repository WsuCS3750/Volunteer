package us.wasatchsystems.ccs.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import us.wasatchsystems.ccs.datasource.UserDataSource;
import us.wasatchsystems.ccs.models.User;

import java.util.*;

/**
 * Created by Jake on 7/12/2015.
 *
 *
 * Used to handle the functionality of the user
 * login, logout, success, failure, and create new user
 */


@Controller
@RequestMapping("/")
public class UserController {

    private static final Logger log = LogManager.getLogger(UserController.class);


    Map<Long, String> volunteerMap = new HashMap<Long, String>();



    /**
     * Shows the signup page
     * @return
     */

    @RequestMapping(value = "/public/signup", method = RequestMethod.GET)
    public ModelAndView volunteer() {

        return new ModelAndView("/public/signup", "command", new User());
    }


    /**
     * Handles the signup, putting the data into the database.
     *
     * @param user contains all the necessary info for a user
     * @param model
     * @return Redirect to the result page showing the volunteers info
     */
    @RequestMapping(value = "/public/addVolunteer", method = RequestMethod.POST)
    public String addVolunteer(@ModelAttribute("SpringWeb")User user,
                             ModelMap model) {


        // displays the input that was entered
        model.addAttribute("firstName", user.getFirstName());
        model.addAttribute("lastName", user.getLastName());
        model.addAttribute("dob", user.getDob());

        // insert into the database
        UserDataSource.addVolunteer(user);



        // default return
        return "result";
    }








}
