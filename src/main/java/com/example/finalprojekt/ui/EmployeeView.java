package com.example.finalprojekt.ui;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("employeeView")
public class EmployeeView extends HorizontalLayout {


    public EmployeeView() {

        Button showCars = new Button("Wyświetl samochody");
        add(showCars);
        showCars.addClickListener(click -> {
            UI.getCurrent().navigate("showCars");
        });

        Button rejectCar = new Button("Zarejestruj samochód");
        add(rejectCar);
        rejectCar.addClickListener(click -> {
            UI.getCurrent().navigate("addOrDeleteCar");
        });


        Button changeStatus = new Button("Zmień status auta");
        add(changeStatus);
        changeStatus.addClickListener(click -> {
            UI.getCurrent().navigate("changeStatus");
        });

    }
}
