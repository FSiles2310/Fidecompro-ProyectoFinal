/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fidecompro.controlador;
import fidecompro.modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author fabia
 */
public class ControlCliente {
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public static void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public static ArrayList<Cliente> obtenerClientes() {
        return listaClientes;
    }
}
