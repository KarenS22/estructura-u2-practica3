/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.arboles.contacto.vista;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Vista {
    //se usa el Scanner para que el usuario ingrese la informacion

    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenuPrincipal() {
        //menu
        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar contacto por el nombre");
        System.out.println("3. Eliminar contacto por el nombre");
        System.out.println("4. Agregar un correo");
        System.out.println("5. Agregar una red social");
        System.out.println("6. Imprimir el arbol segun el recorrido: ");
        System.out.println("7. Obtener el numero de contactos totales");
        System.out.println("8. Obtener el numero de niveles del arbol");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
        //ingreso de opcion
        int opcion = scanner.nextInt();
//        scanner.nextLine();
        return opcion;
    }
    
        public int mostrarMenuImprimir() {
        //menu
        System.out.println("    ===== MENU IMPRIMIR ARBOL SEGUN EL RECORRIDO: =====");
        System.out.println("    1. Preorder");
        System.out.println("    2. Inorder");
        System.out.println("    3. PostOrder");
        System.out.println("    4. Anchura");
        System.out.println("    0. Salir");
        System.out.print("Ingrese una opción: ");
        //ingreso de opcion
        int opcion = scanner.nextInt();
        return opcion;
    }

    public int pedirOpcion() {
        System.out.println("Ingrese la opcion deseada: ");
        return scanner.nextInt();
    }
    

    public String pedirNombre() {
        System.out.print("Ingrese su nombre: ");
        return scanner.next();
    }
    
     public String pedirNombreBuscar() {
        System.out.print("Ingrese el nombre a buscar: ");
        return scanner.next();
    }

    public String pedirTelefono() {
        System.out.print("Ingrese su telefono: ");
        return scanner.next();
    }
    
    public String pedirRedSocial() {
        System.out.print("Ingrese la red social que desea agregar: ");
        return scanner.next();
    }
    
    public String pedirLink() {
        System.out.print("Ingrese el link: ");
        return scanner.next();
    }
    
    public String pedirCorreo() {
        System.out.print("Ingrese su correo: ");
        return scanner.next();
    }
    

    /// Muestra un mensaje como nivel 1
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
