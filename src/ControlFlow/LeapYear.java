package ControlFlow;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert a month number (from 1 to 12): ");
        int month = keyboard.nextInt();
        int days = 0;
        System.out.println("Insert a year to check if it is leap year: ");
        int year = keyboard.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            days = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            if (year % 400 == 0 || ((year % 4 == 0) && !(year % 100 == 0))){
                days = 29;
            } else {
                days = 28;
            }
        }
        System.out.println("days = " + days);
    }
}
