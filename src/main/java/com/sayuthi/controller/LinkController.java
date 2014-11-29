package com.sayuthi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LinkController {

    @RequestMapping(value = {"/", "/index", "/home"})
    public ModelAndView mainPage() {
        return new ModelAndView("home");
    }
}
