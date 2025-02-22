package ControlFlow;

import java.util.Scanner;

public class SwitchNumberOfDays {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert a month number (from 1 to 12): ");
        int month = keyboard.nextInt();
        int days = 0;
        System.out.println("Insert a year to check if it is leap year: ");
        int year = keyboard.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (year % 400 == 0 || ((year % 4 == 0) && !(year % 100 == 0))){
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = 0;
        }
        System.out.println("days = " + days);
    }
}
