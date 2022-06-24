package com.example.finalprojekt.ui;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

@Route("showCars")
public class ShowCarsView extends VerticalLayout {

    Grid<String[]> grid = new Grid<>();

    public ShowCarsView() {
       Button buttonReadFile = new Button("Wyświetl wszystkie samochody",  e -> readFromClasspath());
       add(buttonReadFile, grid);
    }

    private void readFromClasspath() {
        displayCsv(getClass().getClassLoader().getResourceAsStream("cars.csv"));
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

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



