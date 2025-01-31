import java.util.Scanner;

public class CircleRadius {
    public static void main(String[] args) {
        System.out.println("Please insert the radius of the circle: ");
        Scanner keyboard = new Scanner(System.in);
        double radius = keyboard.nextDouble();
        double area = Math.round(Math.PI * Math.pow(radius, 2));
        System.out.println("The approximate area of the circle is: " + area);
    }
}