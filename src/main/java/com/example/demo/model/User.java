package com.example.demo.model;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private MentorScore mentorScore;
    private Field field;
    private String category;

    public User(String firstName, String lastName, String email, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        mentorScore = null;
        category = "";
    }

    //MODIFIES: this
    //EFFECTS: set the user's field category based on the field question answers
    public void addField(int s1, int s2, int s3, int s4) {
        field = new Field(s1, s2, s3, s4);
        category = field.assignCategory(field.getIsArts(), field.getIsPractical());
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

}
