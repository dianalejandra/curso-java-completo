/* The task consists of creating a class called NameHandlingProgram as follows:
- You need to develop a program that receives the names of 3 family members or friends as command line arguments.
- For each person’s name, create a new String variable by taking the second character (converted to uppercase) and concatenating it with a period and the last two characters of the name. For example, for “Andres,” it should result in “N.es.”
- Finally, print the three new names separated by underscores (as a single variable). * */

import java.util.Scanner;
public class NameHandlingProgram {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please give us one name of one of your friends/family members: ");
        String name1 = keyboard.nextLine();
        String modifiedName1 = name1.toUpperCase().charAt(1) + "." + name1.substring(name1.length() - 2);

        System.out.println("Give us another name: ");
        String name2 = keyboard.nextLine();
        String modifiedName2 = name2.toUpperCase().charAt(1) + "." + name2.substring(name2.length() - 2);

        System.out.println("Give us another name: ");
        String name3 = keyboard.nextLine();
        String modifiedName3 = name3.toUpperCase().charAt(1) + "." + name3.substring(name3.length() - 2);

        System.out.println(modifiedName1 + "_" + modifiedName2 + "_" + modifiedName3);
    }
}
