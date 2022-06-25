package com.example.finalprojekt.ui;

import com.example.finalprojekt.entity.Car;
import com.example.finalprojekt.entity.Contact;
import com.example.finalprojekt.entity.Employee;
import com.example.finalprojekt.enums.CarStatus;
import com.example.finalprojekt.enums.PersonType;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;

import java.time.LocalDate;
import java.util.ArrayList;

@Route("addEmployee")
public class AddEmployeeView extends VerticalLayout {


    // super(id, name, secondName, surname, contact, personType);
    //        setEmployeeId(employeeId);

    //        setDateOfEmployment(dateOfEmployment);
    //        setJobSeniority(jobSeniority);
    //        setPreviousWorkplaceList(previousWorkplaceList);
    TextField name = new TextField("Imie");
    TextField secondName = new TextField("Drugie imię");
    TextField surname = new TextField("Nazwisko");

    Button addEmployeeButton = new Button("Dodaj pracownika");

    Binder<Employee> binder = new BeanValidationBinder<>(Employee.class);

    Employee addedEmployee;

    public AddEmployeeView() {

        addEmployeeButton.setThemeName("primary");


        binder.bindInstanceFields(this);
        add(name, secondName, surname, addEmployeeButton);



        addEmployeeButton.addClickListener(click -> {
            if(secondName.getValue() == null) {
//                addedEmployee = new Employee(name.getValue(), surname.getValue(),new Contact("12345", "emial", "email2"), PersonType.EMPLOYEE,LocalDate.now(), new ArrayList<String>());
            }
        });

    }
}
