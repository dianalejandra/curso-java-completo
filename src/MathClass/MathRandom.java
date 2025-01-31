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
        int randomInt = randomObj.nextInt(7);
        System.out.println("randomInt = " + randomInt);

        // To generate random numbers within a range, for example between 15 and 25, we use the following formula:
        int rangedInt = 15 + randomObj.nextInt(25-15+1);
        System.out.println("rangedInt = " + rangedInt);

        randomInt = randomObj.nextInt(colors.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colors = " + colors[randomInt]);
    }
}
