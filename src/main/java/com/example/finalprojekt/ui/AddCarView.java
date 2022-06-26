package com.example.finalprojekt.ui;

import com.example.finalprojekt.entity.Car;
import com.example.finalprojekt.enums.CarStatus;
import com.example.finalprojekt.helpers.FileOperator;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;


@Route("addCar")
public class AddCarView extends VerticalLayout {

    TextField brand = new TextField("Marka");
    TextField model = new TextField("Model");
    TextField registrationNumber = new TextField("Numer Rejestracyjny");
    IntegerField seats = new IntegerField("Ilość miejsc");
    IntegerField priceForDayRent = new IntegerField("Cena za dzień wynajmu");
    ComboBox<CarStatus> carStatus = new ComboBox<>("Status");
    IntegerField mileage = new IntegerField("Przebieg");


    Button addCarButton = new Button("Dodaj samochód");

    Binder<Car> binder = new BeanValidationBinder<>(Car.class);

    Car addedCar;
    FileOperator fo = new FileOperator();

    public void setCar(Car car) {
        binder.setBean(car);
    }

    public AddCarView() {

        addCarButton.setThemeName("primary");

        binder.bindInstanceFields(this);
        add(brand, model, registrationNumber, seats, priceForDayRent, carStatus, mileage, addCarButton);
        carStatus.setItems(CarStatus.values());


        addCarButton.addClickListener(click -> {
            addedCar = new Car(brand.getValue(), model.getValue(), registrationNumber.getValue(),
                    seats.getValue(), priceForDayRent.getValue(), carStatus.getValue(), mileage.getValue());
            Car.ALL_CARS.add(addedCar);
            System.out.println(addedCar);
            System.out.println(Car.ALL_CARS);
            fo.addCarsToFile(Car.ALL_CARS);
            Notification.show("Samochód został dodany!");
        });

    }
}


