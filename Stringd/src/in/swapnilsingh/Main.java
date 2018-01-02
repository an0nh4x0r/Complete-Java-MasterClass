package in.swapnilsingh;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is a string";
        System.out.println("The string is: " + myString);

        myString = myString + ", and this is more.";
        System.out.println("My String is equal to: " + myString);
        myString = myString + '\u00A9';

        System.out.println("My String is equal to: " + myString);
        int myInt = 9;
        String s = "Hellow";
        System.out.println(s + myInt);
        System.out.println(myInt + s);
        double d = 14d;
        System.out.println(s + d);
    }
}
