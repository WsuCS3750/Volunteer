package us.wasatchsystems.ccs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Jake on 7/12/2015.
 *
 * This page handles all the basic functionality of the home page,
 *
 * Contains many non-secure pages such as home, about, and contact
 * that can be accessed by the rest of the world.
 *
 */


@Controller
@RequestMapping("/")
public class HomeController {


    /**
     * Sets the basic home page for the website.
     * @param model used to hold all the attributes.
     * @return the string containing the page to direct to
     *
     *  @Note this may also be done with a View or a ModelAndView depending on your requirements
     *
     */

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("message", "Hello world!");

        return "/public/hello";

    }


    /**
     * Shows the basic about page for the website.
     * @param modelAndView holds the webpage and a param and another field
     * @return String url to the page (local)
     */

    @RequestMapping(value = "/public/about", method = RequestMethod.GET)
    public String showAbout(ModelAndView modelAndView) {
        return "/public/about";
    }


    /**
     * Shows the contact page for the website.
     * @param modelAndView Model and view for holding stuff
     * @return path to the page.
     */

    @RequestMapping(value = "/public/contact", method = RequestMethod.GET)
    public String showContact(ModelAndView modelAndView) {
        return "/public/contact";
    }







}
