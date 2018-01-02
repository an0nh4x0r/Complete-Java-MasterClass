package in.swapnilsingh;

public class Main {

    public static void main(String[] args) {

        byte myByteVariable = (Byte.MIN_VALUE + Byte.MAX_VALUE) / 2;
        short myShortVariable = (Short.MIN_VALUE + Short.MAX_VALUE) / 2;
        int myIntVariable = (Integer.MIN_VALUE + Integer.MAX_VALUE) / 2;

        long myLongVariable = 50000 + 10 * (myByteVariable + myShortVariable + myIntVariable);

        System.out.println(myLongVariable);

    }
}
