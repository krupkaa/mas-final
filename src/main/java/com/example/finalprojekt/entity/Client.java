package com.example.finalprojekt.entity;

import com.example.finalprojekt.enums.PersonType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Client extends Person {


    private List<String> drivingLicenseCategoryList = new ArrayList<>();
    private double currentDeposit;
    private List<Reservation> reservationList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "issued_opinion_id")
    private Opinion issuedOpinion;


    public Client(Long id, String name, String secondName, String surname, Contact contact,
                  PersonType personType, double currentDeposit, String... drivingLicenseCategory) {
        super(id, name, secondName, surname, contact, personType);
        setCurrentDeposit(currentDeposit);
        drivingLicenseCategoryList.addAll(Arrays.asList(drivingLicenseCategory));
    }

    public Opinion getIssuedOpinion() {
        return issuedOpinion;
    }

    public List<String> getDrivingLicenseCategoryList() {
        return drivingLicenseCategoryList;
    }

    public void setDrivingLicenseCategoryList(List<String> drivingLicenseCategoryList) {
        this.drivingLicenseCategoryList = drivingLicenseCategoryList;
    }

    public double getCurrentDeposit() {
        return currentDeposit;
    }

    public void setCurrentDeposit(double currentDeposit) {
        this.currentDeposit = currentDeposit;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public void setIssuedOpinion(Opinion issuedOpinion) {
        this.issuedOpinion = issuedOpinion;
    }
}
