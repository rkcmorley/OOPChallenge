package com.richard;

public class Carrot {
    private int numOfCarrot;
    private double costOfCarrot;

    public Carrot(int numOfCarrot, double costOfCarrot) {
        this.numOfCarrot = numOfCarrot;
        this.costOfCarrot = costOfCarrot;
    }

    public int getNumOfCarrot() {
        return numOfCarrot;
    }

    public double getCostOfCarrot() {
        return costOfCarrot;
    }

    public double totalCostOfCarrot(){
        return getNumOfCarrot() * getCostOfCarrot();
    }
}
