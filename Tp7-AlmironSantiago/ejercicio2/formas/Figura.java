/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 *
 * @author santiago
 */
public abstract class Figura {
    String nombre;

    public Figura(String nombre) { this.nombre = nombre; };

    public String getNombre() {
        return nombre;
    };

    public abstract double calcularArea();
}
