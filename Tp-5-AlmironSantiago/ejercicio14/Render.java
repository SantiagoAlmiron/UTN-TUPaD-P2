/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author santiago
 */
public class Render {
    private String formato;
    // Se elimina la asociación con Proyecto del constructor
    // La relación se manejará en el método exportar

    public Render(String formato) { // Constructor solo con formato
        this.formato = formato;
    }

    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }

    @Override
    public String toString() {
        return "Render{formato='" + formato + "'}";
    }
}
