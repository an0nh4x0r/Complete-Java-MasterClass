package in.swapnilsingh;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillUpTheToner(int level) {
        this.tonerLevel += level;
    }

    public void simulatePagePrinting() {
        int num = this.numberOfPagesPrinted;
        for (int i = 0; i < num; ++i) {
            System.out.print(numberOfPagesPrinted + " ");
            this.numberOfPagesPrinted -= 1;
        }
        System.out.println(this.numberOfPagesPrinted);
        System.out.println("All the jobs are finished");
        System.out.println("Number of jobs remaining: " + this.numberOfPagesPrinted);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
