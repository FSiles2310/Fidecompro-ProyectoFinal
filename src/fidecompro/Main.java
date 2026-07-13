package fidecompro;

import fidecompro.vista.VentanaInicioSesion;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            VentanaInicioSesion ventana = new VentanaInicioSesion();
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        });
    }
}
