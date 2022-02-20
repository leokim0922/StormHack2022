package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // tells Hibernate to make a table out of this class.
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    @Id
    @GeneratedValue
    private int mentorScoreId;
    private String category;

    public User() {

    }

    public User(String firstName, String lastName, String email, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        category = "art";
    }

    //MODIFIES: this
    //EFFECTS: set the user's field category based on the field question answers
    public String addField(int s1, int s2, int s3, int s4) {
        Field field = new Field(s1, s2, s3, s4);
        category = field.assignCategory(field.getIsArts(), field.getIsPractical());
        return category;
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

    public int getMentorScoreId() {
        return mentorScoreId;
    }

}
