package Primitives;

public class BooleanPrimitives {
    public static void main(String[] args) {

        boolean logicData = true;
        System.out.println("logicData = " + logicData);

        double d = 98765.43e-3; // 98.76543
        System.out.println("d = " + d);
        float f = 12345e2f; // 123.45
        System.out.println("f = " + f);

        logicData = d < f;
        System.out.println("logicData = " + logicData);

        boolean isEqual = (3-3 == 1);
        System.out.println("isEqual = " + isEqual);


    }
}
