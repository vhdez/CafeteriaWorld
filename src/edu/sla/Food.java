package edu.sla;

public class Food {
    // fields
    String name;
    int servingSize;
    int servingsLeft;
    String foodGroup;
    Student owner;

    // methods
    void describe() {
        System.out.println("There are " + servingsLeft + " amount of " + name + "s left in the cafeteria.");

    }

    void addTopping() {

    }

    void serveTo(Student student) {
        servingsLeft = servingsLeft -1;
        owner = student;
    }

    void eaten() {

    }
}
