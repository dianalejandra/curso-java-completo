package Operators;

public class IncrementalOperators {
    public static void main(String[] args) {
        /* Pre-increment */
        int i = 1;
        int j= ++i; // i = i + 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        /* Post-increment */
        i = 2;
        System.out.println("initial of i = " + i);
        j= i++; // i = i + 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        /* Pre-decrement */
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        /* Post-decrement */
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("++j = " + (++j));
        System.out.println("j++ = " + (j++)); // it is actually 6, it has a post-increment



    }
}
