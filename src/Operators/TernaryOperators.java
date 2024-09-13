package Operators;

import java.util.Scanner;

public class TernaryOperators {
    public static void main(String[] args) {
        /* Formed by three parts
        * variable = condition ? if it is true returns value : if it is false "else"
        * */

        String variable = 7 == 3 ? "yes, is true" : "no, it is false";
        System.out.println("variable = " + variable);

        String state = "";
        double average = 0.0;
        double maths = 0.0;
        double science = 0.0;
        double history = 0.0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input your maths score between 2.0 and 7.0: ");
        maths = keyboard.nextDouble();

        System.out.println("Input your science score between 2.0 and 7.0: ");
        science = keyboard.nextDouble();

        System.out.println("Input your history score between 2.0 and 7.0: ");
        history = keyboard.nextDouble();

        average = (maths + science + history) / 3;

        state = average >= 5.49 ? "Pass" : "Denied";
        System.out.println("state = " + state);
        System.out.println("average = " + average);

        /*
        if (average >= 5.49){
            state = "Pass";
        } else {
            state = "Denied";
        }
        */



    }
}
