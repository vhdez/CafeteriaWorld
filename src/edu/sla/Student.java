package edu.sla;

public class Student {
    // Fields
    String name;
    boolean gotFoodYet;
    Food theirOrder;
    boolean eatenYet;

    // Methods
    void describe() {
        System.out.print("Hi! It's " + name + "! ");
        if (gotFoodYet) {
            System.out.println("I can't wait to eat my: " + theirOrder.name);
        } else {
            System.out.println("I need to go get food.");
        }
    }
    void order(Food food) {
        food.serveTo(this);
        theirOrder = food;
        gotFoodYet = true;
    }
    void eat() {

    }
}
