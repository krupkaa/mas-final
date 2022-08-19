package com.example.finalprojekt.entity;

import com.example.finalprojekt.enums.CarStatus;
import com.example.finalprojekt.enums.EngineType;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Car {

    private String brand;
    private String model;
    private String registrationNumber;
    private int seats;
    private double priceRentForDay;
    private CarStatus carStatus;
    private int mileage;


    public static List<Car> ALL_CARS = new ArrayList<>();
    private List<Repair> repairsHistory = new ArrayList<>();

    private EnumSet<EngineType> carTypeEnumSet;

    //ORDERED
    public void addRepair(Repair carRepair) {
        if (!repairsHistory.contains(carRepair)) {
            repairsHistory.add(carRepair);
        }
    }


    /**
     * construktor with all parameters
     *
     * @param brand
     * @param model
     * @param registrationNumber
     * @param priceRentForDay
     * @param carStatus
     */
    public Car(String brand, String model, String registrationNumber, double priceRentForDay, CarStatus carStatus) {
        setBrand(brand);
        setModel(model);
        setRegistrationNumber(registrationNumber);
        setPriceRentForDay(priceRentForDay);
        setCarStatus(carStatus);
        ALL_CARS.add(this);
    }

    /**
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return registrationNumber
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * @param registrationNumber
     */

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;

    }


    /**
     * @return seats
     */
    public int getSeats() {
        return seats;
    }

    /**
     * @param seats
     */
    public void setSeats(int seats) {
        this.seats = seats;
    }

    /**
     * @return priceRentForDay
     */
    public double getPriceRentForDay() {
        return priceRentForDay;
    }

    /**
     * @param priceRentForDay
     */
    public void setPriceRentForDay(double priceRentForDay) {
        this.priceRentForDay = priceRentForDay;
    }

    /**
     * @return carStatus
     */
    public CarStatus getCarStatus() {
        return carStatus;
    }

    /**
     * @param carStatus
     */
    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }

    /**
     * @return mileage
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * @param mileage
     */
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }


    /**
     * override toString
     *
     * @return String
     */
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
