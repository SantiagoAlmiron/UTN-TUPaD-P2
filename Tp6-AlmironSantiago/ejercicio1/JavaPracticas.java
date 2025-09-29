/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapracticas;

/**
 *
 * @author santiago
 */
public class JavaPracticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear inventario
        Inventario inventario = new Inventario();
        // 1. Crear al menos cinco productos con diferentes categorías
        Producto p1 = new Producto("P001", "Leche", 120.5, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Celular", 95000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 2500, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Silla", 15000, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Pan", 500, 100, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar todos los productos
        System.out.println("=== LISTA DE PRODUCTOS ===");
        inventario.listarProductos();

        // 3. Buscar un producto por ID
        System.out.println("=== BUSCAR PRODUCTO P003 ===");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar y mostrar productos de una categoría
        System.out.println("=== FILTRAR POR CATEGORÍA: ALIMENTOS ===");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // 5. Eliminar un producto y listar los restantes
        System.out.println("=== ELIMINAR PRODUCTO P002 ===");
        inventario.eliminarProducto("P002");
        inventario.listarProductos();

        // 6. Actualizar el stock de un producto
        System.out.println("=== ACTUALIZAR STOCK P001 ===");
        inventario.actualizarStock("P001", 70);
        inventario.buscarProductoPorId("P001").mostrarInfo();

        // 7. Mostrar total de stock disponible
        System.out.println("=== TOTAL DE STOCK DISPONIBLE ===");
        System.out.println("Total stock: " + inventario.obtenerTotalStock());

        // 8. Obtener y mostrar el producto con mayor stock
        System.out.println("=== PRODUCTO CON MAYOR STOCK ===");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        // 9. Filtrar productos por precio entre $1000 y $3000
        System.out.println("=== PRODUCTOS ENTRE $1000 y $3000 ===");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Mostrar categorías disponibles
        System.out.println("=== CATEGORÍAS DISPONIBLES ===");
        inventario.mostrarCategoriasDisponibles();
    }
}
