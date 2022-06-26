package com.example.finalprojekt.ui;

import com.example.finalprojekt.entity.Opinion;
import com.example.finalprojekt.helpers.FileOperator;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;

@Route("opinion")
public class AddOpinionView extends VerticalLayout {


    TextField textFieldOpinion = new TextField("Opinia");
    TextField textFieldName = new TextField("Imię");
    TextField textFieldSurname = new TextField("Nazwisko");


    Button buttonAddOpinion = new Button("Dodaj");

    Binder<Opinion> binder = new BeanValidationBinder<>(Opinion.class);

    Opinion addedOpinion;
    FileOperator fo = new FileOperator();

    public AddOpinionView() {

        binder.bindInstanceFields(this);
        add(textFieldOpinion, textFieldName, textFieldSurname);

        buttonAddOpinion.addClickListener(click -> {

        });

    }

}
