package ControlFlow;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 0;
        while (i < 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean test = true;

        System.out.println("--------------------");

        while (test){
            if (i == 7){
                test = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("--------------------");

        test = false;
        do {
            System.out.println("it is executed one time");
        } while (test);

        System.out.println("--------------------");

        test = true;
        i = 0;

        do {
            if (i == 10){
                test = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (test);
    }
}
