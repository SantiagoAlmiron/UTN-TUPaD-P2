/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author santiago
 */
public class Vehiculo {
    // ● Clase base: Vehículo con atributos marca, modelo y método mostrarInfo()
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("vehiculo{" + "marca=" + marca + ", modelo=" + modelo + '}');
    }
}
