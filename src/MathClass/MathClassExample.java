package MathClass;

public class MathClassExample {
    public static void main(String[] args) {

        // Math class is composed by static methods that can't be instantiated. They are used to perform mathematical operations.

        int absolute = Math.abs(-3);
        System.out.println("absolute = " + absolute);

        absolute = Math.abs(3);
        System.out.println("absolute = " + absolute);

        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5,1.2);
        System.out.println("min = " + min);

        double ceil = Math.ceil(3.5);
        System.out.println("ceil = " + ceil);

        double floor = Math.floor(3.5);
        System.out.println("floor = " + floor);

        long round = Math.round(Math.PI);
        System.out.println("round = " + round);


    }
}
