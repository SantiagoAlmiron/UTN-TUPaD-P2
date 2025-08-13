/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/*  Calculadora de Descuento según categoría.
    Escribe un programa que solicite al usuario el precio de un producto y
    su categoría (A, B o C).
    Luego, aplique los siguientes descuentos:
    Categoría A: 10% de descuento
    Categoría B: 15% de descuento
    Categoría C: 20% de descuento
    El programa debe mostrar el precio original, el descuento aplicado y el
    precio final
*/

import java.util.Scanner;

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el precio de un producto: ");
        double price = scan.nextDouble();
        char category;
        do {
            System.out.print("Ingrese la caregoría de ese producto A, B o C: ");
            category = scan.next().charAt(0);
        } while (category != 'A' && category != 'B' && category != 'C');

        System.out.println("Precio original: " + price);
        double discount = calculateDiscount(price, category);
        System.out.println("Descuento: $" + discount);
        System.out.println("El precio final es: $" + (price - discount));

        scan.close();
    }

    public static double calculateDiscount (double price, char category) {
        switch(category) {
            case 'A':
                return price * 0.9;
            case 'B':
                return price * 0.85;
            case 'C':
                return price * 0.8;
            default:
                return price;
        }
    }
}
