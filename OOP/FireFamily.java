public class FireFamily extends GameUnit {
    private String name = "";
    private int health = 100;
    private int strength = 20;
    private int WEIGHT = 80;
    private int HEIGHT = 170;
    private String Type = "Default";
    private String Phrase = "HI";
    private int orig_health = 100;

    public FireFamily(int health, int strength, TypesGU Type) {
        super(health, strength, Type);
        this.orig_health = health;

    }

    @Override
    public void attack(GameUnit enemy) {
        int coef = 1;
        if (enemy instanceof FireFamily) {
            coef = 0;
        }
        ;
        if (enemy instanceof WindFamily) {
            coef = 3;
        }
        ;
        if (enemy instanceof GroundFamily) {
            coef = 2;
        }
        int damg = damage(enemy) * coef;
        if(enemy.shield > 0){
            enemy.shield -= damg;
        }
        else {
            enemy.setHealth(enemy.getHealth() - damg);
        }
        System.out.println(damg);
    }
}
