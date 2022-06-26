package com.example.finalprojekt.ui;

import com.example.finalprojekt.entity.Client;
import com.example.finalprojekt.entity.Contact;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("ad")
public class AddClientView extends VerticalLayout {

    private TextField firstName;
    private TextField lastName;
    private TextField email;
    private Button saveButton = new Button("Save");

    Client client;


    public AddClientView() {
        FormLayout formLayout = new FormLayout();
        firstName = new TextField("First Name");
        lastName = new TextField("Last Name");
        email = new TextField("Email");
        formLayout.add(firstName, lastName, email);
        HorizontalLayout buttonLayout = new HorizontalLayout();
        saveButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonLayout.setWidthFull();
        buttonLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.BETWEEN);
        buttonLayout.setSpacing(false);
        buttonLayout.add(new HorizontalLayout(saveButton));
        add(formLayout, buttonLayout);
        setWidth("600px");
        setMinWidth("300px");
        setFlexGrow(0);


        saveButton.addClickListener(click -> {
            try {
                client = new Client(firstName.getValue(), lastName.getValue(), new Contact("", email.getValue()), 1, 100, "B");
                Client.ALL_CLIENTS.add(client);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });


    }

    public Button getSaveButton() {
        return saveButton;
    }
}
