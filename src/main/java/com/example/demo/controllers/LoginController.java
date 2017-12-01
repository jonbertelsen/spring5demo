package com.example.demo.controllers;

import com.example.demo.services.LoginInfo;
import com.example.demo.services.LoginInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by jonb on 27/10/17.
 */

@Controller
public class LoginController {

    private LoginInterface loginInfo;

    @Autowired
    public LoginController(LoginInterface loginInfo) {
        this.loginInfo = loginInfo;
    }

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("login",loginInfo);
        return "login";
    }

    @PostMapping("/loginresult")
    public String loginResultSubmit(@ModelAttribute("login") LoginInfo login) {
        return "loginresult";
    }

}
