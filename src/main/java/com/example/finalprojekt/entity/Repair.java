package com.example.finalprojekt.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Repair {

    public static List<Repair> ALL_REPAIR = new ArrayList<>();
    private List<RepairStep> repairSteps = new ArrayList<>();

    private HashMap<String, Car> repairHashMap = new HashMap<>();

    private int idRepair;
    private LocalDate startTime;
    private LocalDate endTime;
    private Car whichCar;

    /**
     * contruktor
     * @param idRepair
     * @param startTime
     * @param endTime
     */
    public Repair(int idRepair, LocalDate startTime, LocalDate endTime) {
        this.idRepair = idRepair;
        this.startTime = startTime;
        this.endTime = endTime;
    }


    /**
     * @param car
     */
    //ASOCJACJA KWALIFIKOWANA
    public void addCarKwalif(Car car) {
        //sprawdzenie czy nie ma samochodu z podanym numerem rejestracyjnym
        if(!repairHashMap.containsKey(car.getRegistrationNumber())){
            repairHashMap.put(car.getRegistrationNumber(), car);
            car.addRepair(this);
            setWhichCar(car);
        }
    }

    //kompozycja 1:*
    public void addStepOfRepair(RepairStep repairStep) throws Exception {
        if(Repair.ALL_REPAIR.stream().anyMatch(repair -> repair.getAllRepair().contains(repairStep))){
            throw new Exception("This step is already exists");
        }


        this.repairSteps.add(repairStep);
    }

    public void removeStep(RepairStep repairStep) {
        if(this.repairSteps.contains(repairStep)) {
            this.repairSteps.remove(repairStep);
            repairStep.removeRepair();
        }
    }

    public HashMap<String, Car> getRepairHashMap() {
        return repairHashMap;
    }

    public void setWhichCar(Car whichCar) {
        this.whichCar = whichCar;
    }

    public static List<Repair> getAllRepair() {
        return ALL_REPAIR;
    }
}
