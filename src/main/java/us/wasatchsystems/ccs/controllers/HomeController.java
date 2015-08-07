package us.wasatchsystems.ccs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Jake on 7/12/2015.
 *
 *
 *
 */


@Controller
@RequestMapping("/")
public class HomeController {



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("message", "Hello world!");

        return "hello";

    }


    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String showAbout(ModelAndView modelAndView) {
        return "about";
    }



    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String showContact(ModelAndView modelAndView) {
        return "contact";
    }







}
