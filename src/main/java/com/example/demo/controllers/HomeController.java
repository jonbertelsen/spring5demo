package com.example.demo.controllers;

import com.example.demo.models.LoginInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by jonb on 10/08/17.
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

}
