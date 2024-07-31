package NumericSystems;

public class Numeric {
    public static void main(String[] args) {
        int decimalNumber = 500;
        System.out.println("decimalNumber = " + decimalNumber + "\n");

        System.out.println("binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber));
        int binaryNumber = 0b111110100;
        System.out.println("binaryNumber = " + binaryNumber + "\n");

        System.out.println("octal number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber));
        int octalNumber = 0764;
        System.out.println("octalNumber = " + octalNumber + "\n");

        System.out.println("hexadecimal number of " + decimalNumber+ " = " + Integer.toHexString(decimalNumber));
        int hexNumber = 0x1f4;
        System.out.println("hexNumber = " + hexNumber + "\n");



    }
}
