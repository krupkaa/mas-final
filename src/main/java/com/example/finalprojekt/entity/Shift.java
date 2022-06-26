package com.example.finalprojekt.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shift {

    private LocalDate startTime;
    private LocalDate endTime;
    private List<Employee> employeeListInShift = new ArrayList();
    private List<Employee> employeeListInShiftSubset = new ArrayList<>();


    public Shift(LocalDate startTime, LocalDate endTime) {
        setStartTime(startTime);
        setEndTime(endTime);
    }


    public void addEmployeeFoShift(Employee employee) {
        this.employeeListInShift.add(employee);
    }

    public void addShiftForEmployeeSubset(Employee employee) {
        employeeListInShiftSubset.add(employee);
    }

    public LocalDate getStartTime() {
        return startTime;
    }
    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }
    public LocalDate getEndTime() {
        return endTime;
    }
    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }
    public List<Employee> getEmployeeListInShift() {
        return employeeListInShift;
    }
    public void setEmployeeListInShift(List<Employee> employeeListInShift) {
        this.employeeListInShift = employeeListInShift;
    }
    public List<Employee> getEmployeeListInShiftSubset() {
        return employeeListInShiftSubset;
    }
    public void setEmployeeListInShiftSubset(List<Employee> employeeListInShiftSubset) {
        this.employeeListInShiftSubset = employeeListInShiftSubset;
    }

}
