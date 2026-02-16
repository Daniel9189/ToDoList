package com.danielrocha.todolist.user;

public class UserModel {
    
    
    private String username;
    private String name;
    private String password;

    /*Getters e Setters*/

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }


}

