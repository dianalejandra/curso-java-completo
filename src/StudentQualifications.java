import java.util.Scanner;

public class StudentQualifications {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double [] qualifications = new double[20];

        for (int i = 0; i < qualifications.length; i++) {
            System.out.println("Please enter a qualification: ");
            qualifications[i] = keyboard.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < qualifications.length ; i++) {
            sum += qualifications[i];
        }

        double average = sum / qualifications.length;
        System.out.println("The average qualification is: " + average);
    }
}
