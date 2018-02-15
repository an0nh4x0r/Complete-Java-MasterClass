package in.swapnilsingh;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(30, 20, true);
        System.out.println("Is the printer a duplex printer: " + printer.isDuplexPrinter());

        Printer printer1 = new Printer(25, 1, false);
        System.out.println("Is the printer a duplex printer: " + printer1.isDuplexPrinter());

        printer.simulatePagePrinting();
        printer1.simulatePagePrinting();

    }
}
