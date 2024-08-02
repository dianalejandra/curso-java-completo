import java.util.Scanner;

public class BillDetail {
    public static void main(String[] args) {
        Scanner inputNameBill = new Scanner(System.in);
        System.out.println("Please, fill with the name or detail of the bill: ");
        String billName = inputNameBill.nextLine();
        System.out.println("billName = " + billName);

        Scanner inputPriceOne = new Scanner(System.in);
        System.out.println("Tell us the first price.");
        System.out.println("Put it complete with period (Example: 13.60): ");
        double priceOne = inputPriceOne.nextDouble();


        Scanner inputPriceTwo = new Scanner(System.in);
        System.out.println("Tell us the second price.");
        System.out.println("Put it complete with period (Example: 31.06): ");
        double priceTwo = inputPriceTwo.nextDouble();

        double totalTaxFree = priceOne + priceTwo;


        System.out.println("priceOne = " + priceOne);
        System.out.println("priceTwo = " + priceTwo);
        System.out.println("total = " + totalTaxFree);
        
    }
}
