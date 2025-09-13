/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5;

/**
 *
 * @author santiago
 */
public class Tp5 {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Juan Pérez", "20-12345678-9");
        Impuesto impuesto = new Impuesto(10000.0, contribuyente);
        Calculadora calculadora = new Calculadora();

        System.out.println("=== DEPENDENCIA DE USO - CALCULADORA ===");
        calculadora.calcular(impuesto); // Dependencia de uso
    }
}