/*
Ask for two positive or negative integers via the keyboard and multiply them, but without using the multiplication symbol (*).
You can use a for loop to perform the multiplication and account for unary operations, where minus times minus is positive.*/
import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduce the first integer to multiply: ");
        int a = keyboard.nextInt();

        System.out.println("Introduce the second integer to multiply: ");
        int b = keyboard.nextInt();

        int result = 0;

        // Handling signs
        boolean isNegative = (a < 0 && b > 0) || (a > 0 && b < 0);

        // Making numbers positive for the operation
        a = Math.abs(a);
        b = Math.abs(b);

        // Repetitive sum
        for (int i = 0; i < b; i++) {
            result += a;
        }

        // Apply the negative sign if necessary
        if (isNegative){
            result = -result;
        }

        System.out.println("Result = " + result);
    }
}
