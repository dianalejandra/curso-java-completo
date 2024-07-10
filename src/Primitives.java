public class Primitives {
    /* BOOLEANS
     * 1 bit of size. Expresses a true or false value
     * */
    boolean a = true;
    boolean b = true;

    /* CHARS
    * 16 bits of size in memory
    * */
    char aChar = 'a';
    char bChar = 'b';
    char cChar = '\u0021'; // this is how unicode is written

    /* INTEGERS
    * There exists 4 types of integers: byte, short, int and long
    * Differ in positions and can be positive or negative
    * */
    //between -128 to 127
    byte integerByte = 127;

    //between -32768 to 32767
    short integerShort = 32767;

    //between -2147483648 to 2147483647
    int integerInt = 2147483647;

    //between -9223372036854775808 to 9223372036854775807
    long integerLong = 9223372036854775807L;

    /* FLOAT
    * Used to save data of float or double numbers
    * */
    // between -1.4E-45 to 3.4028235E38
    float realFloat = 3.1416f ;

    // between -4.9E-324 to 1.7976931348623157E308
    double realDouble = 4.7029235E3;
}