package com.example.finalprojekt.ui;

import com.example.finalprojekt.entity.Car;
import com.example.finalprojekt.entity.Client;
import com.example.finalprojekt.entity.Reservation;
import com.example.finalprojekt.enums.CarStatus;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("changeStatus")
public class ChangeStatusView extends VerticalLayout {

    TextField registrationNumber = new TextField("Numer rejestracyjny");
    ComboBox<CarStatus> carStatusComboBox = new ComboBox<>("Status");

    public ChangeStatusView() {

        FormLayout formLayout = new FormLayout();
        formLayout.add(
                registrationNumber, carStatusComboBox
        );
        carStatusComboBox.setItems(CarStatus.values());

        add(formLayout);

        Button changeStatusButton = new Button("Zmień status");
        add(changeStatusButton);
        System.out.println(Car.ALL_CARS);
        changeStatusButton.addClickListener(click -> {
            for (Car c : Car.ALL_CARS) {
                if (c.getRegistrationNumber().equals(registrationNumber.getValue())) {
                    c.setCarStatus(carStatusComboBox.getValue());
                }

            }

            System.out.println(Car.ALL_CARS);
            Notification.show("Status został zmieniony!!!");
        });

    }
}
