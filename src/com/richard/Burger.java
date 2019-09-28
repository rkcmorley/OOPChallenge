package com.richard;

public class Burger {
    private Bread bread;
    private Meat meat;
    private Lettuce lettuce;
    private Tomato tomato;

    public Burger(Bread bread, Meat meat, Lettuce lettuce, Tomato tomato) {
        this.bread = bread;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
    }

    public Bread getBread() {
        return bread;
    }

    public Meat getMeat() {
        return meat;
    }

    public Lettuce getLettuce() {
        return lettuce;
    }

    public Tomato getTomato() {
        return tomato;
    }
    public double totalAmount(){
        return bread.totalCostOfBread() + meat.totalCostOfMeat() + lettuce.totalCostOfLettuce() + tomato.totalCostOfTomato();
    }
}
