/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.arboles.contacto.modelo;

/**
 *
 * @author ACER
 */
public class Contacto {
    private String nombre;
    private String numeroTelefonico;

    public Contacto(String nombre, String numeroTelefonico) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", numeroTelefonico=" + numeroTelefonico + '}';
    }
    
}
