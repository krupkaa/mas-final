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


        Button giveBackCars = new Button("Wypożycz/Oddaj samochód");
        add(giveBackCars);
        giveBackCars.addClickListener(clickEvent -> {
            UI.getCurrent().navigate("carDetail");
        });
        add(new Button("Wystaw opinie"));


    }

}




