/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fidecompro.modelo;

/**
 *
 * @author fabia
 */
public class Usuario extends Persona {
    private String usuario;
    private String contraseña;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String usuario, String contraseña) {
        super(id, nombre);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Usuario: " + usuario);
    }
}
