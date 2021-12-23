package edu.sla;

public class FishandChips extends Food {

    // Fields
    static int FishandChipsLeft;

    FishandChips() {
        FishandChipsLeft = FishandChipsLeft + 1;
    }
    // Methods
    void describe() {
        System.out.println(" # of " + name + " in cafeteria is: " + FishandChipsLeft);
    }
}
