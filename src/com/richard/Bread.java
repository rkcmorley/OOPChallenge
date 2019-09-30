package com.richard;

public class Bread {
    private int numOfBread;
    private double costOfBread;
    private String name;

    public Bread(int numOfBread, double costOfBread, String name) {
        this.numOfBread = numOfBread;
        this.costOfBread = costOfBread;
        this.name = name;
    }

    public int getNumOfBread() {
        return numOfBread;
    }

    public double getCostOfBread() {
        return costOfBread;
    }

    public String getName(){
        return name;
    }

    public double totalCostOfBread(){
        return getNumOfBread() * getCostOfBread();
    }
}


