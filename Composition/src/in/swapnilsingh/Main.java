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
    }
}
