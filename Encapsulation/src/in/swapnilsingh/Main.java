package in.swapnilsingh;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Swapnil";
        player.health = 100;
        player.weapon = "Trident";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 91;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Swapnil", 100, "Trident");
        System.out.println("Initial health is: " + enhancedPlayer.getHealth());
    }
}
