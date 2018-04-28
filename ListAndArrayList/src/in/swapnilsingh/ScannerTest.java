package in.swapnilsingh;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String pooriLine = scanner.nextLine();
        int num2 = scanner.nextInt();
        System.out.println(num);
        System.out.println(num2);
        System.out.println(pooriLine);
    }

}
