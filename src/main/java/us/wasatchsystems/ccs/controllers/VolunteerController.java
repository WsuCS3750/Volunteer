package us.wasatchsystems.ccs.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import us.wasatchsystems.ccs.datasource.VolunteerDataSource;
import us.wasatchsystems.ccs.models.Volunteer;

/**
 * Created by Jake on 7/12/2015.
 */


@Controller
@RequestMapping("/")
public class VolunteerController {

    private static final Logger log = LogManager.getLogger(VolunteerController.class);


    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public ModelAndView volunteer() {
        return new ModelAndView("signup", "command", new Volunteer());
    }



    @RequestMapping(value = "/addVolunteer", method = RequestMethod.POST)
    public String addVolunteer(@ModelAttribute("SpringWeb")Volunteer volunteer,
                             ModelMap model) {


        model.addAttribute("firstName", volunteer.getFirstName());
        model.addAttribute("lastName", volunteer.getLastName());
        model.addAttribute("dob", volunteer.getDob());


        VolunteerDataSource.addVolunteer(volunteer);


        log.info("Successfully inserted into the database");



        return "result";
    }





}
