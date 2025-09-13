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
        System.out.println("=== PRUEBA DE RELACIONES TARJETA - CLIENTE - BANCO ===");

        // Crear objetos
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        Cliente cliente = new Cliente("Roberto Gómez", "35123456");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/25", banco);

        System.out.println("1. Objetos creados:");
        System.out.println("   Banco: " + banco);
        System.out.println("   Cliente: " + cliente);
        System.out.println("   Tarjeta: " + tarjeta);

        // Establecer relaciones bidireccionales
        System.out.println("\n2. Estableciendo relaciones bidireccionales:");
        tarjeta.setCliente(cliente);
        cliente.setTarjeta(tarjeta);

        // Verificar relaciones
        System.out.println("\n3. Verificación de relaciones:");
        System.out.println("   Relación Tarjeta → Cliente: " + tarjeta.getCliente().getNombre());
        System.out.println("   Relación Cliente → Tarjeta: " + cliente.getTarjeta().getNumero());
        System.out.println("   Relación Tarjeta → Banco: " + tarjeta.getBanco().getNombre());
        System.out.println("   CUIT del banco: " + tarjeta.getBanco().getCuit());
        System.out.println("   Fecha vencimiento: " + tarjeta.getFechaVencimiento());

        System.out.println("\n4. Estado final de los objetos:");
        System.out.println("   Tarjeta: " + tarjeta);
        System.out.println("   Cliente: " + cliente);
        System.out.println("   Banco: " + banco);

        // Prueba con múltiples instancias
        System.out.println("\n=== SEGUNDA INSTANCIA ===");
        Banco banco2 = new Banco("Banco Santander", "30-98765432-1");
        Cliente cliente2 = new Cliente("Laura Martínez", "28987654");
        TarjetaDeCredito tarjeta2 = new TarjetaDeCredito("9876-5432-1098-7654", "06/26", banco2);

        tarjeta2.setCliente(cliente2);
        cliente2.setTarjeta(tarjeta2);

        System.out.println("Segundo cliente: " + cliente2.getNombre());
        System.out.println("Segunda tarjeta: " + tarjeta2.getNumero());
        System.out.println("Segundo banco: " + banco2.getNombre());
    }
}
