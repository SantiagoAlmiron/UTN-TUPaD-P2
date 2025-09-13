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
        System.out.println("=== PRUEBA DE RELACIONES CUENTA BANCARIA - CLAVE SEGURIDAD - TITULAR ===");

        // Crear objetos
        Titular titular = new Titular("Roberto Sánchez", "30123456");

        // CuentaBancaria crea la ClaveSeguridad internamente (composición)
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012",
                                                  15000.75,
                                                  "123456",
                                                  "2024-03-15",
                                                  titular);

        System.out.println("1. Objetos creados:");
        System.out.println("   Titular: " + titular);
        System.out.println("   Cuenta Bancaria: " + cuenta);
        System.out.println("   Clave Seguridad: " + cuenta.getClaveSeguridad());

        // Verificar relaciones
        System.out.println("\n2. Verificación de relaciones:");
        System.out.println("   Relación CuentaBancaria → ClaveSeguridad (composición): " +
                          cuenta.getClaveSeguridad().getCodigo());
        System.out.println("   Relación CuentaBancaria → Titular (bidireccional): " +
                          cuenta.getTitular().getNombre());
        System.out.println("   Relación Titular → CuentaBancaria (bidireccional): " +
                          titular.getCuentaBancaria().getCbu());
        System.out.println("   Última modificación de clave: " + cuenta.getClaveSeguridad().getUltimaModificacion());
        System.out.println("   DNI del titular: " + titular.getDni());
        System.out.println("   Saldo de la cuenta: $" + cuenta.getSaldo());
        System.out.println("   CBU: " + cuenta.getCbu());

        System.out.println("\n3. Estado final de los objetos:");
        System.out.println("   Cuenta Bancaria: " + cuenta);
        System.out.println("   Clave Seguridad: " + cuenta.getClaveSeguridad());
        System.out.println("   Titular: " + titular);

        // Demostrar que es composición (ClaveSeguridad no puede existir sin CuentaBancaria)
        System.out.println("\n4. Demostración de composición:");
        System.out.println("   La ClaveSeguridad fue creada dentro de la CuentaBancaria");
        System.out.println("   No existe una referencia externa independiente a la ClaveSeguridad");
        System.out.println("   La ClaveSeguridad no puede existir sin la CuentaBancaria");

        // Demostrar que es asociación bidireccional
        System.out.println("\n5. Demostración de asociación bidireccional:");
        System.out.println("   La CuentaBancaria conoce al Titular y el Titular conoce la CuentaBancaria");
        System.out.println("   Cambios en una dirección se reflejan automáticamente en la otra");

        // Prueba con múltiples instancias
        System.out.println("\n=== SEGUNDA INSTANCIA ===");
        Titular titular2 = new Titular("Laura Martínez", "28987654");
        CuentaBancaria cuenta2 = new CuentaBancaria("9876543210987654321098",
                                                   5000.25,
                                                   "654321",
                                                   "2024-03-16",
                                                   titular2);

        System.out.println("Segunda cuenta: CBU " + cuenta2.getCbu() + " - Saldo: $" + cuenta2.getSaldo());
        System.out.println("Segundo titular: " + titular2.getNombre());
        System.out.println("Segunda clave: " + cuenta2.getClaveSeguridad().getCodigo());

        // Mostrar que se pueden cambiar titulares
        System.out.println("\n=== CAMBIO DE TITULAR ===");
        Titular titular3 = new Titular("Carlos Gómez", "32123456");
        cuenta2.setTitular(titular3);

        System.out.println("Nuevo titular de la segunda cuenta: " + cuenta2.getTitular().getNombre());
        System.out.println("Cuenta asociada al nuevo titular: " + titular3.getCuentaBancaria().getCbu());
    }
}
