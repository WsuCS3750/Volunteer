package us.wasatchsystems.ccs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Jake on 7/12/2015.
 *
 *
 *
 */


@Controller
@RequestMapping("/")


public class HomeController {



    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("message", "Hello world!");
        return "hello";



    }




}
