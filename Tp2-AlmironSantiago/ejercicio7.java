/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/*
    7.​ Validación de Nota entre 0 y 10 (do-while).
    Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
    usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
    hasta que ingrese un valor válido.
 */

import java.util.Scanner;

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        do {
            System.out.print("Ingrese un número entre o y 10: ");
            num = scan.nextInt();
        } while(validateRange(num));

        System.out.println("Nota guardada correctamente.");
        scan.close();
    }

    public static boolean validateRange(int num) {
        if (num < 0 || num > 10) {
            System.out.println("Nota inválida. Ingrese una nota entre 0 y 10.");
            return true;
        } else {
            return false;
        }
    }
}
