package edu.sla;

public class Food {

    // fields
    String name;
    int servingSize;
    static int servingsLeft;
    String foodGroup;

    // methods
    void describe() {
        System.out.println("There are " + servingsLeft + " amount of " + name + "s left in the cafeteria.");
    }

    void addTopping() {

    }

    boolean serve() {
        if (servingsLeft > 0) {
            servingsLeft = servingsLeft - 1;
            return true;
        } else {
            return false;
        }
    }

    void eaten() {
        servingSize = servingSize - 1;
    }
}
