package com.richard;

public class DeluxeBurger extends HealthyBurger{

    private Chips chips;
    private Drinks drinks;

    public DeluxeBurger(Bread bread, Meat meat, Lettuce lettuce, Tomato tomato, Carrot carrot, Pickle pickle, Chips chips, Drinks drinks) {
        super(bread, meat, lettuce, tomato, carrot, pickle);
        this.chips = chips;
        this.drinks = drinks;
    }

    public Chips getChips() {
        return chips;
    }

    public Drinks getDrinks() {
        return drinks;
    }

    @Override
    public double totalAmount(){
        return getBread().totalCostOfBread() + getMeat().totalCostOfMeat() + getLettuce().totalCostOfLettuce() + getTomato().totalCostOfTomato() + getCarrot().totalCostOfCarrot() + getPickle().totalCostOfPickle() + chips.totalCostOfChips() + drinks.totalCostOfDrinks();
    }
}
