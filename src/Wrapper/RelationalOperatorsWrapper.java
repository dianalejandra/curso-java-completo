package Wrapper;

public class RelationalOperatorsWrapper {
    public static void main(String[] args) {

        // these are objects that wrap the value of a number
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Are the same object? " + (num1 == num2));

        num2 = 500;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Are the same object? " + (num1 == num2));

        // with "==" you compare the object of the wrapper and not the value
        // to compare between wrappers we use the .equals() method
        System.out.println("Do they have the same value? " + (num1.equals(num2)));

        // another way is by converting explicitly to primitives and then comparing
        System.out.println("Do they have the same value? " + (num1.intValue() == num2.intValue()));

        // with "<" or ">" or arithmetic operations (except "=="), you can compare wrappers. There is an auto-unboxing performed that allows you to compare between them
        boolean condition = num1 < num2;
        System.out.println("condition = " + condition);

        boolean condition2 = num1.intValue() < num2.intValue();
        System.out.println("condition2 = " + condition2);
    }
}
