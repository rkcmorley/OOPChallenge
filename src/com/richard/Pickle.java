package com.richard;

public class Pickle {
    private int numOfPickle;
    private double costOfPickle;

    public Pickle(int numOfPickle, double costOfPickle) {
        this.numOfPickle = numOfPickle;
        this.costOfPickle = costOfPickle;
    }

    public int getNumOfPickle() {
        return numOfPickle;
    }

    public double getCostOfPickle() {
        return costOfPickle;
    }

    public double totalCostOfPickle(){
        return getNumOfPickle() * getCostOfPickle();
    }
}
