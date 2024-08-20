package Operators;
import javax.swing.*;
public class ArithmeticOperators {
    public static void main(String[] args) {
        int i = 5, j = 4, addition = i + j;

        System.out.println("addition = " + addition);
        // we get different results according precedence of values
        System.out.println("i + j = " + i + j);
        System.out.println( i + j + " i + j = ");
        // we give priority to operations within parentheses
        System.out.println("i + j = " + (i + j));

        int subtraction = i - j;
        System.out.println("subtraction = " + subtraction);
        System.out.println("i - j = " + (i - j));

        int multiplication = i * j;
        System.out.println("multiplication = " + multiplication);

        int division = i / j; // this should show 1.25, but it's declared as an int not as a float value
        System.out.println("division = " + division);
        float div2 = (float)i / j; // we cast a float between parentheses for variable 'i'
        System.out.println("div2 = " + div2);

        int remainder = i % j;
        System.out.println("remainder = " + remainder);
        remainder = 8 % 5;
        System.out.println("remainder = " + remainder);

        int num = Integer.parseInt(JOptionPane.showInputDialog("Insert a number: "));
        if(num % 2 == 0){
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
}
