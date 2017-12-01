package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by jonb on 01/12/17.
 */
@Service
public class LoginLog {

    private final HashMap<String,LoginInfo> users;

    LoginLog()
    {
        users = new HashMap<>();
    }

    public void addUser(LoginInfo user)
    {
        users.put(user.getLoginName(),user);
    }

    public LoginInfo getUser (String userName)
    {
        return users.get(userName);
    }

    public boolean isUserLoggedIn(String userName)
    {
        return users.containsKey(userName);
    }

    public HashMap<String,LoginInfo> getUsers()
    {
        return users;
    }

}
