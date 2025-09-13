/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5;

/**
 *
 * @author santiago
 */
public class Tp5 {

    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE RELACIONES DOCUMENTO - FIRMADIGITAL - USUARIO ===");

        // Crear objetos
        Usuario usuario = new Usuario("Ana Rodríguez", "ana.rodriguez@email.com");

        // Documento crea la FirmaDigital internamente (composición)
        Documento documento = new Documento("Contrato de Servicios",
                                          "Este es el contenido del contrato...",
                                          "a1b2c3d4e5f67890", "2024-03-15", usuario);

        System.out.println("1. Objetos creados:");
        System.out.println("   Usuario: " + usuario);
        System.out.println("   Documento: " + documento);
        System.out.println("   FirmaDigital: " + documento.getFirmaDigital());

        // Verificar relaciones
        System.out.println("\n2. Verificación de relaciones:");
        System.out.println("   Relación Documento → FirmaDigital (composición): " +
                          documento.getFirmaDigital().getCodigoHash());
        System.out.println("   Relación FirmaDigital → Usuario (agregación): " +
                          documento.getFirmaDigital().getUsuario().getNombre());
        System.out.println("   Fecha de firma: " + documento.getFirmaDigital().getFecha());
        System.out.println("   Email del usuario: " + documento.getFirmaDigital().getUsuario().getEmail());
        System.out.println("   Título del documento: " + documento.getTitulo());

        System.out.println("\n3. Estado final de los objetos:");
        System.out.println("   Documento: " + documento);
        System.out.println("   FirmaDigital: " + documento.getFirmaDigital());
        System.out.println("   Usuario: " + usuario);

        // Demostrar que es composición (FirmaDigital no puede existir sin Documento)
        System.out.println("\n4. Demostración de composición:");
        System.out.println("   La FirmaDigital fue creada dentro del Documento");
        System.out.println("   No existe una referencia externa independiente a la FirmaDigital");
        System.out.println("   La FirmaDigital no puede existir sin el Documento");

        // Demostrar que es agregación (Usuario puede existir sin FirmaDigital)
        System.out.println("\n5. Demostración de agregación:");
        System.out.println("   El Usuario existe independientemente de la FirmaDigital");
        System.out.println("   Puede haber usuarios sin firmas digitales (agregación)");

        // Prueba con múltiples instancias
        System.out.println("\n=== SEGUNDA INSTANCIA ===");
        Usuario usuario2 = new Usuario("Carlos Méndez", "carlos.mendez@empresa.com");
        Documento documento2 = new Documento("Acuerdo de Confidencialidad",
                                           "Contenido confidencial del acuerdo...",
                                           "z9y8x7w6v5u43210", "2024-03-16", usuario2);

        System.out.println("Segundo documento: " + documento2.getTitulo());
        System.out.println("Segundo usuario: " + documento2.getFirmaDigital().getUsuario().getNombre());
        System.out.println("Segunda firma: " + documento2.getFirmaDigital().getCodigoHash());

        // Mostrar que los usuarios pueden reutilizarse para múltiples firmas
        System.out.println("\n=== REUTILIZACIÓN DE USUARIO ===");
        Documento documento3 = new Documento("Addendum al Contrato",
                                           "Contenido adicional del contrato...",
                                           "q1w2e3r4t5y67890", "2024-03-17", usuario); // Mismo usuario

        System.out.println("Tercer documento: " + documento3.getTitulo());
        System.out.println("Mismo usuario: " + documento3.getFirmaDigital().getUsuario().getNombre());
        System.out.println("Nueva firma: " + documento3.getFirmaDigital().getCodigoHash());
    }
}
