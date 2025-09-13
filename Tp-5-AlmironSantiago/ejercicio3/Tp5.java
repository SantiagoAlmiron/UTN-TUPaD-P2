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
        System.out.println("=== PRUEBA DE RELACIONES LIBRO - AUTOR - EDITORIAL ===");

        // Crear objetos
        Autor autor = new Autor("Gabriel García Márquez", "Colombiano");
        Editorial editorial = new Editorial("Sudamericana", "Av. Corrientes 1234, Buenos Aires");
        Libro libro = new Libro("Cien años de soledad", "978-8437604947", autor, editorial);

        System.out.println("1. Objetos creados:");
        System.out.println("   Autor: " + autor);
        System.out.println("   Editorial: " + editorial);
        System.out.println("   Libro: " + libro);

        // Verificar relaciones
        System.out.println("\n2. Verificación de relaciones:");
        System.out.println("   Relación Libro → Autor: " + libro.getAutor().getNombre());
        System.out.println("   Relación Libro → Editorial: " + libro.getEditorial().getNombre());
        System.out.println("   Nacionalidad del autor: " + libro.getAutor().getNacionalidad());
        System.out.println("   Dirección de la editorial: " + libro.getEditorial().getDireccion());

        System.out.println("\n3. Estado final de los objetos:");
        System.out.println("   Libro: " + libro);
        System.out.println("   Autor: " + autor);
        System.out.println("   Editorial: " + editorial);

        // Prueba con múltiples instancias
        System.out.println("\n=== SEGUNDA INSTANCIA ===");
        Autor autor2 = new Autor("Isabel Allende", "Chilena");
        Editorial editorial2 = new Editorial("Plaza & Janés", "Calle Mayor 67, Madrid");
        Libro libro2 = new Libro("La casa de los espíritus", "978-8401353730", autor2, editorial2);

        System.out.println("Segundo libro: " + libro2.getTitulo());
        System.out.println("Segundo autor: " + libro2.getAutor().getNombre());
        System.out.println("Segunda editorial: " + libro2.getEditorial().getNombre());
    }
}
