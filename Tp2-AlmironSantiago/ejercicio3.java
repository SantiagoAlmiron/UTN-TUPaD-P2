/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

// Escribe un programa en Java que solicite al usuario su edad y clasifique su
// etapa de vida según la siguiente tabla:
// Menor de 12 años: "Niño"
// Entre 12 y 17 años: "Adolescente"
// Entre 18 y 59 años: "Adulto"
// 60 años o más: "Adulto mayor"

import java.util.Scanner;

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Por favor ingrese su edad: ");
        int age = scan.nextInt();
        System.out.println("Usted es un " + clasify(age));
        scan.close();
    }

    public static String clasify (int age) {
        if (age < 12) {
            return "niño";
        } else if (age <= 17) {
            return "adolescente";
        } else if (age <= 59) {
            return "adulto";
        } else {
            return "adulto mayor";
        }
    }
}
