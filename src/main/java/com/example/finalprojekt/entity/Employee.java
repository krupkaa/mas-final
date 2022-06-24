package com.example.finalprojekt.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Employee extends Person {

    private LocalDate dateOfBirth;
    private int age;
    private LocalDate dateOfEmployment;
    private int jobSeniority;
    private List<String> previousWorkplaceList = new ArrayList<>();
    private static double MINIMUM_SALARY = 3000.0;

    public int getAge() {
        return age = LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public int getJobSeniority() {
        return jobSeniority = LocalDate.now().getMonthValue() - dateOfEmployment.getMonthValue();
    }


}
