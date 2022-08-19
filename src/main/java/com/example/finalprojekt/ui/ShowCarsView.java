package com.example.finalprojekt.ui;


import com.example.finalprojekt.entity.Car;
import com.example.finalprojekt.enums.CarStatus;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import java.io.*;
import java.util.List;

@Route("showCars")
public class ShowCarsView extends VerticalLayout {

    Grid<String[]> grid = new Grid<>();
    Car car;

    public ShowCarsView() {
       Button buttonReadFile = new Button("Wyświetl wszystkie samochody",  e -> readFromClasspath("cars.csv"));
       add(buttonReadFile, grid);
    }

    public void readFromClasspath(String fileName) {
        displayCsv(getClass().getClassLoader().getResourceAsStream(fileName));

    }

    private void displayCsv(InputStream resourceAsStream) {
        CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
        CSVReader reader = new CSVReaderBuilder(new InputStreamReader(resourceAsStream)).withCSVParser(parser).build();

        try {
            List<String[]> entries = reader.readAll();

            String[] headers = entries.get(0);

            for (int i = 0; i < headers.length; i++) {
                int colIndex = i;
                grid.addColumn(row -> row[colIndex])
                        .setHeader(headers[colIndex]);
            }

            grid.setItems(entries.subList(1, entries.size()));
            for (int i = 1; i < entries.size(); i++) {
                var status = CarStatus.AVAILABLE;
                switch (entries.get(i)[4]) {
                    case "RESERVED":
                        status = CarStatus.RESERVED;
                        break;
                    case "WITHDRAWN":
                        status = CarStatus.WITHDRAWN;
                        break;
                    case "RENTED":
                        status = CarStatus.RENTED;
                        break;
                    case "IN_REPAIR":
                        status = CarStatus.IN_REPAIR;
                        break;
                    default:
                        status = CarStatus.AVAILABLE;
                }
                new Car(entries.get(i)[0],entries.get(i)[1],entries.get(i)[2], Double.parseDouble(entries.get(i)[3]), status);

            }

            System.out.println(Car.ALL_CARS);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}



