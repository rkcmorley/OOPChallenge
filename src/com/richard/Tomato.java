package com.richard;

public class Tomato {
    private int numOfTomato;
    private double costOfTomato;

    public Tomato(int numOfTomato, double costOfTomato) {
        this.numOfTomato = numOfTomato;
        this.costOfTomato = costOfTomato;
    }

    public int getNumOfTomato() {
        return numOfTomato;
    }

    public double getCostOfTomato() {
        return costOfTomato;
    }

    public double totalCostOfTomato(){
        return getNumOfTomato() * getCostOfTomato();
    }
}
