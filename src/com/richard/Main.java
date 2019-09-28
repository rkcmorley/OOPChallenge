package com.richard;

public class Main {

    public static void main(String[] args) {
        Bread bread = new Bread(2, 0.50);
        Meat meat = new Meat(3, 1.50);
        Meat deluxeMeat = new Meat(5, 2.50);
        Lettuce lettuce = new Lettuce(4, 0.50);
        Tomato tomato = new Tomato(3, 0.45);
        Carrot carrot = new Carrot(5, 0.80);
        Pickle pickle = new Pickle(5, 0.70);
        Chips chips = new Chips(10, 0.25);
        Drinks drinks = new Drinks(2, 2.50);


        Burger burger = new Burger(bread, meat, lettuce, tomato);
        HealthyBurger healthyBurger = new HealthyBurger(bread, meat, lettuce, tomato, carrot, pickle);
        DeluxeBurger deluxeBurger = new DeluxeBurger(bread, deluxeMeat, lettuce, tomato, carrot, pickle, chips, drinks);

        System.out.println("The amount of bread is " + burger.getBread().getNumOfBread() + " and the total cost of bread is £" + burger.getBread().totalCostOfBread());
        System.out.println("The amount of meat is " + burger.getMeat().getNumOfMeat() + " and the total cost of meat is £" + burger.getMeat().totalCostOfMeat());
        System.out.println("The amount of lettuce is " + burger.getLettuce().getNumOfLettuce() + " and the total cost of lettuce is £" + burger.getLettuce().totalCostOfLettuce());
        System.out.println("The amount of tomato is " + burger.getTomato().getNumOfTomato() + " and the total cost of tomato is £" + burger.getTomato().totalCostOfTomato() + "\n");

        System.out.println("Total cost of the base burger is: £" + burger.totalAmount() + "\n");

        System.out.println("The amount of carrot is " + healthyBurger.getCarrot().getNumOfCarrot() + " and the total cost of carrot is £" + healthyBurger.getCarrot().totalCostOfCarrot());
        System.out.println("The amount of pickle is " + healthyBurger.getPickle().getNumOfPickle() + " and the total cost of pickle is £" + healthyBurger.getPickle().totalCostOfPickle() + "\n");

        System.out.println("Total cost of the healthy burger with carrot and pickle is: £" + healthyBurger.totalAmount() + "\n");

        System.out.println("The amount of deluxe meat is " + deluxeBurger.getMeat().getNumOfMeat() + " and the total cost of deluxe meat is £" + deluxeBurger.getMeat().totalCostOfMeat());
        System.out.println("The amount of chips is " + deluxeBurger.getChips().getNumOfChips() + " and the total cost of chips is £" + deluxeBurger.getChips().totalCostOfChips());
        System.out.println("The amount of drinks is " + deluxeBurger.getDrinks().getNumOfDrinks() + " and the total cost of drinks is £" + deluxeBurger.getDrinks().totalCostOfDrinks() + "\n");

        System.out.println("Total cost of the deluxe burger with chips and drinks is: £" + deluxeBurger.totalAmount());
    }
}
