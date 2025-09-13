/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author santiago
 */
public class Foto {
    private int imagen_id;
    private String formato;

    public Foto(int imagen_id, String formato) {
        this.imagen_id = imagen_id;
        this.formato = formato;
    }

    // Getters y setters
    public int getImagen_id() {
        return imagen_id;
    }

    public void setImagen_id(int imagen_id) {
        this.imagen_id = imagen_id;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{" +
               "imagen_id=" + imagen_id +
               ", formato='" + formato + '\'' +
               '}';
    }
}
