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
        System.out.println("=== PRUEBA DE RELACIONES VEHÍCULO - MOTOR - CONDUCTOR ===");

        // Crear objetos
        Motor motor = new Motor("V8", "M123456789");
        Conductor conductor = new Conductor("Roberto Sánchez", "B12345678");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Ford Mustang", motor);

        System.out.println("1. Objetos creados:");
        System.out.println("   Motor: " + motor);
        System.out.println("   Conductor: " + conductor);
        System.out.println("   Vehículo: " + vehiculo);

        // Establecer relaciones bidireccionales
        System.out.println("\n2. Estableciendo relaciones bidireccionales:");
        vehiculo.setConductor(conductor);
        // conductor.setVehiculo(vehiculo); // Se establece automáticamente en setConductor

        // Verificar relaciones
        System.out.println("\n3. Verificación de relaciones:");
        System.out.println("   Relación Vehículo → Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("   Relación Conductor → Vehículo: " + conductor.getVehiculo().getModelo());
        System.out.println("   Relación Vehículo → Motor (agregación): " + vehiculo.getMotor().getTipo());
        System.out.println("   Número de serie del motor: " + vehiculo.getMotor().getNumeroSerie());
        System.out.println("   Licencia del conductor: " + conductor.getLicencia());
        System.out.println("   Patente del vehículo: " + vehiculo.getPatente());

        System.out.println("\n4. Estado final de los objetos:");
        System.out.println("   Vehículo: " + vehiculo);
        System.out.println("   Conductor: " + conductor);
        System.out.println("   Motor: " + motor);

        // Demostrar que es agregación (Motor puede existir sin Vehículo)
        System.out.println("\n5. Demostración de agregación:");
        System.out.println("   El Motor existe independientemente del Vehículo");
        System.out.println("   Puede haber motores sin vehículos (agregación)");

        // Demostrar que es asociación bidireccional
        System.out.println("\n6. Demostración de asociación bidireccional:");
        System.out.println("   El Vehículo conoce al Conductor y el Conductor conoce el Vehículo");
        System.out.println("   Cambios en una dirección se reflejan en la otra");

        // Prueba con múltiples instancias
        System.out.println("\n=== SEGUNDA INSTANCIA ===");
        Motor motor2 = new Motor("Eléctrico", "E987654321");
        Conductor conductor2 = new Conductor("Laura Martínez", "C87654321");
        Vehiculo vehiculo2 = new Vehiculo("XYZ789", "Tesla Model S", motor2);

        vehiculo2.setConductor(conductor2);

        System.out.println("Segundo vehículo: " + vehiculo2.getModelo() + " (" + vehiculo2.getPatente() + ")");
        System.out.println("Segundo conductor: " + conductor2.getNombre());
        System.out.println("Segundo motor: " + motor2.getTipo());

        // Mostrar que los motores pueden reutilizarse
        System.out.println("\n=== REUTILIZACIÓN DE MOTOR ===");
        Vehiculo vehiculo3 = new Vehiculo("DEF456", "Chevrolet Camaro", motor); // Mismo motor
        System.out.println("Tercer vehículo: " + vehiculo3.getModelo() +
                          " con motor " + vehiculo3.getMotor().getTipo() +
                          " (n° serie: " + vehiculo3.getMotor().getNumeroSerie() + ")");
    }
}
