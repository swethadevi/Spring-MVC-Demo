package com.stackroute.controller;

import com.stackroute.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    //root student.jsp login form
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }
    //Submitted form details result.jsp page
    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb")Student student, ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("password", student.getPassword());
        return "result";
    }

    //simple index.jsp page redirection
    @RequestMapping(value = "/index")
    public String greeting(ModelMap map){
        map.addAttribute("greeting","Welcome to Stackroute!!!");
        return "index";
    }


    //simple java jsp url mapping
    @RequestMapping(value = "/programming")
    public String greeting1(ModelMap map) {
        map.addAttribute("program", "Welcome to the World of Programming\n JAVA \n C Programming \n Python \n Web \n Angular ");
        return "programming";
    }

    //jsp url mapping
    @RequestMapping(value = "/listing")
    public String list(ModelMap map) {
        map.addAttribute("list", "List of the Boeing  Defence Products");
        return "listing";
    }
}

