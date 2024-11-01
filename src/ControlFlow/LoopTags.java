package ControlFlow;

public class LoopTags {
    public static void main(String[] args) {
        
        loop:
        for (int i = 1; i <= 7 ; i++) {
            int j = 1;
            while (j <=8){
                if (i == 6 || i == 7){
                    System.out.println("Day " + i + ": weekend rest!" );
                    continue loop;
                }
                System.out.println("Day " + i + ", working at " + j + " hours.");
                j++;
            }
            
        }
        System.out.println("------------------------------------");

        loop1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2){
                    continue loop1;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }
        System.out.println("\n------------------------------------");

        tag:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2){
                    break tag;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }
    }
}
