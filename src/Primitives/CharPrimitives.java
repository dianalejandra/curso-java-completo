package Primitives;

public class CharPrimitives {
    public static void main(String[] args) {
        var character = '\u0040';
        var decimal = 64;
        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = character: " + (decimal == character));
        System.out.println();

        char symbol = '@';
        System.out.println("symbol = " + symbol);
        System.out.println("symbol = character: " + (symbol == character));
        System.out.println();

        /*SPECIAL CHARACTERS*/

        char space = '\u0020';
        char backspace = '\b'; // the "erase" key in the keyboard
        char tab = '\t'; // tab key
        char newLine = '\n'; // puts a line jump, like enter
        char returnEnter = '\r';

        System.out.println("char type corresponds to:" + newLine + Character.BYTES + " in bytes");
        System.out.println("char type corresponds to " + returnEnter + Character.SIZE + " in bits");
        System.out.println("max value of a char: " + Character.MAX_VALUE);
        System.out.println("min value of a char: " + Character.MIN_VALUE);
        System.out.println();
    }
}

