package com.dmitrydrobysh.app;

class Damage_dealer extends GameUnit {
    private double buff_coef = 0.4;
    private String Type = "DAMAGE_DEALER";
    public Damage_dealer(int health, int strength, int buff_coef) {
        super(health, strength);
        this.buff_coef = buff_coef;
    }
    public void say(){
        System.out.println("2");
    }

    @Override
    public void attack(GameUnit unit){
        unit.setHealth(unit.getHealth() - this.getStrength() - (int)(this.buff_coef*(double)this.getStrength()));
    }
}
