/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/*
    8.​ Cálculo del Precio Final con impuesto y descuento.
    Crea un método calcularPrecioFinal(double impuesto, double descuento) que
    calcule el precio final de un producto en un e-commerce.
    Fórmula:
    PrecioFinal = PrecioBase + (PrecioBase × Impuesto) - (PrecioBase × Descuento)
    Desde main(), solicita el precio base, el porcentaje de impuesto y el porcentaje
    de descuento, llama al método y muestra el resultado.
 */

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double precioBase;
        double impuesto;
        double descuento;

        System.out.print("Ingrese el precio base del producto: ");
        precioBase = scan.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = scan.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = scan.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);

        scan.close();
    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;
        return precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
    }
}
