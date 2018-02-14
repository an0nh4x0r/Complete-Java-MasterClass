package in.swapnilsingh;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case aCase = new Case("2200", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27 inch beast", "Acer",
                27, new Resolution(2540, 1440));

        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus",
                4, 5, "v2.44");

        PC pc = new PC(aCase, monitor, motherBoard);
        pc.getMonitor().drawPixelAt(1500, 1200, "red");
        pc.getMotherBoard().loadProgram("Windows 10");
        pc.getaCase().pressPowerButton();

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Swapnil", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
