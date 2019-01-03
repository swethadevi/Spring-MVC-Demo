package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String greeting(ModelMap map){
        map.addAttribute("greeting","Welcome to Stackroute!!!");
        return "index";

    }
    //simple java jsp url mapping
    @RequestMapping(value = "/programming")
    public String greeting1(ModelMap map){
        map.addAttribute("program","Welcome to the World of Programming\n JAVA \n C Programming \n Python \n Web \n Angular ");
        return "programming";
    }
    //jsp url mapping
    @RequestMapping(value = "/listing")
    public String list(ModelMap map){
        map.addAttribute("list","List of the Boeing  Defence Products");
        return "listing";
    }
}
