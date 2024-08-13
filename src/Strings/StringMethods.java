package Strings;

public class StringMethods {
    public static void main(String[] args) {
        /* Most important Methods to Handle Strings*/
        
        String name = "Diana";

        // Returns the length of the sequence of characters represented by this object.
        System.out.println("name.length() = " + name.length());
        
        // Turns string to upper case
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        
        // Turns string to lower case
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        
        // to compare between values
        System.out.println("name.equals(\"Diana\") = " + name.equals("Diana"));
        System.out.println("name.equals(\"diana\") = " + name.equals("diana"));
        System.out.println("name.equalsIgnoreCase(\"diana\") = " + name.equalsIgnoreCase("diana"));
        
        // compares between numeric code of each character in unicode. If it returns 0 then values are equal.
        System.out.println("name.compareTo(\"Diana\") = " + name.compareTo("Diana"));
        System.out.println("name.compareTo(\"Artemis\") = " + name.compareTo("Artemis"));
        
        // converts a String to characters, or obtain a particular character of the String
        System.out.println("name.charAt(0) = " + name.charAt(3));
        System.out.println("name.charAt(name.length()-1) = " + name.charAt(name.length()-1));

        System.out.println("--------------------------");
        // with .substring() we obtain a fragment of string
        name = "Artemis";
        System.out.println("name = " + name);
        System.out.println("name.substring(2) = " + name.substring(2));
        System.out.println("name.substring(1,4) = " + name.substring(1,4));
        System.out.println("name.substring(name.length()-1) = " + name.substring(name.length()-1));
        
    }
}
