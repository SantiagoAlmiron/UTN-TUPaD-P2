/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/*
    9. Composición de funciones para calcular costo de envío y total de compra.
    Nacional: $5 por kg
    Internacional: $10 por kg
 */

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double productPrice;
        double packageWeight;
        String shippingZone;

        System.out.print("Ingrese el precio del producto: ");
        productPrice = scan.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        packageWeight = scan.nextDouble();

        scan.nextLine();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        shippingZone = scan.nextLine();

        double shippingCost = calculateShippingCost(packageWeight, shippingZone);
        double totalPurchase = calculateTotalPurchase(productPrice, shippingCost);

        System.out.println("El costo de envío es: " + shippingCost);
        System.out.println("El total a pagar es: " + totalPurchase);

        scan.close();
    }

    public static double calculateShippingCost(double weight, String zone) {
        if (zone.equalsIgnoreCase("Nacional")) {
            return weight * 5;
        } else {
            return weight * 10;
        }
    }

    public static double calculateTotalPurchase(double productPrice, double shippingCost) {
        return productPrice + shippingCost;
    }
}
