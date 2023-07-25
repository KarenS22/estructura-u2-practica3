/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.arboles.contacto.modelo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author ACER
 */
public class Contacto {
    private String nombre;
    private String numeroTelefonico;
    LinkedList<String> correos;
    Map<String ,String> redSociales;
    
    
    public Contacto(String nombre, String numeroTelefonico) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.correos = new  LinkedList<>();
        this.redSociales = new HashMap<>();
    }
    
    public void ingresarCorreo(String correo){
        correos.add(correo);
    }
    
    public void ingresarRedSocial(String redSocial, String link){
        redSociales.put(redSocial, link);
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
        return "Contacto{" + "nombre=" + nombre + ", numeroTelefonico=" + numeroTelefonico + ", correos=" + correos + ", redSocial=" + redSociales + '}';
    }
        
}
