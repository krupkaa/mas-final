package com.example.finalprojekt.ui;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("manageEmployees")
public class ManageEmployeesView extends HorizontalLayout {

    public ManageEmployeesView() {

        Button showEmployees = new Button("Wyświetl pracowników");
        add(showEmployees);
        showEmployees.addClickListener(clickEvent -> {
            UI.getCurrent().navigate("showEmployees");
        });


        Button addEmployee = new Button("Dodaj pracownika");
        add(addEmployee);
        addEmployee.addClickListener(clickEvent -> {
            UI.getCurrent().navigate("addEmployee");
        });


    }
}
