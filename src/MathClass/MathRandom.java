package MathClass;

import java.util.Random;

public class MathRandom {
    public static void main(String[] args) {
        // Math.random() returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.

        String [] colors = {"Red", "Blue", "Green", "Yellow", "Black", "White"};
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colors.length;
        System.out.println("colors = " + colors[(int)random] + " random = " + random);

        // To get a random number between 0 and 7, multiply the result of Math.random() by 10.
        random = Math.random() * 7;
        System.out.println("random = " + random);

        // We use Math.floor() to round the number to the nearest integer.
        random = Math.floor(random);
        System.out.println("random = " + random);

        Random randomObj = new Random();

    }
}
