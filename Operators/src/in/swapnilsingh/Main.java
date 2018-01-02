package in.swapnilsingh;

public class Main {

    public static void main(String[] args) {
        // ternary operator
        int x = 40;
	    String wasCar = ((x-2)/4 > 52/5) ? "Value is true" : "Value is false";
        System.out.println(wasCar);

        double myVar = 20;
        double mySecondVar = 80;
        String answer = ((myVar + mySecondVar) * 25 ) % 40 <= 20 ? "Total was over the limit" : "Total was not over the limit";
        System.out.println(answer);
    }
}
