package com;

import com.opensymphony.xwork2.ActionSupport;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Administrator on 2017/7/20 0020.
 */
public class TestAction extends ActionSupport {
    private String name = "VinSpier";
    private int age = 23;
    private Date date;

    Point point;
    java.util.List<Point> ps;
    Map<String, Point> points;

    Map<String,String> users;
    Set<String> interests;

    @Override
    public String execute() throws Exception{
        return super.execute();
    }

    public List<Point> getPs() {
        return ps;
    }

    public Map<String, Point> getPoints() {
        return points;
    }

    public void setPs(List<Point> ps) {
        this.ps = ps;
    }

    public void setPoints(Map<String, Point> points) {
        this.points = points;
    }

    public Set<String> getInterests() {
        return interests;
    }

    public void setInterests(Set<String> interests) {
        this.interests = interests;
    }

    public Map<String, String> getUsers() {
        return users;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setUsers(Map<String, String> users) {
        this.users = users;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
