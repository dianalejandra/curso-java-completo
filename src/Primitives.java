public class Primitives {
    public static void main(String[] args) {
        /* NUMERIC PRIMITIVES PRACTICE*/
        byte numberByte = 6;
        System.out.println("numberByte = " + numberByte);
        System.out.println("byte type corresponds to " + Byte.BYTES + " in bytes");
        System.out.println("byte type corresponds to " + Byte.SIZE + " in bits");
        System.out.println("max value of a byte: " + Byte.MAX_VALUE);
        System.out.println("min value of a byte: " + Byte.MIN_VALUE);
        System.out.println(" ");

        short numberShort = 32767;
        System.out.println("numberShort = " + numberShort);
        System.out.println("short type corresponds to " + Short.BYTES + " in bytes");
        System.out.println("short type corresponds to " + Short.SIZE + " in bits");
        System.out.println("max value of a short: " + Short.MAX_VALUE);
        System.out.println("min value of a short: " + Short.MIN_VALUE);
        System.out.println(" ");

        int numberInt = 2147483647;
        System.out.println("numberInt = " + numberInt);
        System.out.println("integer type corresponds to " + Integer.BYTES + " in bytes");
        System.out.println("integer type corresponds to " + Integer.SIZE + " in bits");
        System.out.println("max value of a integer: " + Integer.MAX_VALUE);
        System.out.println("min value of a integer: " + Integer.MIN_VALUE);
        System.out.println(" ");

        long numberLong = 9223372036854775807L;
        System.out.println("numberLong = " + numberLong);
        System.out.println("long type corresponds to " + Long.BYTES + " in bytes");
        System.out.println("long type corresponds to " + Long.SIZE + " in bits");
        System.out.println("max value of a long: " + Long.MAX_VALUE);
        System.out.println("min value of a long: " + Long.MIN_VALUE);
        System.out.println(" ");

        // with 'var' the value of that variable is adaptable
        var numberVar = 128;
        System.out.println("numberVar = " + numberVar);
    }
}