package Primitives;

public class PrimitivesToPrimitives {
    public static void main(String[] args) {
        /* Practice of conversion from primitives to primitives
        *  We "cast" and force the data type change
        * */
        int i = 42767;
        short s = (short)i; // we cast the type between parentheses and force the change of value
                            // we may suffer the lost of data because of memory issues
                            // output: s = -22769
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println("Short Max Value: "+ Short.MAX_VALUE);

        char b = (char) i;
        System.out.println("b = " + b);

        float f = (float) i;
        System.out.println("f = " + f);


        /* Some types are not possible to cast. For example: an int to a boolean*/



    }
}
