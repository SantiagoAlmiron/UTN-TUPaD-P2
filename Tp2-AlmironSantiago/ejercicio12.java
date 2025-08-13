/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/*
    12. Modificación de un array de precios y visualización de resultados.
 */

public class JavaApplication3 {

    public static void main(String[] args) {
        double[] prices = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for (double price : prices) {
            System.out.println("Precio: $" + price);
        }

        prices[2] = 129.99;

        System.out.println("Precios modificados:");
        for (double price : prices) {
            System.out.println("Precio: $" + price);
        }
    }
}
