/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javapracticas;

/**
 *
 * @author santiago */


import pagos.*;

public class JavaPracticas {

    // Método genérico para procesar cualquier tipo de pago
    public static void procesarPago(Pagable medio) {
        medio.pagar(); // Polimorfismo: se llama al pagar() correspondiente
    }

    public static void main(String[] args) {
        // Creamos distintas formas de pago
        Pagable[] pagos = {
            new TarjetaCredito("Ana"),
            new Transferencia("Banco Nación"),
            new Efectivo(1500)
        };

        // Procesamos los pagos usando polimorfismo
        for (Pagable medio : pagos) {
            procesarPago(medio);
        }
    }
}
