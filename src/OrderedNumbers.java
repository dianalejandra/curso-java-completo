import java.util.Scanner;

public class OrderedNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert a number: ");
        int n1 = keyboard.nextInt();

        System.out.println("Insert a second number: ");
        int n2 = keyboard.nextInt();

        if (n1 > n2){
            System.out.println("Numbers from maximum to minimum: " + n1 + ", " + n2);
        } else {
            System.out.println("Numbers from maximum to minimum: " + n2 + ", " + n1);
        }
    }
}
