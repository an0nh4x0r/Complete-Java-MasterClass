package in.swapnilsingh;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        System.out.println(myIntArray[5]);

        double[] myDoubleArray = new double[10];

        int[] myAnotherIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < myAnotherIntArray.length; ++i) {
            System.out.println(i + " : " + myAnotherIntArray[i]);
        }

        int[] myAnotherOneIntArray = new int[25];

        for (int i = 0; i < myAnotherOneIntArray.length; ++i) {
            myAnotherOneIntArray[i] = i*9;
        }

        for (int myIntvar :
                myAnotherOneIntArray) {
            System.out.println(myIntvar);
        }

//        System.out.println(myAnotherIntArray[100]);

        printArray(myAnotherOneIntArray);

        int[] myNewArray = getIntegers(3);
        System.out.println("The average is: " + getAverage(myNewArray));

    }

    private static void printArray(int[] myArray) {
        System.out.println("printArray waala function");
        for (int i = 0; i < myArray.length; ++i) {
            System.out.println(myArray[i]);
        }
    }

    private static int[] getIntegers(int num) {
        int[] myIntArray = new int[num];
        for (int i = 0; i < myIntArray.length; ++i) {
            System.out.println("Enter the " + i + "st element: ");
            myIntArray[i] = scanner.nextInt();
        }
        return myIntArray;
    }

    private static double getAverage(int[] myIntArray) {
        int sum = 0;
        for (int i = 0; i < myIntArray.length; ++i) {
            sum += myIntArray[i];
        }
        return (double) sum / (double) myIntArray.length;
    }

}
