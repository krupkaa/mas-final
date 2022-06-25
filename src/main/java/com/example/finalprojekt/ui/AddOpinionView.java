package com.example.finalprojekt.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("opinion")
public class AddOpinionView extends VerticalLayout {

    public AddOpinionView() {
        FormLayout formLayout = new FormLayout();
        TextField textFieldOpinion = new TextField("Opinia");
        formLayout.add(textFieldOpinion);
        Button buttonAddOpinion = new Button("Dodaj");
        add(formLayout, buttonAddOpinion);

    }
}
