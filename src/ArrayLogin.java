import java.util.Scanner;

public class ArrayLogin {
    public static void main(String[] args) {

        String username = "Diana";
        String password = "123456";

        String username2 = "admin";
        String password2 = "123456";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please write your username: ");
        String user = keyboard.next();

        System.out.println("Write your password: ");
        String pw = keyboard.next();

        boolean isAuth = false;

        if(
                (username.equals(user) &&  password.equals(pw)) ||
                        (username2.equals(user) && password2.equals(pw)) ){
            isAuth = true;
        } else {
            System.out.println("User or password are invalid.");
        }

        if(isAuth){
            System.out.println("Welcome ".concat(user).concat("!"));
        } else {
            System.out.println("I am sorry, you require authentication.");
        }
    }
}
