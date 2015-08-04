package us.wasatchsystems.ccs.controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import us.wasatchsystems.ccs.models.Login;
import us.wasatchsystems.ccs.models.Volunteer;

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

public class LoginController {





    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(ModelMap modelMap) {
        return new ModelAndView("loginPage", "command", new Login());
    }




    @RequestMapping(value = "/loginError", method = RequestMethod.GET)
    public String loginError(ModelMap modelMap) {
        modelMap.addAttribute("error", "true");
        return "loginPage";
    }





}
