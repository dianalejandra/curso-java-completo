package Strings;

public class LiteralVsOperatorNew {
    public static void main(String[] args) {
        //both are objects, each with its identifier
        String course = "Java Development";
        String course2 = new String("Java Dev");

        boolean isEqual = course == course2;
        System.out.println("course == course2: " + isEqual); // this returns false. Although both have the same text, each one is a different object

        // with .equals() you compare the value inside the object
        isEqual = course.equals(course2);
        System.out.println("course.equals(course2): " + isEqual);

        String course3 = "Java Development";
        isEqual = course == course3;
        System.out.println("course == course3: " + isEqual);


    }
}
