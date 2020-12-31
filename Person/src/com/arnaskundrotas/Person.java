package com.arnaskundrotas;

import java.awt.datatransfer.StringSelection;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    // SET
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public void setAge (int age) {
        this.age = age;
    }

    // GET

    public String getFirstName (){
        return firstName;
    }

    public String getLastName (){
        return lastName;
    }

    public int getAge (){
        if (age < 0 || age > 100) {
            return 0;
        }
        return age;
    }

    public boolean isTeen (){
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName (){
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        }
        if (lastName.isEmpty()) {
            return firstName;
        }

        if (firstName.isEmpty()) {
            return lastName;
        }

        return firstName + " " + lastName;
    }







}
