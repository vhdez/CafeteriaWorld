package edu.sla;

public class Main {

    public static void main(String[] args) {
        System.out.println("Here is my world of Cafeteria food!");
        System.out.println("Display all the food available for students");
        // tell all the foods to describe themselves

        Food hotDog1 = new Food();
        hotDog1.name = "hot dog";
        hotDog1.foodGroup = "protein";
        hotDog1.servingsLeft = 20;
        hotDog1.servingSize = 1;
        hotDog1.describe();

//        Food hotDog2 = new Food();
//        hotDog2.name = "second hot dog";
//        hotDog2.foodGroup = "protein";
//        hotDog2.servingsLeft = 20;
//        hotDog2.servingSize = 1;
//        hotDog2.describe();

        Food pbjSandwich = new Food();
        pbjSandwich.name = "PBJ Sandwich";
        pbjSandwich.servingsLeft = 45;
        pbjSandwich.describe();

        System.out.println("These students are in the cafeteria:");
        Student mrHernandez = new Student();
        mrHernandez.name = "Mr. Hernandez";
        mrHernandez.eatenYet = false;
        mrHernandez.gotFoodYet = false;
        mrHernandez.theirOrder = null;
        mrHernandez.describe();

        System.out.println("Students get to pick some foods");
        mrHernandez.order(pbjSandwich);
        mrHernandez.describe();

        System.out.println("Students get to eat the food on their tray");
        System.out.println("Students get to report their satisfaction");
    }
}
