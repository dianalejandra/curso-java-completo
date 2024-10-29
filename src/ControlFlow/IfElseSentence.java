package ControlFlow;

public class IfElseSentence {
    public static void main(String[] args) {
        float score = 5.5F;
        System.out.println("Your score is: " + score);

        if (score >= 6.5) {
            System.out.println("Congratulations! You got a high score");
        } else if (score >= 6.0){
            System.out.println("Good job! Your notes are good.");
        } else if (score >= 5.5) {
            System.out.println("Your score is OK");
        } else if (score >= 5.0) {
            System.out.println("You have a regular score. You need to put a little more effort.");
        } else if (score >= 4.0) {
            System.out.println("Your score is pretty bad. Please study more.");
        } else {
            System.out.println("You didn't pass the exam :(");
        }
    }
}
