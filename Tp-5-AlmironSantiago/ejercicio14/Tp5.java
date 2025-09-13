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
        Proyecto proyecto = new Proyecto("Documental Naturaleza", 120);
        EditorVideo editor = new EditorVideo();

        System.out.println("=== DEPENDENCIA DE CREACIÓN - EDITOR VIDEO ===");
        editor.exportar("MP4", proyecto); // Dependencia de creación

        System.out.println("\n=== SEGUNDA EXPORTACIÓN ===");
        editor.exportar("AVI", proyecto); // Otra dependencia de creación
    }
}
