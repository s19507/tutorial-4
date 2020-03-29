package com.company;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String information;

    public User(String name, String lastName, String email, String password){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        information = "User account information";
    }
    public User(String email){
        this.email = email;
        information = "guest account information";
    }

    public void createUserFromGuest(String name, String lastName, String password){
        if(information == "guest account information"){
            this.name = name;
            this.lastName = lastName;
            this.password = password;
            information = "User account information";
        } else {
            System.out.println("This account already in use");
        }
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getInformation() {
        return information;
    }
}
