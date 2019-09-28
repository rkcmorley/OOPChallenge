package com.richard;

public class Bread {
    private int numOfBread;
    private double costOfBread;

    public Bread(int numOfBread, double costOfBread) {
        this.numOfBread = numOfBread;
        this.costOfBread = costOfBread;
    }

    public int getNumOfBread() {
        return numOfBread;
    }

    public double getCostOfBread() {
        return costOfBread;
    }

    public double totalCostOfBread(){
        return getNumOfBread() * getCostOfBread();
    }
}


