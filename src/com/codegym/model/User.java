package com.codegym.model;

public class User {
    private String account;
    private String pass;
    private String name;
    private String email;
    private int age;

    public User(String account, String pass, String name, String email, int age) {
        this.account = account;
        this.pass = pass;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public User() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
