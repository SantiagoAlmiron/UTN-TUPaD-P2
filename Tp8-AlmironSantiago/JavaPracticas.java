package javapracticas;

import java.io.*;
import java.util.*;

public class JavaPracticas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---- Parte 1: E-commerce ----
        Cliente cliente = new Cliente("Santiago");
        Producto p1 = new Producto("Mouse", 5000);
        Producto p2 = new Producto("Teclado", 8000);

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        System.out.println(pedido);
        pedido.cambiarEstado("ENVIADO");

        // Pagos
        TarjetaCredito tc = new TarjetaCredito();
        tc.aplicarDescuento(10);
        tc.procesarPago(pedido.calcularTotal() * 0.9);

        PayPal pp = new PayPal();
        pp.procesarPago(pedido.calcularTotal());

        System.out.println("\n--- EJERCICIOS DE EXCEPCIONES ---\n");

        // ---- 1. División segura ----
        try {
            System.out.print("Ingrese dividendo: ");
            int a = sc.nextInt();
            System.out.print("Ingrese divisor: ");
            int b = sc.nextInt();
            System.out.println("Resultado: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero");
        }

        sc.nextLine(); // limpiar buffer

        // ---- 2. Conversión de cadena a número ----
        try {
            System.out.print("Ingrese un número: ");
            String input = sc.nextLine();
            int num = Integer.parseInt(input);
            System.out.println("Número ingresado: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: No es un número válido");
        }

        // ---- 3. Lectura de archivo dentro del paquete ----
        System.out.print("Ingrese nombre del archivo a leer (ej: archivo.yml): ");
        String nombreArchivo = sc.nextLine();

        try (InputStream is = JavaPracticas.class.getResourceAsStream("/javapracticas/" + nombreArchivo)) {
            if (is == null) {
                throw new FileNotFoundException("El archivo no se encuentra en el paquete javapracticas: " + nombreArchivo);
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
                String linea;
                System.out.println("\nContenido del archivo:");
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }

        // ---- 4. Excepción personalizada ----
        try {
            System.out.print("\nIngrese edad: ");
            int edad = sc.nextInt();
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad inválida: " + edad);
            }
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // ---- 5. Try-with-resources con otro archivo ----
        sc.nextLine(); // limpiar buffer
        System.out.print("Ingrese nombre de archivo para try-with-resources (ej: archivo.yml): ");
        String archivo2 = sc.nextLine();

        try (InputStream is2 = JavaPracticas.class.getResourceAsStream("/javapracticas/" + archivo2)) {
            if (is2 == null) {
                throw new FileNotFoundException("El archivo no se encuentra en el paquete javapracticas: " + archivo2);
            }

            try (BufferedReader br2 = new BufferedReader(new InputStreamReader(is2))) {
                String linea;
                System.out.println("\nContenido del archivo con try-with-resources:");
                while ((linea = br2.readLine()) != null) {
                    System.out.println(linea);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }

        sc.close();
    }
}
