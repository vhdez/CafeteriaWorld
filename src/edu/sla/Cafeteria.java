package edu.sla;

public class Cafeteria {

    public static void main(String[] args) {
        System.out.println("Here is my world of Cafeteria food!");
        System.out.println("Display all the food available for students");
        // tell all the foods to describe themselves
        Food icecream = new Food();
        icecream.name = ("Ice Cream");
        icecream.servingSize = 1;
        icecream.describe();

        Food fishandchips = new FishandChips();
        fishandchips.name = "Fish and Chips";
        fishandchips.servingSize = 1;
        fishandchips.describe();

        Food hotDog1 = new Food();
        hotDog1.name = "hot dog";
        hotDog1.servingSize = 1;
        hotDog1.describe();

        Food spagetti = new Food();
        spagetti.name = "Spagetti";
        spagetti.servingSize = 1;
        spagetti.describe();

        Food hotDog2 = new Food();
        hotDog2.name = "hot dog";
        hotDog2.servingSize = 1;
        hotDog2.describe();

        Food general_tso_chicken = new Food();
        general_tso_chicken.name = "general tso chicken";
        general_tso_chicken.servingSize = 7;
        general_tso_chicken.describe();

        Food cheeseburger = new Food();
        cheeseburger.name = "Cheeseburger";
        cheeseburger.servingSize = 1;
        cheeseburger.describe();

        Food strawberrymilk = new Food();
        strawberrymilk.name = "Strawberry Milk";
        strawberrymilk.servingSize = 1;
        strawberrymilk.describe();

        Food water = new Food();
        water.name = "Water or Wader";
        water.servingSize = 1;
        water.describe();

        Food Pudding = new Food();
        Pudding.name = "Pudding";
        Pudding.servingSize = 1;
        Pudding.describe();

        Food pbjSandwich = new Food();
        pbjSandwich.name = "PBJ Sandwich";
        pbjSandwich.describe();

        Food toast = new Food();
        toast.name = "Toast";
        toast.servingSize = 1;
        toast.describe();

        Food Pizza = new Food();
        Pizza.name = "Pizza";
        Pizza.servingSize = 1;
        Pizza.describe();

        System.out.println("These students are in the cafeteria:");
        Student tashon = new Student();
        tashon.name = "Tashon";
        tashon.myOrder = null;
        tashon.describe();

        Student mrHernandez = new Student();
        mrHernandez.name = "Mr. H";
        mrHernandez.myOrder = null;
        mrHernandez.describe();

        Student eric = new Student();
        eric.name = "Eric Casalena";
        eric.myOrder = null;
        eric.describe();

        Student Miles = new Student();
        Miles.name = "Miles";
        Miles.myOrder = null;
        Miles.describe();

        Student sean = new Student();
        sean.name = "Sean Hogan";
        sean.myOrder = null;
        sean.describe();

        Student Terrence = new Student();
        Terrence.name = "Terrence Blocker";
        Terrence.myOrder = null;
        Terrence.describe();

        Student Michael = new Student();
        Michael.name = "Michael Rojas";
        Michael.myOrder = null;
        Michael.describe();

        System.out.println("Students get to pick some foods");
        sean.order(fishandchips);
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

        tashon.order(hotDog1);
        tashon.describe();
        mrHernandez.order(hotDog2);
        mrHernandez.describe();
        System.out.println("Students get to eat the food on their tray");
        tashon.eat();
        mrHernandez.eat();
        System.out.println("Students get to report their satisfaction");
        tashon.describe();
        mrHernandez.describe();
        Michael.order(hotDog2);
    }
}