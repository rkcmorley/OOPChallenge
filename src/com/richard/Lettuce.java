package com.richard;

public class Lettuce {
    private int numOfLettuce;
    private double costOfLettuce;

    public Lettuce(int numOfLettuce, double costOfLettuce) {
        this.numOfLettuce = numOfLettuce;
        this.costOfLettuce = costOfLettuce;
    }

    public int getNumOfLettuce() {
        return numOfLettuce;
    }

    public double getCostOfLettuce() {
        return costOfLettuce;
    }

    public double totalCostOfLettuce(){
        return getNumOfLettuce() * getCostOfLettuce();
    }
}
