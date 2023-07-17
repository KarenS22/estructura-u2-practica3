/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.arboles.contacto.controlador;

import ec.edu.ups.estructura.arboles.contacto.modelo.Contacto;
import ec.edu.ups.estructura.arboles.contacto.modelo.Node;

/**
 *
 * @author ACER
 */
public class ArbolContactos {

    private Node raiz;

    public ArbolContactos() {
        this.raiz = null;
    }

    public void insert(Contacto newContacto) {
        if (raiz == null) {
            raiz = new Node(newContacto);
        } else {
            insertResursivo(raiz, newContacto);
        }
    }

    private void insertResursivo(Node node, Contacto newContacto) {
        if (newContacto.getNombre().compareTo(node.getContacto().getNombre()) < 0) {
            if (node.getIzquierda() == null) {
                node.setIzquierda(new Node(newContacto));
            } else {
                insertResursivo(node.getIzquierda(), newContacto);
            }
        } else if (newContacto.getNombre().compareTo(node.getContacto().getNombre()) > 0) {
            if (node.getDerecha() == null) {
                node.setDerecha(new Node(newContacto));
            } else {
                insertResursivo(node.getDerecha(), newContacto);
            }
        } else {
            //Si el contacto es igual a uno existente
        }
    }

    public boolean estaEquilibrado() {
        return verificarBalance(raiz);
    }

    private boolean verificarBalance(Node node) {
        if (node == null) {
            return true; //Arbol  vacio, se considera equilibrado
        }

        int alturaIzquierda = obtenerAltura(node.getIzquierda());
        int alturaDerecha = obtenerAltura(node.getDerecha());

        int diferencia = Math.abs(alturaIzquierda - alturaDerecha);
        //verificamos la diferencia de las alturas
        if (diferencia > 1) {
            return false;
        }
        
        return verificarBalance(node.getIzquierda()) && verificarBalance(node.getDerecha());
    }

    private int obtenerAltura(Node node) {
        if (node == null) {
            return 0;
        }

        int alturaIzquierda = obtenerAltura(node.getIzquierda());
        int alturaDerecha = obtenerAltura(node.getDerecha());

        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }

}
