package com.example.demo.controllers;

import com.example.demo.services.LoginInfo;
import com.example.demo.services.LoginInterface;
import com.example.demo.services.LoginLog;
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
    private LoginLog userList;

    @Autowired
    public LoginController(LoginInterface loginInfo, LoginLog userList) {
        this.loginInfo = loginInfo;
        this.userList = userList;
    }

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("login",loginInfo);
        return "login";
    }

    @PostMapping("/loginresult")
    public String loginResultSubmit(@ModelAttribute("login") LoginInfo login) {
        userList.addUser(login);
        return "loginresult";
    }

    @GetMapping("showuserlist")
    public String showUserList(Model model)
    {
        model.addAttribute("userList",userList.getUsers());
        return "showuserlist";
    }

}
