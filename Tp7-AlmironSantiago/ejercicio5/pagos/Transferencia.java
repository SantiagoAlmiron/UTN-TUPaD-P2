/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagos;

/**
 *
 * @author santiago
 */
public class Transferencia implements Pagable {
    private String banco;

    public Transferencia(String banco) {
        this.banco = banco;
    }

    @Override
    public void pagar() {
        System.out.println("Pago realizado mediante transferencia bancaria al banco " + banco);
    }
}
