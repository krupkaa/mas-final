package com.example.finalprojekt.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contact implements Serializable {

    private String phoneNumber;
    private List<String> emailAddressesList = new ArrayList<>();


    /**
     * constructor with parameters
     * @param phoneNumber
     * @param emailAddress
     */
    public Contact(String phoneNumber, String... emailAddress) {
        setPhoneNumber(phoneNumber);
        emailAddressesList.addAll(Arrays.asList(emailAddress));
    }


    /**
     * override toString method
     * @return string
     */
    public String toString() {
        if (emailAddressesList.size() > 1) {
            return "phone number: " + phoneNumber + " emails: " + emailAddressesList;
        } else if (emailAddressesList.size() == 1) {
            return "phone number: " + phoneNumber + " email: " + emailAddressesList;
        }
        return "phone number: " + phoneNumber;
    }

    /**
     * @return phoneNumber
     */
    //GETTERY I SETTERY
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return List<String>
     */
    public List<String> getEmailAddressesList() {
        return emailAddressesList;
    }

    /**
     * @param emailAddressesList
     */
    public void setEmailAddressesList(List<String> emailAddressesList) {
        this.emailAddressesList = emailAddressesList;
    }
}
