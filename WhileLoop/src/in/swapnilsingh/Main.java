package in.swapnilsingh;

import java.util.Scanner;

public class Main {

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (isEvenNumber(n)){
            System.out.println(n + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
        }

        int startDigit = 1;
        int endDigit = 20;
        int counter = 0;

        while(startDigit != endDigit) {
            if (isEvenNumber(startDigit)) {
                counter += 1;
                System.out.println(startDigit + " is an even number");
            }
            if (counter == 5)
                break;
            startDigit += 1;
        }

        int count = 1;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count += 1;
        }

        System.out.println();

        count = 1;
        while (true) {
            if (count == 6)
                break;
            System.out.println("Count value is " + count);
            count += 1;
        }

        System.out.println();

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count += 1;
        } while (count != 6);
    }
}
