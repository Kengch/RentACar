/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rent_a_car;

import EstructuraDeClientes.BinaryTreeClientes;// Se importa para poder crear la lista según la estructura de datos creada
import EstructuraDeClientes.persona;// Se importa para poder utilizar los nodos de tipo vehículo en nuestra estructura
import EstructuraDeVehiculos.listaDeVehiculos;// Se importa para poder crear la lista de clientes en la estructura de Árbol binario
import EstructuraDeVehiculos.vehiculo;// Se importa para poder tener acceso a los nodos tipo persona que se usan en estructura Árbol

/**
 *
 * @author luisf
 */
public class Rent_A_Car {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Registrar vehículos
        // Se crean nodos de vehículos que se introducirían mediante GUI
        listaDeVehiculos vehiculos = new listaDeVehiculos ();
        vehiculos.registrarVehiculo(new vehiculo("QWE514","Ferrari", "296 GTB", "2001", "Rojo", "3000", "Gasolina", "2", 120000, "Aire condicionado, asientos de cuero, turbo, sport"));
        vehiculos.registrarVehiculo(new vehiculo("LOL232","Honda", "Civic Type R TC", "2015", "Azul", "2500", "Gasolina", "4", 75000, "Aire condicionado, asientos de cuero, turbo, sport"));
        vehiculos.registrarVehiculo(new vehiculo("KGB846","Toyota", "Camry Hybrid", "2005", "Blanco", "2500", "Gasolina/Electrico", "4", 75000, "Aire condicionado, hibrido, turbo, sport"));
        vehiculos.registrarVehiculo(new vehiculo("FBI111","Ford", "Expedition", "2022", "Gris", "3500", "Diesel", "7", 90000, "Aire condicionado, asientos de cuero, 4x4, espacioso"));
        vehiculos.registrarVehiculo(new vehiculo("GGG101","BMW", "i4", "2021", "Negro", "2500", "Electrico", "5", 100000, "Aire condicionado, asientos de cuero, turbo, consumo económico"));
        
        //2. Modificar/Eliminar vehículo
        //Pruebas para modificar vehículo
        vehiculos.consultarPlaca("FBI111");
        
        vehiculos.modificarVehiculo("FBI111");
        
        vehiculos.consultarPlaca("FBI111");
        
        //Pruebas para eliminar vehículo
        vehiculos.consultarLista();
        vehiculos.eliminarVehiculo("KGB846");
        vehiculos.eliminarVehiculo("FBI111");
        vehiculos.eliminarVehiculo("GGG101");
        vehiculos.consultarLista();
        
        
        // 3. Consultar lista de vehículos registrados
        vehiculos.consultarLista();

        //4. Registrar cliente
        // Se crean nodos de clientes que se introducirían mediante GUI
        BinaryTreeClientes clientes = new BinaryTreeClientes();
        clientes.insertaPersona(new persona(15,"Luis Carlos Chaves Montero","1992","luiscach@hotmail.com","Oro"));
        clientes.insertaPersona(new persona(68,"María Fernanda Ramirez Aguilar","1998","mfra98@gmail.com","Zafiro"));
        clientes.insertaPersona(new persona(99,"Diana Quesada Sanchez","2000","dianaq@gmail.com","Plata"));
        clientes.insertaPersona(new persona(5,"Alberto Jimenez Campos","2019","aljic2019@hotmail.com","Oro"));
        clientes.insertaPersona(new persona(35,"Juan Daniel Serrano Vega","1900","juandavega@hotmail.com","Plata"));
        
        //5. Modificar información del cliente
        System.out.println("----------------------------------\n");
        clientes.modificarCliente(15);
        clientes.consultarCliente(15);
        
        //6. Consultar información de cliente
        clientes.listarClientes();
    }
    
}
