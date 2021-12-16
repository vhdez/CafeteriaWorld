package edu.sla;

public class Cafeteria {

    public static void main(String[] args) {
        System.out.println("Here is my world of Cafeteria food!");
        System.out.println("Display all the food available for students");
        // tell all the foods to describe themselves
        Food icecream = new Food();
        icecream.name = ("Ice Cream");
        icecream.foodGroup = "dairy";
        icecream.servingsLeft = 1;
        icecream.servingSize = 1;
        icecream.describe();

        Food hotDog1 = new Food();
        hotDog1.name = "hot dog";
        hotDog1.foodGroup = "protein";
        hotDog1.servingsLeft = 2;
        hotDog1.servingSize = 1;
        hotDog1.describe();

        Food hotDog2 = new Food();
        hotDog2.name = "hot dog";
        hotDog2.foodGroup = "protein";
        hotDog2.servingsLeft = 2;
        hotDog2.servingSize = 1;
        hotDog2.describe();

        Food general_tso_chicken = new Food();
        general_tso_chicken.name = "general tso chicken";
        general_tso_chicken.foodGroup = "protein";
        general_tso_chicken.servingsLeft = 350;
        general_tso_chicken.servingSize = 7;
        general_tso_chicken.describe();

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

        Food water = new Food();
        water.name = "Water or Wader";
        water.foodGroup = "drink";
        water.servingsLeft = 20;
        water.servingSize = 1;
        water.describe();

        Food Pudding = new Food();
        Pudding.name = "Pudding";
        Pudding.foodGroup = "Dairy";
        Pudding.servingsLeft = 100;
        Pudding.servingSize = 1;
        Pudding.describe();

        Food pbjSandwich = new Food();
        pbjSandwich.name = "PBJ Sandwich";
        pbjSandwich.servingsLeft = 45;
        pbjSandwich.describe();

        Food toast = new Food();
        toast.name = "Toast";
        toast.servingsLeft = 25;
        toast.servingSize = 1;
        toast.describe();

        Food Pizza = new Food();
        Pizza.name = "Pizza";
        Pizza.foodGroup = "protein";
        Pizza.servingsLeft = 15;
        Pizza.servingSize = 1;
        Pizza.describe();

        System.out.println("These students are in the cafeteria:");
        Student tashon = new Student();
        tashon.name = "Tashon";
        tashon.theirOrder = null;
        tashon.describe();

        Student mrHernandez = new Student();
        mrHernandez.name = "Mr. H";
        mrHernandez.theirOrder = null;
        mrHernandez.describe();

        Student eric = new Student();
        eric.name = "Eric Casalena";
        eric.theirOrder = null;
        eric.describe();

        Student Miles = new Student();
        Miles.name = "Miles";
        Miles.theirOrder = null;
        Miles.describe();

        Student sean = new Student();
        sean.name = "Sean Hogan";
        sean.theirOrder = null;
        sean.describe();

        Student Terrence = new Student();
        Terrence.name = "Terrence Blocker";
        Terrence.theirOrder = null;
        Terrence.describe();

        Student Michael = new Student();
        Michael.name = "Michael Rojas";
        Michael.theirOrder = null;
        Michael.describe();

        System.out.println("Students get to pick some foods");
        sean.order(cheeseburger);
        sean.order(strawberrymilk);
        sean.describe();

        eric.order(toast);
        eric.describe();

        Terrence.order(general_tso_chicken);
        Terrence.describe();

        Miles.order(Pudding);
        Miles.describe();

        //Michael.order(Pizza);
        Michael.describe();

        System.out.println("Hot Dogs can be served " + hotDog1.servingsLeft + " more times.");
        tashon.order(hotDog1);
        System.out.println("Hot Dogs can be served " + hotDog1.servingsLeft + " more times.");
        tashon.describe();
        System.out.println("Hot Dogs can be served " + hotDog2.servingsLeft + " more times.");
        mrHernandez.order(hotDog2);
        System.out.println("Hot Dogs can be served " + hotDog2.servingsLeft + " more times.");
        mrHernandez.describe();
        System.out.println("Students get to eat the food on their tray");
        tashon.eat();
        mrHernandez.eat();
        System.out.println("Students get to report their satisfaction");
        tashon.describe();
        mrHernandez.describe();
        System.out.println("Hot Dogs can be served " + hotDog1.servingsLeft + " more times.");
        Michael.order(hotDog2);
    }
}