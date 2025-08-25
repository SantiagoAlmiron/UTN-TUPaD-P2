/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/*
    2.Crear una clase Mascota con los atributos: nombre, especie, edad.
      Métodos requeridos: mostrarInfo(), cumplirAnios().
        Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y
        verificar los cambios.

    Dentro de esta carpeta encontrará una imagen con la ejecución.
 */

public class JavaApplication3 {

    public static void main(String[] args) {
        Mascota mascota = new Mascota();  // Creamos una mascota

        mascota.mostrarInfo();     // Mostramos info inicial
        mascota.cumplirAnios();    // Simulamos que cumple años
        mascota.mostrarInfo();     // Mostramos info después
        mascota.cumplirAnios();    // Cumple otro año
        mascota.mostrarInfo();     // Mostramos otra vez
    }

    public static class Mascota {
        String nombre = "Firulais";
        String especie = "Perro";
        int edad = 3;

        public void mostrarInfo() {
            System.out.println(
                "La mascota " + nombre +
                " es un " + especie +
                " y tiene " + edad + " años."
            );
        }

        public void cumplirAnios() {
            edad++;
        }
    }
}
