/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication3;

/*
  4. Gestión de Gallinas en Granja Digital
    a.​ Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
      Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
      Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.
*/
public class JavaApplication3 {

    public static void main(String[] args) {
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();

        g1.idGallina = 1;
        g1.edad = 0;
        g1.huevosPuestos = 0;

        g2.idGallina = 2;
        g2.edad = 0;
        g2.huevosPuestos = 0;

        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();

        g1.mostrarEstado();
        g2.mostrarEstado();
    }

    public static class Gallina {
        int idGallina;
        int edad;
        int huevosPuestos;

        public void ponerHuevo() {
            huevosPuestos++;
        }

        public void envejecer() {
            edad++;
        }

        public void mostrarEstado() {
            System.out.println("Gallina " + idGallina +
                               " | Edad: " + edad +
                               " | Huevos puestos: " + huevosPuestos);
        }
    }
}
