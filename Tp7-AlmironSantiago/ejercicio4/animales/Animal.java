/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author santiago
 */
public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que obligará a sobrescribir en subclases
    public abstract void hacerSonido();

    // Método concreto
    public void describirAnimal() {
        System.out.println("Soy un " + nombre);
    }
}
