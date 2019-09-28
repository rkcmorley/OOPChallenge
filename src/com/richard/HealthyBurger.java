package com.richard;

public class HealthyBurger extends Burger {
    private Carrot carrot;
    private Pickle pickle;

    public HealthyBurger(Bread bread, Meat meat, Lettuce lettuce, Tomato tomato, Carrot carrot, Pickle pickle) {
        super(bread, meat, lettuce, tomato);
        this.carrot = carrot;
        this.pickle = pickle;
    }

    public Carrot getCarrot() {
        return carrot;
    }

    public Pickle getPickle() {
        return pickle;
    }

    @Override
    public double totalAmount(){
        return getBread().totalCostOfBread() + getMeat().totalCostOfMeat() + getLettuce().totalCostOfLettuce() + getTomato().totalCostOfTomato() + carrot.totalCostOfCarrot() + pickle.totalCostOfPickle();
    }
}
