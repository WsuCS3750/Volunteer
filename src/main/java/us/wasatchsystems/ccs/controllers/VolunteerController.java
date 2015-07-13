package us.wasatchsystems.ccs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import us.wasatchsystems.ccs.models.Volunteer;

/**
 * Created by Jake on 7/12/2015.
 */


@Controller
@RequestMapping("/")
public class VolunteerController {


    @RequestMapping(value = "/volunteer", method = RequestMethod.GET)
    public ModelAndView volunteer() {
        return new ModelAndView("volunteer", "command", new Volunteer());
    }



    @RequestMapping(value = "/addVolunteer", method = RequestMethod.POST)
    public String addVolunteer(@ModelAttribute("SpringWeb")Volunteer volunteer,
                             ModelMap model) {


        model.addAttribute("firstName", volunteer.getFirstName());
        model.addAttribute("lastName", volunteer.getLastName());
        model.addAttribute("dob", volunteer.getDob());






        return "result";
    }





}
