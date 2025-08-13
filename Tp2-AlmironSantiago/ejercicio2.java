/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 * Escribe un programa en Java que pida al usuario tres números enteros y
 * determine cuál es el mayor.
 */

import java.util.Scanner;
import java.util.Arrays;

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[3];
        for(int i = 0; i<3; ++i) {
            System.out.print("Ingrese el número " + (i + 1)  + ": ");
            numbers[i] = scan.nextInt();
        }

        System.out.println("La suma de los tres números es: " + sumNumbers(numbers));
        scan.close();
    }

    public static int sumNumbers (int[] years) {
        int total = 0;
        for(int i = 0; i < years.length; ++i) {
            total = total + years[i];
        }
        return total;
    }
}
