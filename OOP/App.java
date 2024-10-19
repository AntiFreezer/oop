package com.dmitrydrobysh.app;

public class App {
    public static void main( String[] args ){
        MyInteger integer = new MyInteger(5);
        System.out.println(integer.getValue());

        GameUnit unit1 = new GameUnit(50, 10);
        GameUnit unit2 = new GameUnit(60, 20);

        System.out.println("Unit1");
        System.out.println(unit1.getStrength());
        System.out.println(unit1.getHealth());
        
        System.out.println("Unit2");
        System.out.println(unit2.getStrength());
        System.out.println(unit2.getHealth());

        System.out.println("Unit1 attacks Unit2");
        unit1.attack(unit2);
       
        System.out.println("Unit1");
        System.out.println(unit1.getStrength());
        System.out.println(unit1.getHealth());
               
        System.out.println("Unit2");
        System.out.println(unit2.getStrength());
        System.out.println(unit2.getHealth());


        Tank tank = new Tank(1000, 50, 200);
        System.out.println("Tank");
        System.out.println(tank.getStrength());
        System.out.println(tank.getHealth());

        System.out.println("Tank attacks Unit2");
        tank.attack(unit2);

        System.out.println("Unit2");
        System.out.println(unit2.getStrength());
        System.out.println(unit2.getHealth());

        System.out.println("Unit1 attacks Tank");
        unit1.attack(tank);

        System.out.println("Tank");
        System.out.println(tank.getHealth());
        System.out.println(tank.getStrength());

        Tank.printObjLink(tank); // OK
        //Tank.printObjLink(unit2); Error. Why?


    }
}
