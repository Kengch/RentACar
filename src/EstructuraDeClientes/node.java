/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EstructuraDeClientes;

/**
 *
 * @author Luis Chavarria
 */
public class node {
    private persona content;
    private node izquierda; // Hijo de la izquierda
    private node derecha; // Hijo de la derecha
    
    public node(persona content){
        this.content = content;
    }

    public persona getContent() {
        return content;
    }

    public void setContent(persona content) {
        this.content = content;
    }

    public node getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(node izquierda) {
        this.izquierda = izquierda;
    }

    public node getDerecha() {
        return derecha;
    }

    public void setDerecha(node derecha) {
        this.derecha = derecha;
    }

}
