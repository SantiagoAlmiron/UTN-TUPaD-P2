/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapracticas;
import formas.Figura;
import formas.Circulo;
import formas.Rectangulo;

/**
 *
 * @author santiago */

public class JavaPracticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo("Círculo 1", 5);
        figuras[1] = new Rectangulo("Rectángulo 1", 4, 6);
        figuras[2] = new Circulo("Círculo 2", 2.5);

        // Recorremos el array y mostramos el área de cada figura
        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " tiene un área de " + f.calcularArea());
        }
    }
}
