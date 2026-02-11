package org.example;

public class Main {
    public static void main(String[] args) {

        Pedidos pedido = new Pedidos("Juan", "001A");

        Productos p1 = new Productos("Salsa", 2, 250.00);
        Productos p2 = new Productos("Gaseosa", 1, 3000.00);

        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        pedido.mostrarDetalles();
    }
}
