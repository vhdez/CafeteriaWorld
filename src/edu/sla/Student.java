package edu.sla;

public class Student {
    // Fields
    String name;
    Food myOrder;

    // Methods
    void describe() {
        System.out.print("Hi! It's " + name + "! ");
        if (myOrder != null && myOrder.servingSize == 0) {
            System.out.println("I'm full!");
        } else if (myOrder != null) {
            System.out.println("I can't wait to eat my: " + myOrder.name);
        } else {
            System.out.println("I need to go get food.");
        }
    }
    void order(Food food) {
        if (myOrder != null) {
            System.out.println("Sorry " + name + "!  You can't have " + food.name + " because you already ordered " + myOrder.name);
            return;
        }

        boolean success = food.serve();
        if (success) {
            System.out.println(name + " ordered a " + food.name);
            myOrder = food;
        }
    }
    void eat() {
        if (myOrder != null && myOrder.servingSize > 0) {
            myOrder.eaten();
            System.out.println(name + " says That was a good " + myOrder.name);
        }
    }
}
