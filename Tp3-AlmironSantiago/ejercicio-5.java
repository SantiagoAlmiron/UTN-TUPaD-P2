/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication3;

/*
  5.​ Simulación de Nave Espacial
    Crear una clase NaveEspacial con los atributos: nombre, combustible.
    Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
    Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
    Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin
    recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.
*/
public class JavaApplication3 {

    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        nave.nombre = "Space X";
        nave.combustible = 50;

        nave.avanzar(60);

        nave.recargarCombustible(30);

        nave.avanzar(60);

        nave.despegar();
        nave.mostrarEstado();
    }

    public static class NaveEspacial {
        String nombre;
        int combustible;
        final int MAX_COMBUSTIBLE = 100;

        public void despegar() {
            System.out.println("La nave " + nombre + " está despegando");
        }

        public void avanzar(int distancia) {
            if (combustible >= distancia) {
                combustible -= distancia;
                System.out.println("La nave avanzó " + distancia + " unidades.");
            } else {
                System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades.");
            }
        }

        public void recargarCombustible(int cantidad) {
            if (combustible + cantidad > MAX_COMBUSTIBLE) {
                combustible = MAX_COMBUSTIBLE;
                System.out.println("Combustible recargado al máximo: " + MAX_COMBUSTIBLE);
            } else {
                combustible += cantidad;
                System.out.println("Combustible recargado: " + cantidad + " unidades.");
            }
        }

        public void mostrarEstado() {
            System.out.println("Estado de la nave " + nombre + " | Combustible: " + combustible);
        }
    }
}
