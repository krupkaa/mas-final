package com.example.finalprojekt.ui;

import com.example.finalprojekt.entity.Car;
import com.example.finalprojekt.entity.Client;
import com.example.finalprojekt.entity.Contact;
import com.example.finalprojekt.entity.Reservation;
import com.example.finalprojekt.enums.CarStatus;
import com.example.finalprojekt.enums.ReservationStatus;
import com.example.finalprojekt.helpers.FileOperator;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Route("carDetail")
public class CarDetailView extends VerticalLayout {

    Car car;
    FileOperator fo;

    TextField registrationNumber = new TextField("Numer Rejestracyjny");
    TextField name = new TextField("Imie");
    TextField surname = new TextField("Nazwisko");



    public CarDetailView() throws Exception {

        FormLayout formLayout = new FormLayout();
        formLayout.add(
                registrationNumber, name, surname
        );

        add(formLayout);

        Button rentButton = new Button("Wypożycz auto");
        add(rentButton);
        Client.ALL_CLIENTS.add(new Client("Dominika", "Krupa", new Contact("123", "1234"), 1, 10, "B"));
        rentButton.addClickListener(click -> {
            for (Car c: Car.ALL_CARS) {
                if(c.getRegistrationNumber().equals(registrationNumber.getValue())) {
                    c.setCarStatus(CarStatus.RESERVED);
                    car = c;
                    for (Client cl: Client.ALL_CLIENTS) {
                       if(cl.getName().equals(name.getValue()) && cl.getSurname().equals(surname.getValue())) {
                           Reservation addedReservation = new Reservation(c, cl);
                           Reservation.ALL_RESERVATIONS.add(addedReservation);
                       }
                    }

                }

            }
//            System.out.println(Reservation.ALL_RESERVATIONS);
            Notification.show("Samochód został wypożyczony!");
        });

        Button giveBackButton = new Button("Oddaj auto");
        add(giveBackButton);
        giveBackButton.addClickListener(click -> {
            for (Car c: Car.ALL_CARS) {
                if(c.getRegistrationNumber().equals(registrationNumber.getValue())) {
                    c.setCarStatus(CarStatus.AVAILABLE);
                    car = c;
                    for (Client cl: Client.ALL_CLIENTS) {
                        if(cl.getName().equals(name.getValue()) && cl.getSurname().equals(surname.getValue())) {
                            for (Reservation r: Reservation.ALL_RESERVATIONS ) {
                                if(r.getCar().equals(c) && r.getClient().equals(cl)) {
                                    r.setReservationStatus(ReservationStatus.EXECUTED);
                                    r.setEndTime(LocalDate.now());
                                }

                            }
                        }
                    }

                }

            }
//            System.out.println(Reservation.ALL_RESERVATIONS);
            Notification.show("Samochód został oddany!");
        });
    }

}
