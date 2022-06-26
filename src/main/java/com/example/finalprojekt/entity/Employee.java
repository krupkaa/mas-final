package com.example.finalprojekt.entity;

import com.example.finalprojekt.enums.PersonType;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;


public class Employee extends Person {

    private LocalDate dateOfEmployment;
    //ATRYBUT WYLICZENIOWY/POCHODNY
    private int jobSeniority;
    private List<String> previousWorkplaceList = new ArrayList<>();
    //ATRYBUT KLASOWY
    private static double MINIMUM_SALARY = 3000.0;

    private int calculateWorkExperience(LocalDate dateOfEmployment) {
        return jobSeniority = (int) ChronoUnit.MONTHS.between(dateOfEmployment, LocalDate.now());
    }



    /**
     * constructor when employee has got a second name
     * @param name
     * @param secondName
     * @param surname
     * @param contact
     * @param personType
     * @param dateOfEmployment
     * @param previousWorkplaceList
     */
    public Employee(String name, String secondName, String surname, Contact contact, PersonType personType, LocalDate dateOfEmployment, List<String> previousWorkplaceList) {
        super(name, secondName, surname, contact, personType);
        setDateOfEmployment(dateOfEmployment);
        this.jobSeniority = calculateWorkExperience(dateOfEmployment);
        setJobSeniority(jobSeniority);
        this.previousWorkplaceList = previousWorkplaceList;
    }


    /**
     * construcotr when employee doesn't have a second name
     * @param name
     * @param surname
     * @param contact
     * @param personType
     * @param dateOfEmployment
     * @param previousWorkplaceList
     */
    public Employee(String name, String surname, Contact contact, PersonType personType, LocalDate dateOfEmployment, List<String> previousWorkplaceList) {
        super(name, surname, contact, personType);
        this.dateOfEmployment = dateOfEmployment;
        this.jobSeniority = calculateWorkExperience(dateOfEmployment);
        this.previousWorkplaceList = previousWorkplaceList;
    }


    /**
     * @return dateOfEmployment
     */
    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    /**
     * @param dateOfEmployment
     */
    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    /**
     * @return jobSeniority
     */
    public int getJobSeniority() {
        return jobSeniority;
    }

    /**
     * @param jobSeniority
     */
    public void setJobSeniority(int jobSeniority) {
        this.jobSeniority = jobSeniority;
    }

    /**
     * @return previousWorkplaceList
     */
    public List<String> getPreviousWorkplaceList() {
        return previousWorkplaceList;
    }

    /**
     * @param previousWorkplaceList
     */
    public void setPreviousWorkplaceList(List<String> previousWorkplaceList) {
        this.previousWorkplaceList = previousWorkplaceList;
    }

    /**
     * @return MINIMUM_SALARY
     */
    public static double getMinimumSalary() {
        return MINIMUM_SALARY;
    }

    /**
     * @param minimumSalary
     */
    public static void setMinimumSalary(double minimumSalary) {
        MINIMUM_SALARY = minimumSalary;
    }
}
