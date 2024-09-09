package Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int i= 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        /* With '&&' we add conditions it is like saying 'and' */
        boolean b1 = i == j && k < l && m == false;
        System.out.println("b1 = " + b1);

        /* With pipe symbol '|' we can evaluate several values. It is like putting an 'or'*/

        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && (k > l || m == false);
        System.out.println("b3 = " + b3);

    }
}
