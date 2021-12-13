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

        Food cheeseburger = new Food();
        cheeseburger.name = "Cheeseburger";
        cheeseburger.foodGroup = "protein";
        cheeseburger.servingsLeft = 20;
        cheeseburger.servingSize = 1;
        cheeseburger.describe();

        Food strawberrymilk = new Food();
        strawberrymilk.name = "Strawberry Milk";
        strawberrymilk.foodGroup = "drink";
        strawberrymilk.servingsLeft = 20;
        strawberrymilk.servingSize = 1;
        strawberrymilk.describe();

        Food pbjSandwich = new Food();
        pbjSandwich.name = "PBJ Sandwich";
        pbjSandwich.servingsLeft = 45;
        pbjSandwich.describe();

        Food toast = new Food();
        toast.name = "Toast";
        toast.servingsLeft = 25;
        toast.servingSize = 1;
        toast.describe();

        System.out.println("These students are in the cafeteria:");
        Student mrHernandez = new Student();
        mrHernandez.name = "Mr. Hernandez ";
        mrHernandez.eatenYet = false;
        mrHernandez.gotFoodYet = false;
        mrHernandez.theirOrder = null;
        mrHernandez.describe();
        Student eric = new Student();
        eric.name = "Eric Casalena";
        eric.eatenYet = false;
        eric.gotFoodYet = false;
        eric.theirOrder = null;
        eric.describe();


        Student sean = new Student();
        sean.name = "Sean Hogan";
        sean.eatenYet = false;
        sean.gotFoodYet = false;
        sean.theirOrder = null;
        sean.describe();

        System.out.println("Students get to pick some foods");
        mrHernandez.order(pbjSandwich);
        mrHernandez.describe();

        sean.order(cheeseburger);
        sean.order(strawberrymilk);
        sean.describe();

        eric.order(toast);
        eric.describe();

        System.out.println("Students get to eat the food on their tray");
        System.out.println("Students get to report their satisfaction");
    }
}
