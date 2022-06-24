package com.example.finalprojekt.entity;

import com.example.finalprojekt.enums.ReservationStatus;

import java.time.LocalDate;

public class Reservation {

    private long id;
    private LocalDate startTime;
    private LocalDate endTime;
    private int days;
    private double pricePerDay;
    private double totalPrice;
    private ReservationStatus reservationStatus;
}
