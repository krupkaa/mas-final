package com.example.finalprojekt.helpers;

import com.example.finalprojekt.entity.Car;
import com.example.finalprojekt.entity.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileOperator {


    //PLIK AUTA
    public void addCarsToFile(List<Car> addedCars) {
        try {
            FileWriter fw = new FileWriter("C:\\Studia\\VI SEMESTR\\MAS\\final-projekt\\src\\main\\resources\\cars.csv",true);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Car c:addedCars) {
                bw.write(c.toString());
                bw.newLine();
            }

            bw.close();
            fw.close();
            System.out.println("Dane zostaly zapisane do pliku");
        } catch (IOException e) {
            System.err.println("Nie udalo zapisac sie danych do pliku");
        }
    }

    //PLIK PRACOWNICY

    public void addAddedEmployeeToFile(Employee addedEmployee) {
        try {
            FileWriter fw = new FileWriter("C:\\Studia\\VI SEMESTR\\MAS\\final-projekt\\src\\main\\resources\\employees.csv");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(addedEmployee.toString());
            bw.newLine();

            bw.close();
            fw.close();
            System.out.println("Dane zostaly zapisane do pliku");
        } catch (IOException e) {
            System.err.println("Nie udalo zapisac sie danych do pliku");
        }
    }
}
