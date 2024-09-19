package Operators;

import java.util.Scanner;

public class ArrayLogin {
    public static void main(String[] args) {
        /* An Array allows us to store several data in the same object. Always of the same data type */

        /*
        String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames [0] = "Diana";
        passwords [0] = "123456";

        usernames [1] = "admin";
        passwords [1] = "123456";

        usernames [2] = "bob";
        passwords [2] = "456789";
         */

        // Other way to declare arrays is like this :

        String[] usernames = {"Diana", "admin", "bob"};
        String[] passwords = {"123456", "123456", "456789"};

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please write your username: ");
        String user = keyboard.next();

        System.out.println("Write your password: ");
        String pw = keyboard.next();

        boolean isAuth = false;

        for (int i = 0; i < usernames.length; i++) {
            isAuth = (usernames[i].equals(user) && passwords[i].equals(pw)) ? true: isAuth;
            /*if( (usernames[i].equals(user) &&  passwords[i].equals(pw))  ){
                isAuth = true;
                break;
            }*/
        }

        String message = isAuth ? "Welcome ".concat(user).concat("!") : "User or password are invalid.\nSorry, you require authentication.";
        System.out.println("message = " + message);
        /*if(isAuth){
            System.out.println("Welcome ".concat(user).concat("!"));
        } else {
            System.out.println("User or password are invalid.");
            System.out.println("Sorry, you require authentication.");
        }*/
    }
}
