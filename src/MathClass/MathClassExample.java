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

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double pow = Math.pow(10,3);
        System.out.println("pow = " + pow);

        double sqrt = Math.sqrt(5);
        System.out.println("sqrt = " + sqrt);

        double degrees = Math.toDegrees(1.57);
        degrees = Math.round(degrees);
        System.out.println("convert radians to degrees = " + degrees);

        double radians = Math.toRadians(90);
        System.out.println("convert degrees to radians = " + radians);

        System.out.println("sin(90) = " + Math.sin(radians));
        System.out.println("cos(90) = " + Math.cos(radians));

        radians = Math.toRadians(180.00);
        System.out.println("cos(180) = " + Math.cos(radians));

        radians = Math.toRadians(0.00);
        System.out.println("cos(180) = " + Math.cos(radians));
    }
}
