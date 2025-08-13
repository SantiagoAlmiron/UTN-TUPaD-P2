/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 * Escribe un programa en Java que solicite al usuario un año y determine si es
 * bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
 * divisible por 400.
 */

import java.util.Scanner;

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un año para saber si es bisiesto: ");
        int year = scan.nextInt();

        if (isLeapYear(year)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No bisiesto");
        }

        scan.close();
    }

    public static boolean isLeapYear(int year) {
        return year%400 == 0 || (year%4 == 0 && year%100 != 0);
    }
}
