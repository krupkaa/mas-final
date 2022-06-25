package com.example.finalprojekt.entity;

import com.example.finalprojekt.enums.PersonType;
import lombok.SneakyThrows;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Employee extends Person {

    private int employeeId;
    private LocalDate dateOfEmployment;
    private int jobSeniority;
    private List<String> previousWorkplaceList = new ArrayList<>();
    private static double MINIMUM_SALARY = 3000.0;


    private static Map<Integer, Employee> EMPLOYEESMAP = new HashMap<>();

    public Employee(String name, String secondName, String surname, Contact contact, PersonType personType) {
        super(name, secondName, surname, contact, personType);
    }

    public Employee(Long id, String s, String name, String surname, Contact contact, PersonType personType) {
        super(id, s, name, surname, contact, personType);
    }


//    public Employee(String secondName, String name,String surname, Contact contact, PersonType personType,
//                    int employeeId, LocalDate dateOfEmployment, List<String> previousWorkplaceList) {
//        super(name, secondName, surname, contact, personType);
//        setEmployeeId(employeeId);
//        setDateOfEmployment(dateOfEmployment);
//        setJobSeniority(jobSeniority);
//        setPreviousWorkplaceList(previousWorkplaceList);
//    }

//    public Employee(String name, String surname, Contact contact, PersonType personType,
//                    int employeeId, LocalDate dateOfEmployment, List<String> previousWorkplaceList) {
//        super(name, surname, contact, personType);
//        setEmployeeId(employeeId);
//        setDateOfEmployment(dateOfEmployment);
//        setJobSeniority(jobSeniority);
//        setPreviousWorkplaceList(previousWorkplaceList);
//    }




    public int getJobSeniority() {
        return jobSeniority = LocalDate.now().getMonthValue() - dateOfEmployment.getMonthValue();
    }

    //unique
    public static boolean findEmployee(int id) {
        return EMPLOYEESMAP.containsKey(id);
    }


    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
        }


    public int getEmployeeId() {
        return employeeId;
    }


    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public void setJobSeniority(int jobSeniority) {
        this.jobSeniority = jobSeniority;
    }

    public List<String> getPreviousWorkplaceList() {
        return previousWorkplaceList;
    }

    public void setPreviousWorkplaceList(List<String> previousWorkplaceList) {
        this.previousWorkplaceList = previousWorkplaceList;
    }

    public static double getMinimumSalary() {
        return MINIMUM_SALARY;
    }

    public static void setMinimumSalary(double minimumSalary) {
        MINIMUM_SALARY = minimumSalary;
    }

    public static Map<Integer, Employee> getEMPLOYEESMAP() {
        return EMPLOYEESMAP;
    }

    public static void setEMPLOYEESMAP(Map<Integer, Employee> EMPLOYEESMAP) {
        Employee.EMPLOYEESMAP = EMPLOYEESMAP;
    }
}
