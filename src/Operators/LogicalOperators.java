package Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        /* With '&&' we add conditions it is like saying 'and' */
        boolean b1 = i == j && k < l && m == false;
        System.out.println("b1 = " + b1);

        /* With pipe symbol '|' we can evaluate several values. It is like putting an 'or'*/

        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && (k < l || m == false);
        System.out.println("b3 = " + b3);

        /* The precedence in operators is from left to right. But with '&&' and '||' operators there is an exception
        *  the '&&' is compared first, and then it compares the '||' expression */

        boolean b4 = (i == j || k < l) && m == true;
        System.out.println("b4 = " + b4);

        boolean b5 = (true || true) && false;
        System.out.println("b5 = " + b5);

        boolean b6 = true || false && false || false;
        System.out.println("b6 = " + b6); // true

        boolean b7 = (true || false) && (false || false);
        System.out.println("b6 = " + b7); // false

    }
}
