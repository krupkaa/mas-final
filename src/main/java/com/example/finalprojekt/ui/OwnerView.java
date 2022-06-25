package com.example.finalprojekt.ui;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("ownerView")
public class OwnerView extends HorizontalLayout {

    public OwnerView() {

            Button manageCars = new Button("Zarządzaj samochodami");
            add(manageCars);
            manageCars.addClickListener(clickEvent -> {
                UI.getCurrent().navigate("manageCars");
            });

        Button manageEmployees = new Button("Zarządzaj pracownikami");
        add(manageEmployees);
        manageEmployees.addClickListener(clickEvent -> {
            UI.getCurrent().navigate("manageEmployees");
        });

    }
}
