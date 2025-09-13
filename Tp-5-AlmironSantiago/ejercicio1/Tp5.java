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
        System.out.println("=== PRUEBA DE RELACIONES ENTRE CLASES ===");

        // Crear objetos
        Foto foto = new Foto(1001, "JPEG");
        Titular titular = new Titular("Ana García", 30123456);
        Pasaporte pasaporte = new Pasaporte(987654321, new Date(), foto, titular);

        // Establecer relación bidireccional
        titular.setPasaporte(pasaporte);

        // Verificar relaciones
        System.out.println("1. Relación Pasaporte -> Titular:");
        System.out.println("   Titular del pasaporte: " + pasaporte.getTitular().getNombre());

        System.out.println("\n2. Relación Titular -> Pasaporte:");
        System.out.println("   Pasaporte del titular: " + titular.getPasaporte().getNumero());

        System.out.println("\n3. Relación Pasaporte -> Foto:");
        System.out.println("   Formato de la foto: " + pasaporte.getFoto().getFormato());

        System.out.println("\n4. Verificación completa:");
        System.out.println("   Pasaporte: " + pasaporte);
        System.out.println("   Titular: " + titular);
        System.out.println("   Foto: " + foto);

        // Crear segunda instancia para demostrar funcionamiento múltiple
        System.out.println("\n=== SEGUNDA INSTANCIA ===");
        Foto foto2 = new Foto(1002, "PNG");
        Titular titular2 = new Titular("Luis Martínez", 28987654);
        Pasaporte pasaporte2 = new Pasaporte(123456789, new Date(), foto2, titular2);
        titular2.setPasaporte(pasaporte2);

        System.out.println("Segundo titular: " + titular2.getNombre());
        System.out.println("Segundo pasaporte: " + pasaporte2.getNumero());
    }
}
