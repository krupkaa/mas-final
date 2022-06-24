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
        showCars.addClickListener(clickEvent -> {
            UI.getCurrent().navigate("showCars");
        });

        Button rejectCar = new Button("Zarejestruj samochód");
        add(rejectCar);
        rejectCar.addClickListener(clickEvent -> {
            UI.getCurrent().navigate("addCar");
        });
        add(new Button("Dodaj klienta"));
        add(new Button("Zmień status auta"));

    }
}
