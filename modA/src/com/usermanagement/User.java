package com.usermanagement;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getUserInfo() {
        return "User: " + name + ", Age: " + age;
    }
}
