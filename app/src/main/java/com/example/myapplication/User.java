package com.example.myapplication;

public class User {


    private String password;
    private String email;
    private String username;
    public static User loggedInUser = null;
    private int score;


    public User(String email, String password, int score, String username) {
        this.email = email;
        this.password = password;
        this.score = score;
        this.username = username;

    }

    public int getScore() {
        return score;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
