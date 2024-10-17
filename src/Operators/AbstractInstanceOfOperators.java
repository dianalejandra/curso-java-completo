package Operators;

public class AbstractInstanceOfOperators {
    public static void main(String[] args) {
        Object text = "This is a String class object ... yeah!";
        Number num = Integer.valueOf(7);  // 7;

        boolean b1 =  text instanceof String;
        System.out.println("Is text a String type? " + b1);

        b1 = text instanceof Integer;
        System.out.println("Is text an Integer type? " + b1);

        b1=  text instanceof Object;
        System.out.println("Is text an Object type? " + b1);

        b1 = num instanceof Integer;
        System.out.println("Is num a Integer type? " + b1);

        b1 = num instanceof Number;
        System.out.println("Is num a Number type? " + b1);

        b1 = num instanceof Object;
        System.out.println("Is num an Object type? " + b1);

        b1 = num instanceof Long;
        System.out.println("Is num a Long type? " + b1);

        b1 = num instanceof Double;
        System.out.println("Is num a Double type? " + b1);

        Number decimal = 45.54f;
        b1 = decimal instanceof Double;
        System.out.println("Is decimal a Double type? " + b1);

        b1 = decimal instanceof Float;
        System.out.println("Is decimal a Float type? " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("Is decimal a Integer type? " + b1);

        b1 = decimal instanceof Number;
        System.out.println("Is decimal a Number type? " + b1);
    }
}
