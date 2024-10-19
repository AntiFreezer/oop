package com.dmitrydrobysh.app;
class Tank extends GameUnit{
	private int shield = 1500;
	private String Type = "TANK";
	public Tank(int health, int strength, int shield){
		super(health, strength);
		this.shield = shield;
	}

	public void say(){
		System.out.println("I am TAAANK");
	}

	@Override
	public void attack(GameUnit unit){
		unit.setHealth(unit.getHealth() - this.getStrength() - shield/this.getHealth());
	}

	public static void printObjLink(Tank tank){
		System.out.println(tank);
	}
}