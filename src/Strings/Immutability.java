package Strings;

public class Immutability {
    public static void main(String[] args) {
        String course = "Java Development";
        String teacher = "Andrés Guzmán";

        String result = course.concat(teacher);
        System.out.println("course = " + course);
        System.out.println("result = " + result);
        System.out.println(course == result);

        // receives a function and returns the string modified (Lambda expressions)
        String result2 = course.transform(c -> { //c is the representation of the value 'course'
            return c + " with " + teacher;
        });
        System.out.println("course = " + course);
        System.out.println("result2 = " + result2);

        // with the method .replace() we replace a character of the string
        String result3 = result.replace("a","A");
        System.out.println("result with replace = " + result3);
    }
}
