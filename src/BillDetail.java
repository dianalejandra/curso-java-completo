import java.util.Scanner;
public class BillDetail {
    public static void main(String[] args) {
        Scanner inputNameBill = new Scanner(System.in);
        System.out.println("Please, fill with the name or detail of the bill: ");
        String billName = inputNameBill.nextLine();

        Scanner inputPriceOne = new Scanner(System.in);
        System.out.println("Tell us the first price.");
        double priceOne = inputPriceOne.nextDouble();

        Scanner inputPriceTwo = new Scanner(System.in);
        System.out.println("Tell us the second price:");
        double priceTwo = inputPriceTwo.nextDouble();

        double totalBills = priceOne + priceTwo;
        double percentage = 0.19;
        double taxTotal = totalBills * percentage;
        double totalWithTaxes = totalBills + taxTotal ;

        System.out.println("The invoice " + billName +" has a gross total of " + totalBills + ", with a tax total of " + taxTotal + " and the amount after tax is "  + totalWithTaxes );
    }
}
