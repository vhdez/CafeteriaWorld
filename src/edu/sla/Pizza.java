package edu.sla;

public class Pizza extends Food {
    // Fields
    static int pizzasLeft;

    Pizza() {
        pizzasLeft = pizzasLeft + 1;
    }
    // Methods
    void describe() {
        System.out.println(" # of " + name + " in cafeteria is: " + pizzasLeft);
    }
}
