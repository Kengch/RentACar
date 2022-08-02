 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package estdatos.proyectofinal.EstructuraDeDatosClientes;

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

}
