/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/*
    13. Impresión recursiva de arrays antes y después de modificar un elemento.
 */

public class JavaApplication3 {

    public static void main(String[] args) {
        double[] prices = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        printRecursive(prices, 0);

        prices[2] = 129.99; // modificar precio

        System.out.println("Precios modificados:");
        printRecursive(prices, 0);
    }

    public static void printRecursive(double[] array, int index) {
        if (index < array.length) {
            System.out.println("Precio: $" + array[index]);
            printRecursive(array, index + 1);
        }
    }
}
