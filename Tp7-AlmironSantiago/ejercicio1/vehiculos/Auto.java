/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;


/**
 *
 * @author santiago
 */
public class Auto extends Vehiculo {
    // Subclase: Auto con atributo adicional cantidadPuertas, sobrescribe mostrarInfo()
    int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Auto{" + "marca=" + super.marca + ", modelo=" + super.modelo + ", cantidadPuertas=" + cantidadPuertas + '}');
    }
}
