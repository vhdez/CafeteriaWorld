package edu.sla;

public class Food {

    // fields
    String name;
    String nameGotThis;
    int servingSize;
    static int servingsLeft;
    String foodGroup;
    boolean orderedYet = false;

    // methods
    void describe() {
        System.out.println("There are " + servingsLeft + " amount of " + name + "s left in the cafeteria.");
    }

    void addTopping() {

    }

    boolean serve(Student student) {
        if (!(orderedYet)) {
            orderedYet = true;
            nameGotThis = student.name;
            return true;
        } else {
            return false;
        }
    }

    void eaten() {
        servingSize = servingSize - 1;
    }
}
