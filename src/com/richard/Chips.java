package com.richard;

public class Chips {
    private int numOfChips;
    private double costOfChips;

    public Chips(int numOfChips, double costOfChips) {
        this.numOfChips = numOfChips;
        this.costOfChips = costOfChips;
    }

    public int getNumOfChips() {
        return numOfChips;
    }

    public double getCostOfChips() {
        return costOfChips;
    }

    public double totalCostOfChips(){
        return getNumOfChips() * getCostOfChips();
    }
}
