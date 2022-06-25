package com.example.finalprojekt.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contact implements Serializable {

    private String phoneNumber;
    private List<String> emailAddressesList = new ArrayList<>();

    public Contact(String phoneNumber, String... emailAddress) {
        setPhoneNumber(phoneNumber);
        emailAddressesList.addAll(Arrays.asList(emailAddress));
    }


    public String toString() {
        if (emailAddressesList.size() > 1) {
            return "phone number: " + phoneNumber + " emails: " + emailAddressesList;
        } else if (emailAddressesList.size() == 1) {
            return "phone number: " + phoneNumber + " email: " + emailAddressesList;
        }
        return "phone number: " + phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getEmailAddressesList() {
        return emailAddressesList;
    }

    public void setEmailAddressesList(List<String> emailAddressesList) {
        this.emailAddressesList = emailAddressesList;
    }
}
