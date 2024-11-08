import java.util.Random;

class GameUnit{
    private String name = "";
    private int health = 100;
    private int strength = 20;
    private int WEIGHT = 80;
    private int HEIGHT = 170;
    private String Type = "Default";
    private String Phrase = "HI";
    private int orig_health = 100;

    public GameUnit(int health, int strength, String Type){
        this.health = health;
        this.strength = strength;
        this.Type = Type;
        this.orig_health = health;
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
        double plus_damage = 0;
        if(this.Type == "TANK")
        {
            res = (rand < 0.7) ? 1 : 0;
            WEIGHT = 150;
            HEIGHT = 200;
            if (orig_health / health < 0.3) {
                plus_damage = (double)enemy.getHealth() * 0.3;
            }

        }

        else if(this.Type == "HEALER")
        {
            res = (rand < 0.4) ? 1 : 0;
            WEIGHT = 90;
            HEIGHT = 190;
        }

        else if(this.Type == "FLANG")
        {
            res = (rand < 0.95) ? 1 : 0;
            WEIGHT = 60;
            HEIGHT = 170;
        }

        else if(this.Type == "DAMAGE_DEALER")
        {
            res = (rand < 0.85) ? 1 : 0;
            WEIGHT = 80;
            HEIGHT = 185;
        }
        enemy.setHealth(enemy.getHealth() - this.strength - res * (HEIGHT/WEIGHT) - (int)plus_damage);

    }
}
