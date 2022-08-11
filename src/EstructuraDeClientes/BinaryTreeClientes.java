 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EstructuraDeClientes;

import java.util.Scanner;

/**
 *
 * @author Luis Chavarria
 */
public class BinaryTreeClientes {
    private node root;
    
    public void insertaPersona(persona content){
        if (root == null){
            root = new node(content);
        }
        else{
            insertarPersona(root, content);
        }
        
    }
    
    private void insertarPersona(node node, persona content){
        if (content.getCedula() <= node.getContent().getCedula()){
            if (node.getIzquierda() == null){
                node.setIzquierda(new node(content));
            }
            else{
                insertarPersona(node.getIzquierda(), content);
            }
        
        }
        else{
            if(node.getDerecha() == null){
                node.setDerecha(new node(content));
            }
            else{
                insertarPersona(node.getDerecha(), content);
            }
        }
    }
    
    public void listarClientes(){ //Esto método junto con recorrerClientes van a mostrar la lista de clientes existentes.
        if (root != null){
            recorrerClientes(root);
        }
        else{
            System.out.println("No hay clientes registrados para consultar.");
        }
    }
    private void recorrerClientes(node node){
        if (node != null){
            recorrerClientes(node.getIzquierda());
            System.out.println(node.getContent().getCedula());
            System.out.println(node.getContent().getNombre());
            System.out.println(node.getContent().getNacimiento());
            System.out.println(node.getContent().getCorreo());
            System.out.println(node.getContent().getCategoria()+"\n");
            recorrerClientes(node.getDerecha());
        }
    }
    public void consultarCliente(int cedula){
        node aux = root;
        while(cedula != aux.getContent().getCedula()){
            if(cedula < aux.getContent().getCedula()){
                aux = aux.getIzquierda();
            }
            else{
                aux = aux.getDerecha();
            }
            if(aux == null){
                System.out.println("No existe una persona con esta cédula.");
                return; // Este return finaliza el método ya que una vez que el aux llega a null, no hay nada más qué revisar.
            }
        }
        System.out.println("Existe una coincidencia para la busqueda realizada:\n");
        System.out.println(aux.getContent().getCedula());
        System.out.println(aux.getContent().getNombre());
        System.out.println(aux.getContent().getNacimiento());
        System.out.println(aux.getContent().getCorreo());
        System.out.println(aux.getContent().getCategoria());
    }
    
    public void modificarCliente(int cedula){
        node aux = root;
        Scanner sc = new Scanner (System.in);
        while(cedula != aux.getContent().getCedula()){
            if(cedula < aux.getContent().getCedula()){
                aux = aux.getIzquierda();
            }
            else{
                aux = aux.getDerecha();
            }
            if(aux == null){
                System.out.println("No existe una persona con esta cédula.");
                return; // Este return finaliza el método ya que una vez que el aux llega a null, no hay nada más qué revisar.
            }
        }
        System.out.println("La información actual del cliente con esta cédula es:\n");
        System.out.println("Nombre: "+aux.getContent().getNombre());
        System.out.println("Fecha de nacimiento: "+aux.getContent().getNacimiento());
        System.out.println("Correo electrónico: "+aux.getContent().getCorreo());
        System.out.println("Categoría: "+aux.getContent().getCategoria());
        
        System.out.println("A continuación introduzca la información nueva para que la anterior sea remplazada:");
        System.out.println("Nombre:");
        aux.getContent().setNombre(sc.nextLine());
        
        System.out.println("Fecha de nacimiento:");
        aux.getContent().setNacimiento(sc.nextLine());
        
        System.out.println("Correo electrónico:");
        aux.getContent().setCorreo(sc.nextLine());
        
        System.out.println("Categoría:");
        aux.getContent().setCategoria(sc.nextLine());
    }
}
