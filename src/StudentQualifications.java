/*
Request 20 final grades from students on a scale of 1 to 7, handling decimals in the grades (double). Show the average of grades greater than 5, average of grades below 4, and the number of grades that are 1, as well as the total average.

Help: use a for loop that iterates up to 20 (grades) and within the loop ask for the grades one by one to perform calculations (counters, sums).

Optional: if one of the entered grades is 0, the for loop should exit, and display an error message ending the program.*/
import java.util.Scanner;

public class StudentQualifications {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double grade;
        int gradeCounter1 = 0;
        int gradeCounterGreaterThan5 = 0; // the counter for scores greater than 5
        int gradeCounterLessThan4 = 0; // the counter for scores less than 4
        double sumGradesGreaterThan5 = 0; // sum of grades that are grater than 5
        double sumGradesLessThan4 = 0; // sum of grades that are less than 4
        double totalSum = 0; // total sum of all grades

        double averageSumGreaterThan5Grades, averageSumLessThan4Grades; // the averages of grades more than 5 and less than 4

        boolean error = false;

        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce a grade (between 1 and 7) Grade N" + (i +1) + ": ");
            grade = keyboard.nextDouble();

            if (grade == 0){
                error = true;
                break;
            }

            if (grade == 1){
                gradeCounter1++;
            } else {
                if (grade > 5) {
                    gradeCounterGreaterThan5++;
                    sumGradesGreaterThan5 += grade;
                } else if (grade < 4){
                    gradeCounterLessThan4++;
                    sumGradesLessThan4 += grade;
                }
            }
            totalSum += grade;
        }
        if (error) {
            System.err.println("Error: you can't have grades with score 0. Program execution finalized.");
            System.exit(1);
        }
        // we show the quantity on grades with score of 1
        System.out.println("gradeCounter1 = " + gradeCounter1);




    }
}
