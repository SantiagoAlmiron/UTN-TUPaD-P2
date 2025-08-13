/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/*
    11. Cálculo de descuento especial usando variable global.
 */

public class JavaApplication3 {

    public static double SPECIAL_DISCOUNT = 0.10;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double productPrice;

        System.out.print("Ingrese el precio del producto: ");
        productPrice = scan.nextDouble();

        calculateSpecialDiscount(productPrice);

        scan.close();
    }

    public static void calculateSpecialDiscount(double price) {
        double discountApplied = price * SPECIAL_DISCOUNT;
        double finalPrice = price - discountApplied;

        System.out.println("El descuento especial aplicado es: " + discountApplied);
        System.out.println("El precio final con descuento es: " + finalPrice);
    }
}
