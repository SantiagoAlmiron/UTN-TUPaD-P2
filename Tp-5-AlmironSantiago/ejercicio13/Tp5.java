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
        Usuario usuario = new Usuario("Ana García", "ana.garcia@email.com");
        GeneradorQR generador = new GeneradorQR();

        System.out.println("=== DEPENDENCIA DE CREACIÓN - GENERADOR QR ===");
        generador.generar("https://www.ejemplo.com", usuario); // Dependencia de creación
    }
}
