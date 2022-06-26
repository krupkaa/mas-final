package com.example.finalprojekt.entity;

import com.example.finalprojekt.enums.ReservationStatus;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Reservation {

    private LocalDate startTime;
    private LocalDate endTime;
    private int days;
    private double pricePerDay;
    private double totalPrice;
    private ReservationStatus reservationStatus;

    private Car car;
    private Client client;

    public static List<Reservation> ALL_RESERVATIONS = new ArrayList<>();

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

    /**
     * method to calculate total costs for the reservation
     * @param pricePerDay
     * @param days
     * @return totalPrice
     */
    private double calculateTotalCosts(double pricePerDay, int days) {
        return totalPrice = pricePerDay * days;
    }

    /**
     * constructor with all parameters
     * @param startTime
     * @param endTime
     * @param pricePerDay
     * @param reservationStatus
     * @param car
     * @param client
     */
    public Reservation(LocalDate startTime, LocalDate endTime, double pricePerDay, ReservationStatus reservationStatus, Car car, Client client) {
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
    public Reservation(Car car, Client client) {
        setReservationStatus(ReservationStatus.WAITING_FOR_REALISATION);
        this.setCar(car);
        this.setClient(client);
        Reservation.ALL_RESERVATIONS.add(this);
    }



    /**
     * @return startTime
     */
    public LocalDate getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    /**
     * @return endTime
     */
    public LocalDate getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    /**
     * @return days
     */
    public int getDays() {
        return days;
    }

    /**
     * @param days
     */
    public void setDays(int days) {
        this.days = days;
    }

    /**
     * @return pricePerDay
     */
    public double getPricePerDay() {
        return pricePerDay;
    }

    /**
     * @param pricePerDay
     */
    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    /**
     * @return totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * @return reservationStatus
     */
    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    /**
     * @param reservationStatus
     */
    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    /**
     * @return car
     */
    public Car getCar() {
        return car;
    }

    /**
     * @param car
     */
    public void setCar(Car car) {
        this.car = car;
    }

    /**
     * @return client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return ALL_RESERVATIONS
     */
    public static List<Reservation> getAllReservations() {
        return ALL_RESERVATIONS;
    }

    /**
     * @param allReservations
     */
    public static void setAllReservations(List<Reservation> allReservations) {
        ALL_RESERVATIONS = allReservations;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", days=" + days +
                ", pricePerDay=" + pricePerDay +
                ", totalPrice=" + totalPrice +
                ", reservationStatus=" + reservationStatus +
                ", car=" + car +
                ", client=" + client +
                '}';
    }
}
