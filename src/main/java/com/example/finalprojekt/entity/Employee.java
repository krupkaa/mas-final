package com.example.finalprojekt.entity;

import com.example.finalprojekt.enums.EmployeeType;
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
    //DZIEDZICZENIE DYNAMICZNE
    private EmployeeType employeeType;

    public static List<Employee> ALL_EMPLOYEES = new ArrayList<>();

    private List<Shift> shiftListEmployee = new ArrayList<>();
    private List<Shift> shiftListEmployeeSubset = new ArrayList<>();

    //OVERLAPPING
    private Mechanic mechanic;
    private Driver driver;
    private RentalOwner owner;


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

    //OVERLAPPING
    public boolean isMechanic() {
        if (this.mechanic != null) {
            return true;
        }
        return false;
    }

    public boolean isDriver() {
        if (this.driver != null) {
            return true;
        }
        return false;
    }

    public boolean isOwner() {
        if (this.owner != null) {
            return true;
        }
        return false;
    }

    public void startBeingMechanic() {
        if (!isMechanic()) {
            this.mechanic = new Mechanic(this);
            employeeType = EmployeeType.MECHANIC;
        }
    }

    public void startBeingDriver() {
        if (!isDriver()) {
            this.driver = new Driver(this);
            employeeType = EmployeeType.DRIVER;
        }
    }

    public void startBeingOwner() {
        if (!isOwner()) {
            this.owner = new RentalOwner(this);
            employeeType = EmployeeType.OWNER;
        }
    }

    public void stopBeingMechanic() {
        if (isMechanic()) {
            this.mechanic = null;
        }
    }

    public void stopBeingDriver() {
        if (isDriver()) {
            this.driver = null;
        }
    }

    /**
     * constructor when employee has got a second name
     * @param name
     * @param secondName
     * @param surname
     * @param contact
     * @param dateOfEmployment
     * @param previousWorkplaceList
     */
    public Employee(String name, String secondName, String surname, Contact contact, LocalDate dateOfEmployment, List<String> previousWorkplaceList, EmployeeType employeeType) {
        super(name, secondName, surname, contact);
        setDateOfEmployment(dateOfEmployment);
        this.jobSeniority = calculateWorkExperience(dateOfEmployment);
        setJobSeniority(jobSeniority);
        this.previousWorkplaceList = previousWorkplaceList;
        ALL_EMPLOYEES.add(this);
        if(employeeType == EmployeeType.DRIVER) {
            this.driver = new Driver(this);
            this.mechanic = null;
            this.owner = null;
        } else if (employeeType == EmployeeType.MECHANIC) {
            this.driver = null;
            this.mechanic = new Mechanic(this);
            this.owner = null;
        } else if (employeeType == EmployeeType.OWNER) {
            this.driver = null;
            this.mechanic = null;
            this.owner = new RentalOwner(this);
        } else {
            this.driver = null;
            this.mechanic = null;
            this.owner =null;
            employeeType = EmployeeType.NOT_SPECIFIED;
        }
    }


    /**
     * construcotr when employee doesn't have a second name
     * @param name
     * @param surname
     * @param contact
     * @param dateOfEmployment
     * @param previousWorkplaceList
     */
    public Employee(String name, String surname, Contact contact, LocalDate dateOfEmployment, List<String> previousWorkplaceList) {
        super(name, surname, contact);
        this.dateOfEmployment = dateOfEmployment;
        this.jobSeniority = calculateWorkExperience(dateOfEmployment);
        this.previousWorkplaceList = previousWorkplaceList;
        ALL_EMPLOYEES.add(this);
        if(employeeType == EmployeeType.DRIVER) {
            this.driver = new Driver(this);
            this.mechanic = null;
            this.owner = null;
        } else if (employeeType == EmployeeType.MECHANIC) {
            this.driver = null;
            this.mechanic = new Mechanic(this);
            this.owner = null;
        } else if (employeeType == EmployeeType.OWNER) {
            this.driver = null;
            this.mechanic = null;
            this.owner = new RentalOwner(this);
        } else {
            this.driver = null;
            this.mechanic = null;
            this.owner =null;
            employeeType = EmployeeType.NOT_SPECIFIED;
        }

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
