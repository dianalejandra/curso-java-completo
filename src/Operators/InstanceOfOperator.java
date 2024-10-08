package Operators;

public class InstanceOfOperator {
    public static void main(String[] args) {
        // With instanceof we check the type of object the value is
        String text = "This is a String class object ... yeah!";
        Integer num = 7;

        boolean b1 =  text instanceof String;
        System.out.println("Is text a String type? " + b1);

        b1=  text instanceof Object;
        System.out.println("Is text an Object type? " + b1);

        b1 = num instanceof Integer;
        System.out.println("Is num a Integer type? " + b1);

        b1 = num instanceof Number;
        System.out.println("Is num a Number type? " + b1);

        b1 = num instanceof Object;
        System.out.println("Is num an Object type? " + b1);

        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("Is decimal a Number type? " + b1);

    }
}
