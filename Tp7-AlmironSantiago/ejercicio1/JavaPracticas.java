/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapracticas;
import vehiculos.Vehiculo;
import vehiculos.Auto;
/**
 *
 * @author santiago
 */

public class JavaPracticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo v = new Auto("Fiat", "Polo", 6);
        v.mostrarInfo();
    }
}
