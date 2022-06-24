package com.example.finalprojekt.ui;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("ownerView")
public class OwnerView extends HorizontalLayout {

    public OwnerView() {


            Button showCars = new Button("Wyświetl samochody");
            add(showCars);
            showCars.addClickListener(clickEvent -> {
                UI.getCurrent().navigate("showCars");
            });


            add(new Button("Zarządzaj samochodami"));
            add(new Button("Zarządzaj pracownikami"));

    }
}
