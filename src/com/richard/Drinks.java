package com.richard;

public class Drinks {
    private int numOfDrinks;
    private double costOfDrinks;

    public Drinks(int numOfDrinks, double costOfDrinks) {
        this.numOfDrinks = numOfDrinks;
        this.costOfDrinks = costOfDrinks;
    }

    public int getNumOfDrinks() {
        return numOfDrinks;
    }

    public double getCostOfDrinks() {
        return costOfDrinks;
    }

    public double totalCostOfDrinks(){
        return getNumOfDrinks() * getCostOfDrinks();
    }
}
