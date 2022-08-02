/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package estdatos.proyectofinal.EstructuraDeDatos;

import java.util.Scanner;

/**
 *
 * @author Luis Chavarria
 */
public class listaDeVehiculos {
    //Atributos
    private node head;
    private node tail;
    
    
    public void registrarVehiculo(vehiculo content){ // Cambiar a lista doblemente enlazada
        
        // if verifica si existe algún elemento en la lista
        if (head == null){
            head = new node(content);
            tail = head;
            tail.setNext(head);
            head.setNext(tail);
            tail.setBack(head);
            head.setBack(tail);
        }
        /*Este else primero verifica que la placa no existe ya en algún nodo y
        si no existe entonces dentro del último if lo crea*/        
        else {
            node aux = head;
            boolean existe = false; // bandera para indicar si la placa existe o no existe en algún nodo
            do{
                if(aux.getContent().getPlaca().equalsIgnoreCase(content.getPlaca())){
                    System.out.println("No es posible registrar esta información.\nEsta placa ya existe en el registro de vehículos.");
                    existe = true;
                    break; // Si la placa existe entonces la bandera pasa a verdadero y además salimos del bucle.
                }
                
                aux = aux.getNext();
            }while(aux.getNext() != head); // bucle para recorrer nodos
            
            if (existe == false){ //Esto solo se ejecutará si la placa ingresada no es duplicada
                node aux2 = new node(content);
                aux2.setBack(tail);
                tail.setNext(aux2);
                tail = aux2;
                tail.setNext(head);
                head.setBack(tail);
                
            }
            
        }
        
    }
    
    // Punto 2. Modificar/Eliminar Vehículo
    public void modificarVehiculo(String placa){
        node aux = head;
        Scanner modificacion = new Scanner(System.in);
        String nuevoDato;
        do{
            if(placa.equalsIgnoreCase(tail.getContent().getPlaca())){
                
                System.out.println("Información actual de esta placa:\n");
                System.out.println(
                    "Placa: "+tail.getContent().getPlaca()+
                    ", marca: "+tail.getContent().getMarca()+
                    ", modelo: "+tail.getContent().getModelo()+
                    ", año: "+tail.getContent().getAño()+
                    ", color: "+tail.getContent().getColor()+
                    ", cilindrada: "+tail.getContent().getCilindrada()+
                    ", combustible: "+tail.getContent().getCombustible()+
                    ", pasajeros: "+ tail.getContent().getPasajeros()+
                    ", precio por día: "+tail.getContent().getPrecioXdia()+
                    ", extras: "+tail.getContent().getExtras());
                System.out.println("-----------------------------------------\n");
                System.out.println("A continuación, ingrese los datos del vehiculo con las ediciones requeridas: \n");
                System.out.println("Marca: ");
                nuevoDato = modificacion.nextLine();
                tail.getContent().setMarca(nuevoDato);
                
                System.out.println("Modelo: ");
                nuevoDato = modificacion.nextLine();
                tail.getContent().setModelo(nuevoDato);
                
                System.out.println("Año: ");
                nuevoDato = modificacion.nextLine();
                tail.getContent().setAño(nuevoDato);
                
                System.out.println("Color: ");
                nuevoDato = modificacion.nextLine();
                tail.getContent().setColor(nuevoDato);
                
                System.out.println("Cilindrada: ");
                nuevoDato = modificacion.nextLine();
                tail.getContent().setCilindrada(nuevoDato);
                
                System.out.println("Combustible: ");
                nuevoDato = modificacion.nextLine();
                tail.getContent().setCombustible(nuevoDato);
                
                System.out.println("Pasajeros: ");
                nuevoDato = modificacion.nextLine();
                tail.getContent().setPasajeros(nuevoDato);
                
                System.out.println("Precio por día: ");
                nuevoDato = modificacion.nextLine();
                tail.getContent().setPrecioXdia(Double.parseDouble(nuevoDato));
                
                System.out.println("Extras: ");
                nuevoDato = modificacion.nextLine();
                tail.getContent().setExtras(nuevoDato);
                
                System.out.println("Los cambios se han aplicado exitósamente!");
                return ; // Usamos return para interrumpir el método una vez encontramos una coincidencia
            }
            else if(placa.equalsIgnoreCase(aux.getContent().getPlaca())){
                System.out.println("Información actual de esta placa:\n");
                System.out.println(
                    "Placa: "+aux.getContent().getPlaca()+
                    ", marca: "+aux.getContent().getMarca()+
                    ", modelo: "+aux.getContent().getModelo()+
                    ", año: "+aux.getContent().getAño()+
                    ", color: "+aux.getContent().getColor()+
                    ", cilindrada: "+aux.getContent().getCilindrada()+
                    ", combustible: "+aux.getContent().getCombustible()+
                    ", pasajeros: "+ aux.getContent().getPasajeros()+
                    ", precio por día: "+aux.getContent().getPrecioXdia()+
                    ", extras: "+aux.getContent().getExtras());
                System.out.println("-----------------------------------------\n");
                System.out.println("A continuación, ingrese los datos del vehiculo con las ediciones requeridas: \n");
                System.out.println("Marca: ");
                nuevoDato = modificacion.nextLine();
                aux.getContent().setMarca(nuevoDato);
                
                System.out.println("Modelo: ");
                nuevoDato = modificacion.nextLine();
                aux.getContent().setModelo(nuevoDato);
                
                System.out.println("Año: ");
                nuevoDato = modificacion.nextLine();
                aux.getContent().setAño(nuevoDato);
                
                System.out.println("Color: ");
                nuevoDato = modificacion.nextLine();
                aux.getContent().setColor(nuevoDato);
                
                System.out.println("Cilindrada: ");
                nuevoDato = modificacion.nextLine();
                aux.getContent().setCilindrada(nuevoDato);
                
                System.out.println("Combustible: ");
                nuevoDato = modificacion.nextLine();
                aux.getContent().setCombustible(nuevoDato);
                
                System.out.println("Pasajeros: ");
                nuevoDato = modificacion.nextLine();
                aux.getContent().setPasajeros(nuevoDato);
                
                System.out.println("Precio por día: ");
                nuevoDato = modificacion.nextLine();
                aux.getContent().setPrecioXdia(Double.parseDouble(nuevoDato));
                
                System.out.println("Extras: ");
                nuevoDato = modificacion.nextLine();
                aux.getContent().setExtras(nuevoDato);
                
                System.out.println("Los cambios se han aplicado exitósamente!");
                return; // Usamos return para interrumpir el método una vez encontramos una coincidencia
                
            }
            
            aux = aux.getNext(); // Esto mueve el aux a traves del ciclo
            
        }while (aux != head); // Si el ciclo acaba sin coincidencias, entonces se imprime lo siguiente:
        
        System.out.println("No hay coincidencias para la busqueda realizada.");
    }
    
