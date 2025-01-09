package Wrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        // we convert the primitive to an Integer object with the autoboxing
        int primitiveInt = 32700;
        // boxing example
        Integer intObject = Integer.valueOf(primitiveInt);
        // autoboxing example
        Integer intObject2 = 127;

        System.out.println("intObject = " + intObject);
        System.out.println("intObject2 = " + intObject2);

        // converting an Integer object to a primitive
        //implicit way of conversion
        int num = intObject;
        //explicit way of conversion
        int num2 = intObject2.intValue();

        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

        // STRINGS
        // convert a string to an integer
        String tvLcdValue = "67000";
        Integer value = Integer.valueOf(tvLcdValue);
        System.out.println("value = " + value);

        // SHORT
        // convert short to Short object using an integer value
        Short shortObject = intObject.shortValue();
        System.out.println("shortObject = " + shortObject);

        // BYTE
        Byte byteObject = intObject2.byteValue();
        System.out.println("byteObject = " + byteObject);

        // LONG
        Long longObject = intObject.longValue();
        System.out.println("longObject = " + longObject);




    }
}
