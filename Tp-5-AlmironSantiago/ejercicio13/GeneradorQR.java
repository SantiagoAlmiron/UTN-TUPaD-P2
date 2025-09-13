/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author santiago
 */
public class GeneradorQR {
    // Dependencia de creación: crea CódigoQR dentro del método pero no lo guarda
    public void generar(String valor, Usuario usuario) {
        // Creación interna del objeto (dependencia de creación)
        // Solo con el valor, sin usuario en el constructor
        CodigoQR codigoQR = new CodigoQR(valor);

        System.out.println("=== CÓDIGO QR GENERADO ===");
        System.out.println("Valor: " + codigoQR.getValor());
        System.out.println("Para usuario: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Código QR creado: " + codigoQR);

        // El objeto CodigoQR solo existe dentro de este método
        // No se guarda como atributo de la clase GeneradorQR
        // La relación con Usuario es temporal durante la ejecución
    }
}
