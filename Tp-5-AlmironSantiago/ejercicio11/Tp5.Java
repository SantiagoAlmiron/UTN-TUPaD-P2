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
        Artista artista = new Artista("The Beatles", "Rock");
        Cancion cancion = new Cancion("Hey Jude", artista);
        Reproductor reproductor = new Reproductor();

        System.out.println("=== DEPENDENCIA DE USO - REPRODUCTOR ===");
        reproductor.reproducir(cancion); // Dependencia de uso
    }
}
