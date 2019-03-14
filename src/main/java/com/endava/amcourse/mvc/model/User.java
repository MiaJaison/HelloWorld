package com.endava.amcourse.mvc.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
public class User {

    private int id;
    private String username;
    private int age;
    private String password;
    private Gender gender;

    public User() {
    }

    public User(int id, String username, int age, String password, Gender gender) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.password = password;
        this.gender = gender;
    }
    public User( String username, int age, String password, Gender gender) {
        this.username = username;
        this.age = age;
        this.password = password;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
