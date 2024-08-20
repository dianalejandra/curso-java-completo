package Operators;
public class AssignmentOperators {
    public static void main(String[] args) {
        // the '=' sign assigns a value to a variable
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 2; // i = i + 2;
        System.out.println("i = " + i);

        i += 5; // i = i + 5;
        System.out.println("i = " + i);

        j -= 4; // j = j - 4;
        System.out.println("j = " + j);

        /* We can combine every operator with '=' to make a compound operator */
    }
}
