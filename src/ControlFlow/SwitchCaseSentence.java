package ControlFlow;

public class SwitchCaseSentence {
    public static void main(String[] args) {
        int num = 1;
        switch(num){
            case 0:
                System.out.println("The number is zero");
                break;
            case 1:
                System.out.println("The number is one");
                break;
            case 2:
                System.out.println("The number is two");
                break;
            case 3:
                System.out.println("The number is three");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
}