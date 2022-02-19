package com.example.demo.model;

import java.util.ArrayList;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private MentorScore mentorScore;
    private ArrayList<Field> interests;
    private ArrayList<Field> aptitudes;

    public User(String firstName, String lastName, String email, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        mentorScore = null;
        interests = new ArrayList<>();
        aptitudes = new ArrayList<>();
    }

    // MODIFIES: this
    // EFFECTS: adds given item to interests list
    public void addInterests(Field field) {
        interests.add(field);
    }

    // MODIFIES: this
    // EFFECTS: adds given item to aptitudes list.
    public void addAptitudes(Field field) {
        aptitudes.add(field);
    }

    // MODIFIES: this
    // EFFECTS: remove given item to interests list
    public boolean removeInterests(Field field) {
        return interests.remove(field);
    }

    // MODIFIES: this
    // EFFECTS: adds given item to aptitudes list.
    public boolean removeAptitudes(Field field) {
        return aptitudes.remove(field);
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public MentorScore getMentorScore() {
        return mentorScore;
    }

    public ArrayList<Field> getInterests() {
        return interests;
    }

    public ArrayList<Field> getAptitudes() {
        return aptitudes;
    }

}
