package com.example.finalprojekt.ui;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("manageCars")
public class ManageCarsView  extends HorizontalLayout {

    public ManageCarsView() {
        Button showCars = new Button("Wyświetl samochody");
        add(showCars);
        showCars.addClickListener(clickEvent -> {
            UI.getCurrent().navigate("showCars");
        });


        Button addCar = new Button("Dodaj/usuń samochód");
        add(addCar);
        addCar.addClickListener(clickEvent -> {
            UI.getCurrent().navigate("addOrDeleteCar");
        });


    }


}
