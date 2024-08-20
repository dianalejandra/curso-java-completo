/*
The task consists of creating a class called NameHandlingProgram as follows:

You need to develop a program that receives the names of 3 family members or friends as command line arguments.

For each person’s name, create a new String variable by taking the second character (converted to uppercase) and concatenating it with a period and the last two characters of the name. For example, for “Andres,” it should result in “N.es.”

Finally, print the three new names separated by underscores (as a single variable).
* */
import java.util.Scanner;


public class NameHandlingProgram {
    public static void main(String[] args) {
        Scanner inputName1 = new Scanner(System.in);
        System.out.println("Please give us one name of one of your friends/family members: ");
        String name1 = inputName1.nextLine();

        Scanner inputName2 = new Scanner(System.in);
        System.out.println("Give us another name: ");
        String name2 = inputName2.nextLine();

        Scanner inputName3 = new Scanner(System.in);
        System.out.println("Give us another name: ");
        String name3 = inputName3.nextLine();

        StringBuilder modifiedName1 = new StringBuilder();
        String n1FirstLetter = String.valueOf(name1.toUpperCase().charAt(1));
        modifiedName1.append(n1FirstLetter).append(".").append(name1.substring(name1.length()-2).toLowerCase());

        StringBuilder modifiedName2 = new StringBuilder();
        String n2FirstLetter = String.valueOf(name2.toUpperCase().charAt(1));
        modifiedName2.append(n2FirstLetter).append(".").append(name2.substring(name2.length()-2).toLowerCase());

        StringBuilder modifiedName3 = new StringBuilder();
        String n3FirstLetter = String.valueOf(name3.toUpperCase().charAt(1));
        modifiedName3.append(n3FirstLetter).append(".").append(name3.substring(name3.length()-2).toLowerCase());

        System.out.println(modifiedName1 + "_" + modifiedName2 + "_" + modifiedName3);
    }
}
