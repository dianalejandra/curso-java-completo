package Operators;

import java.util.Scanner;

public class TernaryOperatorsMaxNum {
    public static void main(String[] args) {

        int max = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Insert a number: ");
        int n1 = s.nextInt();

        System.out.println("Insert a second number: ");
        int n2 = s.nextInt();

        System.out.println("Insert a third number: ");
        int n3 = s.nextInt();

        System.out.println("Insert a fourth number: ");
        int n4 = s.nextInt();

        max = (n1 > n2)? n1: n2;
        max = (max > n3)? max : n3;
        max = (max > n4)? max : n4;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        System.out.println("The max number is: " + max);

    }
}
