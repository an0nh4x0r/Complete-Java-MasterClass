package in.swapnilsingh;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
//        Here we can't use primitive types like int, double, float, char in the diamond operator
//        We need to supply it Object like String.
//        So wrapper classes like Integer, Double, Float comes in to the rescue of primitive data type.
//        And this is where the concept of autoboxing and unboxing comes.

//        -----------------    AUTOBOXING  ---------------------
        integerArrayList.add(Integer.valueOf(1));
//        Here autoboxing is happening ... We're providing "primitive int" to it's wrapper class
//        Integer.valueOf(primitive int)
        integerArrayList.add(2);
//        This syntax is also correct as java on compile time is converting the above statement to
//        integerArrayList.add(Integer.valueOf(2)) ... basically java is doing autoboxing for us.

//        -----------------    UNBOXING  ---------------------
        System.out.println(integerArrayList.get(0).intValue());
//        Here unboxing is happening ... We're getting the 0th index of the ArrayList and then we're
//        getting it's primitive integer value by using intValue() method ... basically unboxing.
        System.out.println(integerArrayList.get(1));
//        This syntax is also correct as java on compile time is converting the above statement to
//        integerArrayList.get(1).intValue() ... basically java is doing unboxing for us.
    }
}
