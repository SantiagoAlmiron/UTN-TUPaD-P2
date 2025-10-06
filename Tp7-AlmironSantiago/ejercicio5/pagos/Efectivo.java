package pagos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santiago
 */

public class Efectivo implements Pagable {
    private double monto;

    public Efectivo(double monto) {
        this.monto = monto;
    }

    @Override
    public void pagar() {
        System.out.println("Pago realizado en efectivo por $" + monto);
    }
}
