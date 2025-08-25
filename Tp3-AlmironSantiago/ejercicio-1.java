/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/*
    1. Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
    Dentro de esta carpeta encontrará una imagen con la ejecución.
 */

    public class JavaApplication3 {

        public static void main(String[] args) {
            Estudiante estudiante = new  Estudiante();

            estudiante.mostrarInfo();
            estudiante.subirCalificacion(2);
            estudiante.mostrarInfo();
            estudiante.bajarCalificacion(1);
            estudiante.mostrarInfo();
        }

    public static class Estudiante {
        String nombre = "Santiago";
        String apellido = "Almiron";
        String curso = "Programación 2";
        int calificacion = 7;

        public void mostrarInfo() {
            System.out.println(
                "El estudiante " + nombre + " " + apellido +
               " cursa en el curso " + curso +
               " y su nota es " + calificacion
            );
        }

        public void subirCalificacion(int puntos) {
            calificacion += puntos;
        }

        public void bajarCalificacion(int puntos) {
            calificacion -= puntos;
        }
    }
}