    public void eliminarVehiculo(String placa){
        node aux = head;
        
        do{
            if(placa.equalsIgnoreCase(head.getContent().getPlaca())){
                head = head.getNext();
                head.setBack(tail);
                tail.setNext(head);
                return;
            }
            else if(placa.equalsIgnoreCase(tail.getContent().getPlaca())){
                tail = tail.getBack();
                tail.setNext(head);
                head.setBack(tail);
                return; // Usamos return para interrumpir el método una vez encontramos una coincidencia
            }
            else if(placa.equalsIgnoreCase(aux.getContent().getPlaca())){
                aux.getBack().setNext(aux.getNext());
                aux.getNext().setBack(aux.getBack());
                return;
            }
            
            aux = aux.getNext(); // Esto mueve el aux a traves del ciclo
            
        }while (aux != head);
        System.out.println("No hay registros del vehículo que se desea eliminar.");
        
    }
    
    // Punto 3. Consultar lista de vehículos registrados
    public void consultarLista(){
        if (head == null){
            System.out.println("La lista esta vacia.");
        }
        else{
            System.out.println("Lista actual de vehículos:\n");
            node aux = head;
            do{
                System.out.println(
                        "Placa: "+aux.getContent().getPlaca()+
                        ", marca: "+aux.getContent().getMarca()+
                        ", modelo: "+aux.getContent().getModelo()+
                        ", año: "+aux.getContent().getAño()+
                        ", color: "+aux.getContent().getColor()+
                        ", cilindrada: "+aux.getContent().getCilindrada()+
                        ", combustible: "+aux.getContent().getCombustible()+
                        ", pasajeros: "+ aux.getContent().getPasajeros()+
                        ", precio por día: "+aux.getContent().getPrecioXdia()+
                        ", extras: "+aux.getContent().getExtras()+"\n");
                
                aux = aux.getNext();
            }while (aux != head);
            
        }
    
    }
    
    public void consultarPlaca(String placa){
        node aux = head;
        do{
            if(placa.equalsIgnoreCase(tail.getContent().getPlaca())){
                System.out.println("Coincidencia encontrada!");
                System.out.println(
                    "Placa: "+tail.getContent().getPlaca()+
                    ", marca: "+tail.getContent().getMarca()+
                    ", modelo: "+tail.getContent().getModelo()+
                    ", año: "+tail.getContent().getAño()+
                    ", color: "+tail.getContent().getColor()+
                    ", cilindrada: "+tail.getContent().getCilindrada()+
                    ", combustible: "+tail.getContent().getCombustible()+
                    ", pasajeros: "+ tail.getContent().getPasajeros()+
                    ", precio por día: "+tail.getContent().getPrecioXdia()+
                    ", extras: "+tail.getContent().getExtras());
                return; // Usamos return para interrumpir el método una vez encontramos una coincidencia
            }
            else if(placa.equalsIgnoreCase(aux.getContent().getPlaca())){
                System.out.println("Coincidencia encontrada!");
                System.out.println(
                    "Placa: "+aux.getContent().getPlaca()+
                    ", marca: "+aux.getContent().getMarca()+
                    ", modelo: "+aux.getContent().getModelo()+
                    ", año: "+aux.getContent().getAño()+
                    ", color: "+aux.getContent().getColor()+
                    ", cilindrada: "+aux.getContent().getCilindrada()+
                    ", combustible: "+aux.getContent().getCombustible()+
                    ", pasajeros: "+ aux.getContent().getPasajeros()+
                    ", precio por día: "+aux.getContent().getPrecioXdia()+
                    ", extras: "+aux.getContent().getExtras());
                return; // Usamos return para interrumpir el método una vez encontramos una coincidencia
                
            }
            
            aux = aux.getNext(); // Esto mueve el aux a traves del ciclo
            
        }while (aux != head);
        
        System.out.println("No hay coincidencias para la busqueda realizada.");
        
    }
    
}
