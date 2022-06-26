package com.example.finalprojekt.entity;

public class Driver {

    private Employee employee;

    public Driver(Employee employee) {
        if (employee != null) {
            this.employee = employee;
        }
    }

    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
