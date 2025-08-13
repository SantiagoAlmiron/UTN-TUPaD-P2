/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/*
  5.​ Suma de Números Pares (while).
  Escribe un programa que solicite números al usuario y sume solo los
  números pares. El ciclo debe continuar hasta que el usuario ingrese el número
  0, momento en el que se debe mostrar la suma total de los pares ingresados.
 */

import java.util.Scanner;

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;
        int num;
        int sum = 0;
        while (isRunning) {
            System.out.print("Por favor ingrese un número: ");
            num = scan.nextInt();
            if (num == 0) {
                isRunning = false;
            } else if (isEven(num)) {
                sum = sum + num;
            }
        }

        System.out.println("Los números suman: " + sum);
        scan.close();
    }

    public static boolean isEven (int num) {
        if (num%2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
