/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fidecompro.modelo;
import java.util.ArrayList;

/**
 *
 * @author fabia
 */
public class Factura {

    private int numero;
    private Cliente cliente;
    private ArrayList<DetalleFactura> detalles;

    public Factura() {
        detalles = new ArrayList<>();
    }

    public Factura(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        detalles = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<DetalleFactura> getDetalles() {
        return detalles;
    }

    public void agregarDetalle(DetalleFactura detalle) {
        detalles.add(detalle);
    }

    public double calcularTotal() {

        double total = 0;

        for (DetalleFactura detalle : detalles) {
            total += detalle.calcularSubtotal();
        }

        return total;
    }

}
