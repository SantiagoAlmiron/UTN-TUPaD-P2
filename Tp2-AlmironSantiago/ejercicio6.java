/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/*
    6.​ Contador de Positivos, Negativos y Ceros (for).
    Escribe un programa que pida al usuario ingresar 10 números enteros y
    cuente cuántos son positivos, negativos y cuántos son ceros.
 */

import java.util.Scanner;

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.println("Ingrese 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i+1) + ": ");
            int num = scan.nextInt();

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        scan.close();

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}
