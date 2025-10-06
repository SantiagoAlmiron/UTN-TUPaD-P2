/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagos;

/**
 *
 * @author santiago
 */
public class TarjetaCredito implements Pagable {
    private String titular;

    public TarjetaCredito(String titular) {
        this.titular = titular;
    }

    @Override
    public void pagar() {
        System.out.println("Pago realizado con tarjeta de crédito de " + titular);
    }
}
