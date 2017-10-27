package com.example.demo.controllers;

import com.example.demo.models.LoginInfo;
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

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("login", new LoginInfo());
        return "login";
    }

    @PostMapping("/loginresult")
    public String loginResultSubmit(@ModelAttribute("login") LoginInfo login, Model model) {
        model.addAttribute("login", login);
        return "loginresult";
    }


}
