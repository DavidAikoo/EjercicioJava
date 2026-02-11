package org.example;

import java.util.Arrays;

public class Pedidos {

    private String nombreCliente;
    private String id;

    public Pedidos() {
    }

    public Pedidos(String nombreCliente, String id, Productos[] productos, int contador) {
        this.nombreCliente = nombreCliente;
        this.id = id;
        this.productos = productos;
        this.contador = contador;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Productos[] getProductos() {
        return productos;
    }

    public void setProductos(Productos[] productos) {
        this.productos = productos;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", id='" + id + '\'' +
                ", productos=" + Arrays.toString(productos) +
                ", contador=" + contador +
                '}';
    }

    private Productos[] productos = new Productos[10];
    private int contador = 0;

    public Pedidos(String nombreCliente, String id) {
        this.nombreCliente = nombreCliente;
        this.id = id;
    }

    public void agregarProducto(Productos producto) {
        if (contador < productos.length) {
            productos[contador] = producto;
            contador++;
        }
    }

    public void mostrarDetalles() {

        System.out.println("DETALLES DEL PEDIDO");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("ID: " + id);

        for (Productos p : productos) {
            if (p != null) {
                System.out.println("-----------------");
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Cantidad: " + p.getCantidad());
                System.out.println("Precio: " + p.getPrecio());
            }
        }
    }
}
