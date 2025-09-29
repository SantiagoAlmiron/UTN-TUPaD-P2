package javapracticas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santiago
 */
import javapracticas.CategoriaProducto;
import java.util.ArrayList;

public class Inventario {
    // Atributo
    private ArrayList<Producto> productos;

    // Constructor
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // 1. Agregar producto
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // 2. Listar todos los productos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            for (Producto p : productos) {
                p.mostrarInfo();
            }
        }
    }

    // 3. Buscar producto por ID
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    // 4. Eliminar producto por ID
    public void eliminarProducto(String id) {
        Producto encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            productos.remove(encontrado);
            System.out.println("Producto con ID " + id + " eliminado.");
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.");
        }
    }

    // 5. Actualizar stock
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            encontrado.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para producto " + id);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // 6. Filtrar por categoría
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
            }
        }
    }

    // 7. Obtener total de stock
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // 8. Obtener producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        Producto max = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > max.getCantidad()) {
                max = p;
            }
        }
        return max;
    }

    // 9. Filtrar productos por rango de precio
    public void filtrarProductosPorPrecio(double min, double max) {
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
            }
        }
    }

    // 10. Mostrar categorías disponibles
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + " → " + c.getDescripcion());
        }
    }
}
