/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author santiago
 */
public class CodigoQR {
    private String valor;
    // Se elimina la asociación con Usuario del constructor
    // La relación se manejará en el método generar

    public CodigoQR(String valor) { // Constructor solo con valor
        this.valor = valor;
    }

    public String getValor() { return valor; }
    public void setValor(String valor) { this.valor = valor; }

    @Override
    public String toString() {
        return "CodigoQR{valor='" + valor + "'}";
    }
}
