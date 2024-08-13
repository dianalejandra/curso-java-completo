package Strings;

public class ValidateStrings {
    public static void main(String[] args) {
        /* It is very important to check if a value or a String is Null, so we can avoid the NullPointerException in runtime. */

        String course = null;
        boolean isNull = course == null;
        System.out.println("isNull = " + isNull);
        //System.out.println(course.toUpperCase()); // --> throws NullPointerException

        /* With an if statement we handle the exception in a way*/
        if (isNull){
            course = " "; //"Java Programming";
        }


        boolean isEmpty = course.length() == 0;
        System.out.println("isEmpty = " + isEmpty);

        boolean isEmptyMethod = course.isEmpty();
        System.out.println("isEmptyMethod = " + isEmptyMethod);

        if(!isEmpty){
            System.out.println(course.toUpperCase());
            System.out.println("Welcome to course" + course);
        }

        /* The method .isBlank() validates if the value has a blank space. This is very useful to complete empty spaces*/

        //System.out.println("Welcome to Java Programming course".concat(course)); // --> also throws NullPointerException

        /* We may want to concatenate this null string we will need to also add a control structure like we did before, or use the concatenation with '+' sign*/
        System.out.println("Welcome to course" + course); // output: Welcome to Java Programming coursenull
    }
}
