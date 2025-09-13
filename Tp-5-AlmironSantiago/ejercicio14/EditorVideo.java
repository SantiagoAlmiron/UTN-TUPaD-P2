package tp5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santiago
 */
public class EditorVideo {
    // Dependencia de creación: crea Render dentro del método pero no lo guarda
    public void exportar(String formato, Proyecto proyecto) {
        // Creación interna del objeto (dependencia de creación)
        // Solo con el formato, sin proyecto en el constructor
        Render render = new Render(formato);

        System.out.println("=== RENDER EXPORTADO ===");
        System.out.println("Formato: " + render.getFormato());
        System.out.println("Proyecto: " + proyecto.getNombre());
        System.out.println("Duración: " + proyecto.getDuracionMin() + " minutos");
        System.out.println("Render creado: " + render);

        // Simulación de proceso de exportación
        System.out.println("Exportando proyecto '" + proyecto.getNombre() +
                          "' en formato " + formato + "...");
        System.out.println("Exportación completada exitosamente!");

        // El objeto Render solo existe dentro de este método
        // No se guarda como atributo de la clase EditorVideo
        // La relación con Proyecto es temporal durante la ejecución
    }
}
