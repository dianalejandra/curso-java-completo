package NumericSystems;

import java.util.Scanner;

public class NumericSystemsConsole {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert a number: ");
        //String strNumber = keyboard.nextLine();

        int decimalNumber = 0;
        try {
            decimalNumber = keyboard.nextInt(); //Integer.parseInt(strNumber);

        } catch (NumberFormatException e){
            System.out.println("Error: you must enter an integer number");
            main(args);
            System.exit(0);
        }

        System.out.println("decimalNumber = " + decimalNumber);

        String binaryResult = "binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
        System.out.println(binaryResult);

        String octalResult = "octal number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);
        System.out.println(octalResult);

        String hexResult = "hexadecimal number of " + decimalNumber + " = " + Integer.toHexString(decimalNumber);
        System.out.println(hexResult);

        String message = binaryResult + '\n' + octalResult + '\n' + hexResult ;
        System.out.println(message);
        System.exit(0);
    }
}
