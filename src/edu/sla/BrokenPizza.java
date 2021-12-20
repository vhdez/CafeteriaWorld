package edu.sla;

public class BrokenPizza {

    public static void main(String[] args) {
        Food pizza1 = new Food();
        pizza1.name = "Pizza Slice 1";
        pizza1.foodGroup = "protein";
        pizza1.servingsLeft = 20;
        pizza1.servingSize = 2;
        pizza1.describe();

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
        tashon.order(pizza1);
        mrHernandez.eat();
        tashon.eat();

    }
}