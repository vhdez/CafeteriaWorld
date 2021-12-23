package edu.sla;

public class BrokenPizza {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.name = "pizza slice";
        pizza1.servingSize = 2;
        pizza1.describe();

        Pizza pizza2 = new Pizza();
        pizza2.name = "pizza slice";
        pizza2.servingSize = 2;
        pizza2.describe();

        Pizza pizza3 = new Pizza();
        pizza3.name = "pizza slice";
        pizza3.servingSize = 4;
        pizza3.describe();

        Food icecream = new Food();
        icecream.name = ("Ice Cream");
        icecream.servingSize = 1;
        icecream.describe();

        pizza3.describe();

        System.out.println("These students are in the cafeteria:");
        Student tashon = new Student();
        tashon.name = "Tashon";
        tashon.myOrder = null;
        tashon.describe();

        Student mrHernandez = new Student();
        mrHernandez.name = "Mr. H";
        mrHernandez.myOrder = null;
        mrHernandez.describe();

        mrHernandez.order(pizza1);
        tashon.order(pizza2);
        mrHernandez.eat();
        tashon.eat();

    }
}