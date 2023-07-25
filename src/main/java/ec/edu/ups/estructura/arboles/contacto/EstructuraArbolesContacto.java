/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.estructura.arboles.contacto;

import ec.edu.ups.estructura.arboles.contacto.controlador.ArbolContactos;
import ec.edu.ups.estructura.arboles.contacto.controlador.ControladorContactos;
import ec.edu.ups.estructura.arboles.contacto.modelo.Contacto;
import ec.edu.ups.estructura.arboles.contacto.vista.Vista;

/**
 *
 * @author ACER
 */
public class EstructuraArbolesContacto {

    public static void main(String[] args) {
      /*  ArbolContactos arbol = new ArbolContactos();
        
        Contacto contacto1 = new Contacto("Juan", "123456789");
        Contacto contacto2 = new Contacto("Maria", "987654321");
        Contacto contacto3 = new Contacto("Pedro", "456789123");
        Contacto contacto4 = new Contacto("Pablo", "56789123");

        arbol.insert(contacto1);
        arbol.insert(contacto2);
        arbol.insert(contacto3);
        arbol.insert(contacto4);
        arbol.insert(new Contacto("Julian", "5789123"));
        arbol.insert(new Contacto("Jhon", "567823"));
        arbol.insert(new Contacto("Jhonn", "5789123"));
        
        arbol.printTreeNode(arbol.getRoot(), "", true);
        
        arbol.eliminarContacto("Jhonn");
        
        arbol.printTreeNode(arbol.getRoot(), "", true);
        
       // arbol.inorderRecursivo(arbol.getRoot());
       */
      Vista vista = new Vista();
        ControladorContactos controlador = new ControladorContactos(vista);
        controlador.iniciar();

    }
}
