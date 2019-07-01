package com.toybox.trab03_dcc193.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * HomeController
 */
@Controller
public class HomeController {

    @RequestMapping({ "", "home", "index" })
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("teste", "Olá aliens");
        return mv;
    }
}