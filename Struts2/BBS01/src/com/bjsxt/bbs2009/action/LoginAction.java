package com.bjsxt.bbs2009.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2017/7/18 0018.
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    public String login() throws Exception{
        return SUCCESS;
    }
    public String loginInput() throws Exception{
        return INPUT;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
