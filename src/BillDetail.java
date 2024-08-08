/**
 The task is to create a new class with the main method called InvoiceDetail. You need to develop a program that receives invoice data using the Scanner class as follows:

 Receive the invoice name or description. Use the nextLine() method to obtain the name of the invoice (including spaces).
 Receive 2 product prices of type double. Use the nextDouble() method to obtain prices with decimals (,).
 Calculate the total by summing both prices and adding a 19% tax.
 You are required to display the following information in a single string:

 - Invoice name
 - Gross total (before tax)
 - Tax amount
 - Net total (including tax)

 For example, the result could be something like this:

 “The office supply invoice has a gross total of $134.78, with a tax of $25.6082, resulting in a net amount after tax of $160.3882”.
 * **/
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

        double grossTotal = priceOne + priceTwo;
        double percentage = 0.19;
        double taxTotal = grossTotal * percentage;
        double totalWithTaxes = grossTotal + taxTotal ;

        System.out.println("The invoice " + billName +" has a gross total of " + grossTotal + ", with a tax total of " + taxTotal + " and the amount after tax is "  + totalWithTaxes );
    }
}
