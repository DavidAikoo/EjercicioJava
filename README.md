# Ejercicio Practica Composición

 ## Descripción

 Este proyecto contiene la siguiente actividad:

 Desarrollar un sistema donde un pedido tiene varios productos. El sistema debe permitir: 
1. Crear pedido
2. Agregar productos al pedido
3. Mostrar Detalles del pedido

Diagrama:

```
+-------------------------------------------+
|           Productos                       |
+-------------------------------------------+
| - nombre : String                         |
| - cantidad : int                          |
| - precio : double                         |
+-------------------------------------------+
| + getPrecio()                             |
| + getCantidad()                           |
| + getNombre()                             |
+-------------------------------------------+
                   ◆ 
                   |
                   | 
                   |
   +-------------------------------------+
   |      Pedidos                        |
   +-------------------------------------+
   | - nombrecliente : String            |
   | - id : String                       |
   +-------------------------------------+
   | + agregarProducto(Productos producto|
   | + mostrarDetalles()                 |
   +-------------------------------------+
```


