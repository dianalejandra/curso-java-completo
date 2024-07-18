import javax.swing.*;

public class NumericSystemsDialog {
    public static void main(String[] args) {
        String strNumber = JOptionPane.showInputDialog(null, "Insert a number");
        int decimalNumber = 0;
        try {
            decimalNumber = Integer.parseInt(strNumber);

        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error: you must enter an integer number");
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
        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}
