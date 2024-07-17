package Primitives;

public class FloatPrimitives {
    public static void main(String[] args) {
        /* MORE NUMERIC PRIMITIVES PRACTICE*/
        float realFloat = 0.00000000015f; // 1.5e-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float type corresponds to " + Float.BYTES + " in bytes");
        System.out.println("float type corresponds to " + Float.SIZE + " in bits");
        System.out.println("max value of a float: " + Float.MAX_VALUE);
        System.out.println("min value of a float: " + Float.MIN_VALUE);
        System.out.println();

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double type corresponds to " + Double.BYTES + " in bytes");
        System.out.println("double type corresponds to " + Double.SIZE + " in bits");
        System.out.println("max value of a double: " + Double.MAX_VALUE);
        System.out.println("min value of a double: " + Double.MIN_VALUE);
        System.out.println();

        float varFloat = 3.1416f;
        System.out.println("varFloat = " + varFloat);

    }
}
