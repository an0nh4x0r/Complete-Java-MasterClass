package in.swapnilsingh;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        if (this.health <= damage) {
            this.health = 0;
            System.out.println("Player knocked out");
        } else {
            this.health -= damage;
        }
    }

    public int healthRemaining() {
        return this.health;
    }



}
