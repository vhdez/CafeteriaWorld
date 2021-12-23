package edu.sla;

public class Toast extends Food {
    // Fields
    static int toastLeft;

    Toast() {
        toastLeft = toastLeft + 1;
    }
    // Methods
    void describe() {
        System.out.println(" # of " + name + " in cafeteria is: " + toastLeft);
    }
}

