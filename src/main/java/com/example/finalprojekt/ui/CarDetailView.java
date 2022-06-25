package com.example.finalprojekt.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("carDetail")
public class CarDetailView extends VerticalLayout {


    public CarDetailView() {
        TextField brand = new TextField("Marka");
        TextField model = new TextField("Model");
        TextField registrationNumber = new TextField("Numer Rejestracyjny");

        FormLayout formLayout = new FormLayout();
        formLayout.add(
                brand, model, registrationNumber
        );

        add(formLayout);
        add(new Button("Wypożycz auto"));
        add(new Button("Oddaj auto"));
    }
}
