package com.example.finalprojekt.entity;

public class RentalOwner {

    private Employee employee;

    public RentalOwner(Employee employee) {
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
