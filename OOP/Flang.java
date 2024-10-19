package com.dmitrydrobysh.app;

class Flang extends GameUnit {
    private double buff_coef = 0.2;
    private String Type = "Flang";
    public Flang(int health, int strength, int buff_coef) {
        super(health, strength);
        this.buff_coef = buff_coef;
    }
    public void say(){
        System.out.println("3");
    }

    @Override
    public void attack(GameUnit unit){
        unit.setHealth(unit.getHealth() - this.getStrength() - (int)(this.buff_coef*(double)this.getStrength()));
    }
}

