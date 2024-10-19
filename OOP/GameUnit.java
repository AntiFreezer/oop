package com.dmitrydrobysh.app;
import java.util.Random;

class GameUnit{
	private String name = "";
	private int health = 100;
	private int strength = 20;
	private int WEIGHT = 80;
	private int HEIGHT = 170;
	private String Type = "Default";
	private String Phrase = "HI";


	public GameUnit(int health, int strength){
		this.health = health;
		this.strength = strength;
	}

	public int getHealth(){
		return this.health;
	}

	public int getStrength(){
		return this.strength;
	}

	public void setStrength(int strength){
		this.strength = strength;
	}

	public void setHealth(int health){
		this.health = health;
	}

	public void attack(GameUnit enemy){
		// But what to do if health is < 0 ???
		Random random = new Random();
		double rand = random.nextDouble();
		int res = 0;
		if(this.Type == "TANK")
		{
			res = (rand < 0.7) ? 1 : 0;
		}

		else if(this.Type == "HEALER")
		{
			res = (rand < 0.4) ? 1 : 0;
		}

		else if(this.Type == "FLANG")
		{
			res = (rand < 0.95) ? 1 : 0;
		}

		else if(this.Type == "DAMAGE_DEALER")
		{
			res = (rand < 0.85) ? 1 : 0;
		}
		enemy.setHealth(enemy.getHealth() - this.strength - res * (HEIGHT/WEIGHT));
	}
}