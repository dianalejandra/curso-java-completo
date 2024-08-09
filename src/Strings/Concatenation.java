package Strings;

public class Concatenation {
    public static void main(String[] args) {
        String course = "Java Development";
        String teacher = "Andrés Guzmán";

        String detail = course + " given by instructor " + teacher;
        System.out.println(detail);

        //we will print the number characters concatenated with strings
        int numberA = 10;
        int numberB = 5;

        System.out.println( detail + numberA + numberB);
            // output: Java Development given by instructor Andrés Guzmán105
            // this is added like this because of precedence
            // we can put parentheses so numbers are evaluated separately, and then concatenate with the string
        System.out.println( detail + (numberA + numberB));
            // output: Java Development given by instructor Andrés Guzmán15

        // because of precedence, then this should return the two numbers added at the beginning and then the concatenated string
        System.out.println(numberA + numberB + detail);
            // output: 15Java Development given by instructor Andrés Guzmán

        // with the method 'concat()' we can concatenate. It returns another instance of the string
        // this is more efficient than concatenate with '+'
        String detail2 = course.concat(" with ").concat(teacher);
        System.out.println(detail2);


    }
}
