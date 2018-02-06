package in.swapnilsingh;

public class Car extends Vehicle {
    public int doors;
    public int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
