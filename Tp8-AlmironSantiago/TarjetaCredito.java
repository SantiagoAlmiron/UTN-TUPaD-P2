/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapracticas;

/**
 *
 * @author santiago
 */
public class TarjetaCredito implements PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta procesado: $" + monto);
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Se aplicó un descuento del " + porcentaje + "% en tarjeta de crédito");
    }
}
