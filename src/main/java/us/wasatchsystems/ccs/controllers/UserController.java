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
 *
 */


@Controller
@RequestMapping("/")
public class UserController {

    private static final Logger log = LogManager.getLogger(UserController.class);


    @RequestMapping(value = "/public/signup", method = RequestMethod.GET)
    public ModelAndView volunteer() {

        return new ModelAndView("/public/signup", "command", new User());
    }



    Map<Long, String> volunteerMap = new HashMap<Long, String>();

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
