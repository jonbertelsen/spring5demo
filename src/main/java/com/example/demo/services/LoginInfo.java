package com.example.demo.services;

import org.springframework.stereotype.Service;

/**
 * Created by jonb on 10/08/17.
 */
@Service
public class LoginInfo implements LoginInterface {

    private String loginName;
    private String password;

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginName(){
        return this.loginName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    @Override
    public String ShowLogin() {
        return getLoginName() + ", " + getPassword();
    }
}
