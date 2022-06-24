package com.example.finalprojekt.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class AddClientView extends VerticalLayout {
    private TextField firstName;
    private TextField lastName;
    private TextField email;
    private Button deleteButton = new Button("Delete...");
    private Button cancelButton = new Button("Cancel");
    private Button saveButton = new Button("Save");


    public AddClientView() {
        FormLayout formLayout = new FormLayout();
        firstName = new TextField("First Name");
        lastName = new TextField("Last Name");
        email = new TextField("Email");
        formLayout.add(firstName, lastName, email);
        HorizontalLayout buttonLayout = new HorizontalLayout();
        deleteButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY, ButtonVariant.LUMO_ERROR);
        cancelButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        saveButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonLayout.setWidthFull();
        buttonLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.BETWEEN);
        buttonLayout.setSpacing(false);
        buttonLayout.add(deleteButton, new HorizontalLayout(cancelButton, saveButton));
        add(formLayout, buttonLayout);
        setWidth("600px");
        setMinWidth("300px");
        setFlexGrow(0);
    }

    public Button getDeleteButton() {
        return deleteButton;
    }

    public Button getCancelButton() {
        return cancelButton;
    }

    public Button getSaveButton() {
        return saveButton;
    }
}
