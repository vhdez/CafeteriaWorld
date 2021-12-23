package edu.sla;

public class Food {

    // fields
    String name;
    Student studentGotThis;
    int servingSize;
    private static int totalServings;

    // constructor
    Food() {
        totalServings = totalServings + 1;
    }

    // methods
    void describe() {
        System.out.println("Item # "+ totalServings + " in cafeteria is: " + name);
    }

    boolean serve(Student student) {
        if (studentGotThis == null) {
            studentGotThis = student;
            return true;
        } else {
            return false;
        }
    }

    void eaten() {
        servingSize = servingSize - 1;
    }
}
