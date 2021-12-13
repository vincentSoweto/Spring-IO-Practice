package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/// @Controller class file to redirect the Request URI to HTML file −
@Controller
public class WebController {
    @RequestMapping(value="/index")
    public String index(){
        return "index";
    }
}
