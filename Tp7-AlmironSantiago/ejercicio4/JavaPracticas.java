/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javapracticas;
import animales.*;
import java.util.ArrayList;

/**
 *
 * @author santiago */

public class JavaPracticas {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Mishi"));
        animales.add(new Vaca("Lola"));

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido(); // Polimorfismo
            System.out.println();
        }
    }
}

