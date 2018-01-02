package in.swapnilsingh;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 5 / 2;
	    float myFloatValue = 5f / 3f;
	    double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue is: " + myIntValue);
        System.out.println("myFloatValue is: " + myFloatValue);
        System.out.println("myDoubleValue is: " + myDoubleValue);

        double myPoundVariable = 200d;
        double myKilogramVariable = myPoundVariable * 0.45359237;
        System.out.println(myKilogramVariable);
    }
}
