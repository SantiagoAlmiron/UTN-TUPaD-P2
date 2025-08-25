/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.time.Year;

/*
  3. Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.
    Métodos requeridos: Getters para todos los atributos. Setter con validación
    para añoPublicacion.
    Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con
    uno válido, mostrar la información final.
*/

public class JavaApplication3 {

    public static void main(String[] args) {
        Libro libro = new Libro();
        System.out.println(libro.setAñoPublicacion(2030));
        System.out.println(libro.getAñoPublicacion());
        System.out.println(libro.setAñoPublicacion(2019));
    }

    public static class Libro {
        String titulo = "El señor de los anillos";
        String autor = "J. R. R Tolkien";
        int añoPublicacion = 1954;

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getAñoPublicacion() {
            return añoPublicacion;
        }

        public String setAñoPublicacion(int año) {
            if (año >= Year.now().getValue()) {
                return "Error el año no de publicacion no puese ser en el futuro";
            } else {
                this.añoPublicacion = año;
                return "Año de publicación establecido correctamente: " + año;
            }
        }
    }
}
