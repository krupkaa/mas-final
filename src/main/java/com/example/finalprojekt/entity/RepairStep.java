package com.example.finalprojekt.entity;

public class RepairStep {

    private int stepNumber;
    private String stepDescription;
    private double stepCost;


    private Repair repair;

    //prywatny konstuktor, aby tylko metody z tej klasy mogły tworzyć jej instancje
    private RepairStep(int stepNumber, String stepDescription, double stepCost) {
        this.setStepNumber(stepNumber);
        this.setStepDescription(stepDescription);
        this.setStepCost(stepCost);

    }

    public static RepairStep createStep(Repair repair, int stepNumber, String stepDescription, double stepCost) throws Exception {
        if (repair != null) {
            RepairStep repairStep = new RepairStep(stepNumber, stepDescription, stepCost);
            repair.addStepOfRepair(repairStep);

            repairStep.setRepair(repair);
            return repairStep;
        }
        throw new Exception("no repair provided when constructing repair step");
    }

    private void setRepair(Repair repair) {
        if (repair != null) {
            if (this.repair == null) {
                this.repair = repair;
            }
        }
    }

    public void removeRepair() {
        if(this.repair != null) {
            this.repair.removeStep(this);
            this.repair = null;
        }
    }

    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }


    public void setStepDescription(String stepDescription) {
        this.stepDescription = stepDescription;
    }


    public void setStepCost(double stepCost) {
        this.stepCost = stepCost;
    }
}
