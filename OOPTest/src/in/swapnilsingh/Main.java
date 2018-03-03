package in.swapnilsingh;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("The burger price is: " + hamburger.itemizeHamburger());

        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        System.out.println("Total healthy burger price is: " + healthyBurger.itemizeHamburger());

        System.out.println();

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition2("Somenew item", 3.4);
        System.out.println("Total deluxe burger price is: " + db.itemizeHamburger());
    }
}
