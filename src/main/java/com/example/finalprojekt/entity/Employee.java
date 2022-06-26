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

    public static List<Employee> ALL_EMPLOYEES = new ArrayList<>();

    private List<Shift> shiftListEmployee = new ArrayList<>();
    private List<Shift> shiftListEmployeeSubset = new ArrayList<>();

    /**
     * method to calculate workExperience in company
     * @param dateOfEmployment
     * @return jobSeniority
     */
    private int calculateWorkExperience(LocalDate dateOfEmployment) {
        return jobSeniority = (int) ChronoUnit.MONTHS.between(dateOfEmployment, LocalDate.now());
    }

    /**
     * mathod to add Shift for employee
     * @param employeeShift
     */
    //SUBSET
    public void addShiftForEmployee(Shift employeeShift) {
        shiftListEmployee.add(employeeShift);
        employeeShift.addEmployeeFoShift(this);
    }

    /**
     * @param employeeShiftSubset
     */
    //SUBSET
    public void addShiftSubset(Shift employeeShiftSubset) {
        if (shiftListEmployee.contains(employeeShiftSubset)) {
            shiftListEmployeeSubset.add(employeeShiftSubset);
            employeeShiftSubset.addShiftForEmployeeSubset(this);
        } else {
            throw new IllegalArgumentException("odrzędny argument nie jest w nadrzędnej relacji");
        }
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
        ALL_EMPLOYEES.add(this);
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
        ALL_EMPLOYEES.add(this);
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
