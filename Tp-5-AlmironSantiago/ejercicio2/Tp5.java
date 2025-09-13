/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5;

/**
 *
 * @author santiago
 */
import java.util.Date;

public class Tp5 {

    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE RELACIONES CELULAR - BATERÍA - USUARIO ===");

        // Crear objetos
        Bateria bateria = new Bateria("Li-ion XYZ", 4000);
        Usuario usuario = new Usuario("María López", "40123456");
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S23", bateria);

        System.out.println("1. Objetos creados:");
        System.out.println("   Batería: " + bateria);
        System.out.println("   Usuario: " + usuario);
        System.out.println("   Celular: " + celular);

        // Establecer relaciones bidireccionales
        System.out.println("\n2. Estableciendo relaciones bidireccionales:");
        celular.setUsuario(usuario);
        usuario.setCelular(celular);

        // Verificar relaciones
        System.out.println("\n3. Verificación de relaciones:");
        System.out.println("   Relación Celular → Batería: " + celular.getBateria().getModelo());
        System.out.println("   Relación Celular → Usuario: " + celular.getUsuario().getNombre());
        System.out.println("   Relación Usuario → Celular: " + usuario.getCelular().getMarca());

        System.out.println("\n4. Estado final de los objetos:");
        System.out.println("   Celular: " + celular);
        System.out.println("   Usuario: " + usuario);
        System.out.println("   Batería: " + bateria);

        // Prueba con múltiples instancias
        System.out.println("\n=== SEGUNDA INSTANCIA ===");
        Bateria bateria2 = new Bateria("Li-Po ABC", 5000);
        Usuario usuario2 = new Usuario("Carlos Ruiz", "38987654");
        Celular celular2 = new Celular("987654321098765", "iPhone", "15 Pro", bateria2);

        celular2.setUsuario(usuario2);
        usuario2.setCelular(celular2);

        System.out.println("Segundo usuario: " + usuario2.getNombre());
        System.out.println("Segundo celular: " + celular2.getModelo());
        System.out.println("Segunda batería: " + bateria2.getCapacidad() + "mAh");
    }
}
