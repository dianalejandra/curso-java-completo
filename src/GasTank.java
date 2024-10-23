import java.util.Scanner;

public class GasTank {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert the amount of actual gasoline in your tank (max 70 lt): ");
        double amountOfGasoline = keyboard.nextDouble();

        if(amountOfGasoline >= 0 && amountOfGasoline < 20){
            System.out.println("Insufficient gas in tank");
        } else if(amountOfGasoline >=20 && amountOfGasoline < 35 ){
            System.out.println("Sufficient gasoline");
        } else if(amountOfGasoline >= 35 && amountOfGasoline < 40){
            System.out.println("Half tank full");
        } else if (amountOfGasoline >=40 && amountOfGasoline < 60){
            System.out.println("3/4 of tank full");
        } else if (amountOfGasoline >= 60 && amountOfGasoline < 70){
            System.out.println("Almost full tank");
        } else if (amountOfGasoline == 70){
            System.out.println("Full tank");
        }
    }
}
