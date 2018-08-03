package com;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2017/7/19 0019.
 */
public class UserAction extends ActionSupport {

    private String name;
    private int age;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String execute() throws Exception {
        return super.execute();
    }
}
