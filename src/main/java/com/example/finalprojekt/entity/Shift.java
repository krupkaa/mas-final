package com.example.finalprojekt.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shift {

    private LocalDate startTime;
    private LocalDate endTime;
    private double totalRepairCost;
    private List<RepairStep> repairStepList = new ArrayList<>();
}
