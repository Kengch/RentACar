/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EstructuraDeVehiculos;

/**
 *
 * @author Luis Chavarria
 */
public class node {
    //Atributos
    private vehiculo content;
    private node next;
    private node back;
    
    //Método constructor
    public node (vehiculo content){
        this.content = content;
    } 
    
    //Setters y Getters de los atributos
    public vehiculo getContent() {
        return content;
    }

    public void setContent(vehiculo content) {
        this.content = content;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public node getBack() {
        return back;
    }

    public void setBack(node back) {
        this.back = back;
    }

}
