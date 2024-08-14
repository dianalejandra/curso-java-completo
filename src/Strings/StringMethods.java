package Strings;

public class StringMethods {
    public static void main(String[] args) {
        /* Most important Methods to Handle Strings*/
        
        String name = "Artemis";

        // Returns the length of the sequence of characters represented by this object.
        System.out.println("name.length() = " + name.length());
        
        // Turns string to upper case
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        
        // Turns string to lower case
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        
        // to compare between values
        System.out.println("name.equals(\"Artemis\") = " + name.equals("Artemis"));
        System.out.println("name.equals(\"artemis\") = " + name.equals("artemis"));
        System.out.println("name.equalsIgnoreCase(\"artemis\") = " + name.equalsIgnoreCase("artemis"));
        
        // compares between numeric code of each character in unicode. If it returns 0 then values are equal.
        System.out.println("name.compareTo(\"Artemis\") = " + name.compareTo("Artemis"));
        System.out.println("name.compareTo(\"Diana\") = " + name.compareTo("Diana"));
        
        // converts a String to characters, or obtain a particular character of the String
        System.out.println("name.charAt(0) = " + name.charAt(3));
        System.out.println("name.charAt(name.length()-1) = " + name.charAt(name.length()-1));

        // with .substring() we obtain a fragment of string
        System.out.println("name = " + name);
        System.out.println("name.substring(2) = " + name.substring(2));
        System.out.println("name.substring(1,4) = " + name.substring(1,4));
        System.out.println("name.substring(name.length()-1) = " + name.substring(name.length()-1));


        System.out.println("--------------------------");
        String tongueTwisters = "tongueTwisters";
        // to replace one character to other character
        System.out.println("tongueTwisters replace = " + tongueTwisters.replace("t", "."));
        // indexOf allows to know the first occurrence of the character searched
        System.out.println("tongueTwisters.indexOf('w') = " + tongueTwisters.indexOf('w'));
        // lastIndexOf allows to know the last occurrence of the character searched
        System.out.println("tongueTwisters.lastIndexOf('e') = " + tongueTwisters.lastIndexOf('e'));
        System.out.println("tongueTwisters.indexOf('y') = " + tongueTwisters.indexOf('y')); // if character is not found it will return -1
        // returns true or false only if this string contains the specified sequence of char values.
        System.out.println("tongueTwisters.indexOf(\"Twist\") = " + tongueTwisters.indexOf("Twist"));
        System.out.println("tongueTwisters.contains(\"ter\") = " + tongueTwisters.contains("ter"));
        // method .startWith is used if it starts with the specified prefix
        System.out.println("tongueTwisters.startsWith = " + tongueTwisters.startsWith("to"));
        // Tests if this string ends with the specified suffix.
        System.out.println("tongueTwisters.endsWith(\"s\") = " + tongueTwisters.endsWith("s"));

        // with .trim we remove white spaces
        System.out.println("   tongue Twisters   ");
        System.out.println("   tongue Twisters   ".trim());


    }
}
