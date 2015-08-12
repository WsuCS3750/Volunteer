package us.wasatchsystems.ccs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Jake on 8/11/2015.
 *
 *
 *
 *
 *
 */

@Controller
public class TimeController {



    @RequestMapping(value = "/clock", method = RequestMethod.GET)
    public ModelAndView clock(ModelMap modelMap) {





        return new ModelAndView("/clock/clock");
    }



    @RequestMapping(value = "/clock/show_clock", method = RequestMethod.GET)
    public ModelAndView showPickUser(ModelMap modelMap) {



        return new ModelAndView("/clock/show_clock");
    }



    @RequestMapping(value = "pickuser", method = RequestMethod.POST)
    public ModelAndView pickUser(ModelMap modelMap) {




        return new ModelAndView("/clock/clock");
    }


}
