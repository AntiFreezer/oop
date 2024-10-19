package com.dmitrydrobysh.app;

class Healer extends GameUnit {
    private double weak_coef = 0.1;
    private String Type = "HEALER";
    public Healer(int health, int strength, int weak_coef) {
        super(health, strength);
        this.weak_coef = weak_coef;
    }
    public void say(){
        System.out.println("1");
    }

    @Override
    public void attack(GameUnit unit){
        unit.setHealth(unit.getHealth() - this.getStrength() + (int)(this.weak_coef*(double)this.getStrength()));
    }
}
