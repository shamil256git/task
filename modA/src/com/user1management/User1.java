package com.user1management;

public class  User1 {
    private String name;
    private int age;

    public User1(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getUser1Info() {
        return "User1: " + name + ", Age: " + age;
    }
}

