package com.example.finalprojekt.ui;

import com.example.finalprojekt.entity.Car;
import com.example.finalprojekt.enums.CarStatus;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


@Route("addCar")
public class AddCarView extends VerticalLayout {

    TextField brand = new TextField("Marka");
    TextField model = new TextField("Model");
    TextField registrationNumber = new TextField("Numer Rejestracyjny");
    IntegerField seats = new IntegerField("Ilość miejsc");
    IntegerField priceForDayRent = new IntegerField("Cena za dzień wynajmu");
    ComboBox<CarStatus> carStatus = new ComboBox<>("Status");
    IntegerField mileage = new IntegerField("Przebieg");
    //  TextField yearProduction = new TextField("Rok produkcji");
    Car car;


    Button addCarButton = new Button("Dodaj samochód");

    Binder<Car> binder = new BeanValidationBinder<>(Car.class);

    Car addedCar;

//    public AddCarView() {
//        add(new H1("Rejestracja auta"),
//                buildForm(),
//                carGrid
//        );
//    }
//
//    private Component buildForm() {
//
//        TextField brand = new TextField("Marka");
//        TextField model = new TextField("Model");
//        TextField registrationNumber = new TextField("Numer Rejestracyjny");
//        IntegerField seats = new IntegerField("Ilość miejsc");
//        IntegerField priceForDayRent = new IntegerField("Cena za dzień wnajmu");
//        ComboBox<CarStatus> carStatus = new ComboBox<>("Status");
//        IntegerField mileage = new IntegerField("Przebieg");
//        TextField yearProduction = new TextField("Rok produkcji");
//
//
//        Button addCarButton = new Button("Dodaj samochód");
//        Div errorsLayout = new Div();
//        addCarButton.setThemeName("primary");
//
//
//        Binder<Car> binder = new BeanValidationBinder<>(Car.class);
//        binder.bindInstanceFields(this);
//        add(brand, model, registrationNumber, seats, priceForDayRent, carStatus, mileage, yearProduction);
//        carStatus.setItems(CarStatus.values());
//
//
//        HorizontalLayout formLayout = new HorizontalLayout(brand, model, registrationNumber, seats, priceForDayRent, carStatus, mileage, yearProduction);
//        Div wrapperLayout = new Div(formLayout, errorsLayout);
//        formLayout.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
//        wrapperLayout.setWidth("20%");
//        add(addCarButton);
//
//
//        addCarButton.addClickListener(click -> {
//
//
//        });
//
//
//        return wrapperLayout;
//
//    }

    public void setCar(Car car) {
        binder.setBean(car);
    }

    public AddCarView() {

        Div errorsLayout = new Div();
        addCarButton.setThemeName("primary");


        binder.bindInstanceFields(this);
        add(brand, model, registrationNumber, seats, priceForDayRent, carStatus, mileage, addCarButton);
        carStatus.setItems(CarStatus.values());


        addCarButton.addClickListener(click -> {
            addedCar = new Car(brand.getValue(), model.getValue(), registrationNumber.getValue(),
                    seats.getValue(), priceForDayRent.getValue(), carStatus.getValue(), mileage.getValue());
            System.out.println(addedCar);
            addAddedCarToFile(addedCar);
        });


    }


    private void addAddedCarToFile(Car addedCar) {
        try {
            FileWriter fw = new FileWriter("C:\\Studia\\VI SEMESTR\\MAS\\final-projekt\\src\\main\\resources\\cars.csv");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(addedCar.toString());
            bw.newLine();

            bw.close();
            fw.close();
            System.out.println("Dane zostaly zapisane do pliku");
        } catch (IOException e) {
            System.err.println("Nie udalo zapisac sie danych do pliku");
        }
    }
}


