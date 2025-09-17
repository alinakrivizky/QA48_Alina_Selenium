package com.shop.models;

public class UnregisteredUser {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;

    public UnregisteredUser setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UnregisteredUser setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UnregisteredUser setEmail(String email) {
        this.email = email;
        return this;
    }

    public UnregisteredUser setPassword(String password) {
        this.password = password;
        return this;
    }

    public UnregisteredUser setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
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

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstName+ '\'' +
                ", lastName='" + lastName + '\'' +
                ",email='" + email+ '\'' +
                ", password='" + password + '\'' +
                ", confirm='" + confirmPassword + '\'' ;
    }
}