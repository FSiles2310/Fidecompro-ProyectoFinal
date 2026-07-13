package fidecompro.controlador;

import fidecompro.modelo.Producto;
import java.util.ArrayList;

public class ControlProducto {
    private static final ArrayList<Producto> listaProductos = new ArrayList<>();

    public static void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public static ArrayList<Producto> obtenerProductos() {
        return listaProductos;
    }
}
