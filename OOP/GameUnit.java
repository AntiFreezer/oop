import java.util.Random;

class GameUnit implements Funcs{
    private String name = "";
    private int health = 100;
    private int strength = 20;
    private int WEIGHT = 80;
    private int HEIGHT = 170;
    private TypesGU Type = TypesGU.DEFAULT_UNIT;
    private String Phrase = "HI";
    private int shield = 0;
    public GameUnit(int health, int strength, TypesGU Type){
        this.health = health;
        this.strength = strength;
        this.Type = Type;
        if (this.Type == TypesGU.TANK){
            this.shield = 200;
        }
    }
    public int getHealth(){
        return this.health;
    }
    public int getStrength(){
        return this.strength;
    }
    public int getShield(){
        return this.shield;
    }
    
    public int setShield(int shield){
        this.shield = shield;
    }
    
    
    public void setStrength(int strength){
        this.strength = strength;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void attack(GameUnit enemy){
        // But what to do if health is < 0 ???
        int damg = damage(enemy);
        if(enemy.getShield() > 0){
            enemy.setShield(enemy.getShield - damg);
        }
        else {
            enemy.setHealth(enemy.health - damg);
        }
        System.out.println(damg);
    }
    public int damage(GameUnit enemy){
        Random random = new Random();
        double rand = random.nextDouble();
        int res = 0;
        double plus_damage = 0;
        if(this.Type == TypesGU.TANK)
        {
            res = (rand < 0.03) ? 1 : 0;
            WEIGHT = 150;
            HEIGHT = 200;
            plus_damage = res*((double)WEIGHT/(double)HEIGHT) * 10;
            res = 1;
            
        }
        else if(this.Type == TypesGU.HEALER)
        {
            res = (rand < 0.05) ? 2 : 1;
        }
        else if(this.Type == TypesGU.FlANG)
        {
            res = (rand < 0.15) ? 2 : 1;
        }
        else if(this.Type == TypesGU.DAMAGE_DEALER)
        {
            res = (rand < 0.1) ? 3 : 1;
        }
        return (this.strength * res + (int)plus_damage);
    }
    @Override
    public void Heal(){
        if (this.Type == TypesGU.HEALER){
            this.health += 10;
        }
    }
}
