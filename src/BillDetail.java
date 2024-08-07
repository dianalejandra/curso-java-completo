import java.util.Scanner;
/**
 * La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
 * **
 * Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
 * Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
 * Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
 * Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.

 * Por ejemplo, el resultado podría ser algo así:
 * La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882
 * **/
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
