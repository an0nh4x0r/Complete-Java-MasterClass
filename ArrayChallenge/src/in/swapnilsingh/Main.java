package in.swapnilsingh;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] myArray = getIntegers(5);
	    printArray(myArray);
	    myArray = sortIntegers(myArray);
	    printArray(myArray);
    }

    private static int[] getIntegers(int num) {
        int[] myIntArray = new int[num];
        for (int i = 0; i < num; ++i) {
            System.out.println("Enter the " + i + "st element: ");
            myIntArray[i] = scanner.nextInt();
        }
        return myIntArray;
    }

    private static void printArray(int[] myArray) {
        System.out.println();
        System.out.println("printing the array");
        for (int i = 0; i < myArray.length; ++i) {
            System.out.println(myArray[i]);
        }
        System.out.println();
    }

    private static int[] sortIntegers(int[] myArray) {
        Arrays.sort(myArray);
        int[] myNewArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; ++i) {
            myNewArray[myArray.length - (i+1)] = myArray[i];
        }
        return myNewArray;
    }
}
