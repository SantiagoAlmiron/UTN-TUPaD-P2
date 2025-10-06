/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapracticas;
import java.util.ArrayList;
import empleados.Empleado;
import empleados.EmpleadoPlanta;
import empleados.EmpleadoTemporal;

/**
 *
 * @author santiago */

public class JavaPracticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 50000));
        empleados.add(new EmpleadoTemporal("Luis", 120, 200));
        empleados.add(new EmpleadoPlanta("Marta", 60000));

        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " gana: " + e.calcularSueldo());
            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }
            System.out.println();
        }
    }
}
