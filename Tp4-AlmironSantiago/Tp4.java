/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author santiago
 */
public class Tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciamos empleados usando ambos constructores
        Empleado e1 = new Empleado("Ana Pérez", "Analista");
        Empleado e2 = new Empleado("Luis Gómez", "Desarrollador");
        Empleado e3 = new Empleado(10, "Carla Fernández", "Tester", 1500.0);
        Empleado e4 = new Empleado(11, "Jorge Ramírez", "Líder", 2000.0);

        // Aplicamos métodos actualizarSalario
        e1.actualizarSalario(0.10);    // +10% de aumento
        e2.actualizarSalario(200);     // aumento fijo de 200
        e3.actualizarSalario(0.05);    // +5% de aumento
        e4.actualizarSalario(300);     // aumento fijo de 300

        // Imprimimos información de cada empleado
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());

        // Mostramos total de empleados creados
        System.out.println("Total de empleados creados: " + Empleado.getTotalEmpleados());
    }

}
