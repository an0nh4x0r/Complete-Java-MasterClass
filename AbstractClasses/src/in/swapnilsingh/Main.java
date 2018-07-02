package in.swapnilsingh;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Bird bird = new Parrot("Australian ringneck");
        bird.breathe();
        bird.eat();
        bird.fly();

        Bird bird1 = new Penguin("Emperor");
        bird1.breathe();
        bird1.eat();
        bird1.fly();
    }
}
