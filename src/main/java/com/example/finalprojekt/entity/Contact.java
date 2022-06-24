package com.example.finalprojekt.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contact implements Serializable {

    private String phoneNumber;
    private List<String> emailAddressesList = new ArrayList<>();

    public Contact(String phoneNumber, String... emailAddress) {
        this.phoneNumber = phoneNumber;
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

}
