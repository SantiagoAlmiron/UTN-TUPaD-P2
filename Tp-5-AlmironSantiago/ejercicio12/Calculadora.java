package tp5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santiago
 */
public class Calculadora {
    // Dependencia de uso: el método usar Impuesto como parámetro
    public void calcular(Impuesto impuesto) {
        double iva = impuesto.getMonto() * 0.21;
        double total = impuesto.getMonto() + iva;

        System.out.println("=== CÁLCULO DE IMPUESTO ===");
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("CUIL: " + impuesto.getContribuyente().getCuil());
        System.out.println("Monto base: $" + impuesto.getMonto());
        System.out.println("IVA (21%): $" + iva);
        System.out.println("Total a pagar: $" + total);
    }
}