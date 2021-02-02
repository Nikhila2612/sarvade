public class EnhancedPlayer {
    private String name;
    private int health=100;
    private String weapons;

    public EnhancedPlayer(String name, int health, String weapons) {
        this.name = name;
        if(health >0 && health<=100){
            this.health = health;
        }
        this.weapons = weapons;

    }
    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("player knocked out");
        }
    }

    public int getHealth() {
        return health;
    }
}