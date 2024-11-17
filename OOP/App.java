public class App{
    public static void main( String[] args ){

        GameUnit unit1 = new GameUnit(300, 40, TypesGU.TANK);
        GameUnit unit2 = new GameUnit(200, 50, TypesGU.HEALER);


        System.out.println("--Unit1--");
        System.out.println("Unit1 strength: " + unit1.getStrength());
        System.out.println("Unit1 shield: " + unit1.shield);
        System.out.println("Unit1 health: " + unit1.getHealth());

        System.out.println("--Unit2--");
        System.out.println("Unit2 strength: " + unit2.getStrength());
        System.out.println("Unit2 health: " + unit2.getHealth());

        //------------------------------------

        System.out.println("-- ROUND 1 --");
        System.out.println("Unit1 attacks Unit2");
        unit1.attack(unit2);
        System.out.println("Unit1 health: " + unit1.getHealth());
        System.out.println("Unit1 shield: " + unit1.shield);
        System.out.println("Unit2 health: " + unit2.getHealth());

        //------------------------------------

        System.out.println("-- ROUND 2 --");
        System.out.println("Unit2 attacks Unit1");
        unit2.attack(unit1);

        System.out.println("Unit1 health: " + unit1.getHealth());
        System.out.println("Unit1 shield: " + unit1.shield);
        System.out.println("Unit2 health: " + unit2.getHealth());

        //------------------------------------

        System.out.println("-- ROUND 3 --");
        System.out.println("Unit1 attacks Unit2");
        unit1.attack(unit2);

        System.out.println("Unit1 health: " + unit1.getHealth());
        System.out.println("Unit1 shield: " + unit1.shield);
        System.out.println("Unit2 health: " + unit2.getHealth());

        //------------------------------------

        System.out.println("-- ROUND 4 --");
        System.out.println("Unit2 attacks Unit1");
        unit2.attack(unit1);

        System.out.println("Unit1 health: " + unit1.getHealth());
        System.out.println("Unit1 shield: " + unit1.shield);
        System.out.println("Unit2 health: " + unit2.getHealth());


        //------------------------------------

        System.out.println("-- ROUND 5 --");
        System.out.println("Unit1 attacks Unit2");
        unit1.attack(unit2);

        System.out.println("Unit1 health: " + unit1.getHealth());
        System.out.println("Unit1 shield: " + unit1.shield);
        System.out.println("Unit2 health: " + unit2.getHealth());

        //------------------------------------

        System.out.println("-- ROUND 6 --");
        System.out.println("Unit2 attacks Unit1");
        unit2.attack(unit1);

        System.out.println("Unit1 health: " + unit1.getHealth());
        System.out.println("Unit1 shield: " + unit1.shield);
        System.out.println("Unit2 health: " + unit2.getHealth());

        //------------------------------------

        System.out.println("-- ROUND 7 --");
        System.out.println("Unit1 attacks Unit2");
        unit1.attack(unit2);

        System.out.println("Unit1 health: " + unit1.getHealth());
        System.out.println("Unit1 shield: " + unit1.shield);
        System.out.println("Unit2 health: " + unit2.getHealth());

        //------------------------------------

        System.out.println("-- ROUND 8 --");
        System.out.println("Unit2 attacks Unit1");
        unit2.attack(unit1);

        System.out.println("Unit1 health: " + unit1.getHealth());
        System.out.println("Unit1 shield: " + unit1.shield);
        System.out.println("Unit2 health: " + unit2.getHealth());

        //------------------------------------

        System.out.println("-- ROUND 9 --");
        System.out.println("Unit1 attacks Unit2");
        unit1.attack(unit2);

        System.out.println("Unit1 health: " + unit1.getHealth());
        System.out.println("Unit1 shield: " + unit1.shield);
        System.out.println("Unit2 health: " + unit2.getHealth());

        //------------------------------------

        System.out.println("-- ROUND 10 --");
        System.out.println("Unit2 attacks Unit1");
        unit2.attack(unit1);

        System.out.println("Unit1 health: " + unit1.getHealth());
        System.out.println("Unit1 shield: " + unit1.shield);
        System.out.println("Unit2 health: " + unit2.getHealth());


    }
}
