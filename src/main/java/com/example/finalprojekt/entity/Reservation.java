package com.example.finalprojekt.entity;

import com.example.finalprojekt.enums.ReservationStatus;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Reservation {

    private long id;
    private LocalDate startTime;
    private LocalDate endTime;
    private int days;
    private double pricePerDay;
    private double totalPrice;
    private ReservationStatus reservationStatus;

    private Car car;
    private Client client;

    private static List<Reservation> ALL_RESERVATIONS = new ArrayList<>();

    /**
     * mathod to calculate how many days will are
     * @param startTime
     * @param endTime
     * @return days
     */
    private int calculateNumberOfDays(LocalDate startTime, LocalDate endTime) {
        if(startTime != endTime) {
            return days = (int) ChronoUnit.DAYS.between(startTime, endTime);
        } else {
            return days = 1;
        }
    }

    private double calculateTotalCosts(double pricePerDay, int days) {
        return totalPrice = pricePerDay * days;
    }

    public Reservation(long id, LocalDate startTime, LocalDate endTime, double pricePerDay, ReservationStatus reservationStatus, Car car, Client client) {
        this.setId(id);
        this.setStartTime(startTime);
        this.setEndTime(endTime);
        this.days = calculateNumberOfDays(startTime, endTime);
        this.setPricePerDay(pricePerDay);
        this.totalPrice = calculateTotalCosts(pricePerDay, calculateNumberOfDays(startTime, endTime));
        setReservationStatus(reservationStatus);
        this.setCar(car);
        this.setClient(client);
        Reservation.ALL_RESERVATIONS.add(this);
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public static List<Reservation> getAllReservations() {
        return ALL_RESERVATIONS;
    }

    public static void setAllReservations(List<Reservation> allReservations) {
        ALL_RESERVATIONS = allReservations;
    }
}
