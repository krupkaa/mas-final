package com.example.finalprojekt.ui;


import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("clientView")
public class ClientView extends HorizontalLayout {

    public ClientView() {

        Button showCars = new Button("Wyświetl samochody");
        add(showCars);
        showCars.addClickListener(clickEvent -> {
            UI.getCurrent().navigate("showCars");
        });


        add(new Button("Wypożycz samochód"));
        add(new Button("Oddaj samochód"));
        add(new Button("Wystaw opinie"));


    }

}




