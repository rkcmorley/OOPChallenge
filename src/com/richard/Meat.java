package com.richard;

public class Meat {
    private int numOfMeat;
    private double costOfMeat;

    public Meat(int numOfMeat, double costOfMeat) {
        this.numOfMeat = numOfMeat;
        this.costOfMeat = costOfMeat;
    }

    public int getNumOfMeat() {
        return numOfMeat;
    }

    public double getCostOfMeat() {
        return costOfMeat;
    }

    public double totalCostOfMeat(){
        return getNumOfMeat() * getCostOfMeat();
    }
}
