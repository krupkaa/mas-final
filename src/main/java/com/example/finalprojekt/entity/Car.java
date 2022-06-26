package com.example.finalprojekt.entity;

import com.example.finalprojekt.enums.CarStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Car {

    private String brand;
    private String model;
    private String registrationNumber;
    private int seats;
    private double priceRentForDay;
    private CarStatus carStatus;
    private int mileage;


    private static List<Car> ALL_CARS = new ArrayList<>();


    /**
     * construktor with all parameters
     * @param brand
     * @param model
     * @param registrationNumber
     * @param seats
     * @param priceRentForDay
     * @param carStatus
     * @param mileage
     */
    public Car(String brand, String model, String registrationNumber, int seats, double priceRentForDay, CarStatus carStatus, int mileage) {
        setBrand(brand);
        setModel(model);
        setRegistrationNumber(registrationNumber);
        setSeats(seats);
        setPriceRentForDay(priceRentForDay);
        setCarStatus(carStatus);
        setMileage(mileage);
        ALL_CARS.add(this);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getPriceRentForDay() {
        return priceRentForDay;
    }

    public void setPriceRentForDay(double priceRentForDay) {
        this.priceRentForDay = priceRentForDay;
    }

    public CarStatus getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }



    @Override
    public String toString() {
        return
                brand + ';' +
                model + ';' +
                registrationNumber + ';' +
                seats + ';' +
                priceRentForDay + ';' +
                carStatus + ';' +
                mileage;

    }
}
