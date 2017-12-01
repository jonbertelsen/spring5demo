package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by jonb on 10/08/17.
 */

@Controller
public class HomeController {

    @GetMapping({"/",""})
    public String index(){

        return "index";
    }

}
