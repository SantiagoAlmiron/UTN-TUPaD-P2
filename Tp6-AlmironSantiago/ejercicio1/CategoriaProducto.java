package javapracticas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santiago
 */
public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    // Atributo para guardar la descripción de cada categoría
    private final String descripcion;

    // Constructor privado (siempre es privado en los enums)
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método público para obtener la descripción
    public String getDescripcion() {
        return descripcion;
    }
}
