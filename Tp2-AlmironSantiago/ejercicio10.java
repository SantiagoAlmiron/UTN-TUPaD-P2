/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/*
    10. Actualización de stock a partir de venta y recepción de productos.
 */

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int currentStock;
        int soldQuantity;
        int receivedQuantity;

        System.out.print("Ingrese el stock actual del producto: ");
        currentStock = scan.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        soldQuantity = scan.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        receivedQuantity = scan.nextInt();

        int newStock = updateStock(currentStock, soldQuantity, receivedQuantity);

        System.out.println("El nuevo stock del producto es: " + newStock);

        scan.close();
    }

    public static int updateStock(int currentStock, int soldQuantity, int receivedQuantity) {
        return currentStock - soldQuantity + receivedQuantity;
    }
}
