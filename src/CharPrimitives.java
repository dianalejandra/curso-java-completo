public class CharPrimitives {
    public static void main(String[] args) {
        char character = '\u0040';
        char decimal = 64;
        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = character: " + (decimal == character));
    }
}
