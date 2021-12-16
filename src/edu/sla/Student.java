package edu.sla;

public class Student {
    // Fields
    String name;
    Food theirOrder;

    // Methods
    void describe() {
        System.out.print("Hi! It's " + name + "! ");
        if (theirOrder != null && theirOrder.servingSize == 0) {
            System.out.println("I'm full!");
        } else if (theirOrder != null) {
            System.out.println("I can't wait to eat my: " + theirOrder.name);
        } else {
            System.out.println("I need to go get food.");
        }
    }
    void order(Food food) {
        if (theirOrder != null) {
            System.out.println("Sorry " + name + "!  You can't have " + food.name + " because you already ordered " + theirOrder.name);
            return;
        }

        boolean success = food.serve();
        if (success) {
            System.out.println(name + " ordered a " + food.name);
            theirOrder = food;
        }
    }
    void eat() {
        if (theirOrder != null && theirOrder.servingSize > 0) {
            theirOrder.eaten();
            System.out.println(name + " says That was a good " + theirOrder.name);
        }
    }
}
