
package estdatos.proyectofinal;

import estdatos.proyectofinal.EstructuraDeDatos.listaDeVehiculos; // Se importa para poder crear la lista según la estructura de datos creada
import estdatos.proyectofinal.EstructuraDeDatos.vehiculo; // Se importa para poder utilizar los nodos de tipo vehículo en nuestra estructura
import estdatos.proyectofinal.EstructuraDeDatosClientes.BinaryTreeClientes; // Se importa para poder crear la lista de clientes en la estructura de Árbol binario
import estdatos.proyectofinal.EstructuraDeDatosClientes.persona; // Se importa para poder tener acceso a los nodos tipo persona que se usan en estructura Árbol

public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        listaDeVehiculos vehiculos = new listaDeVehiculos ();
//        vehiculos.registrarVehiculo(new vehiculo("QWE514","Ferrari", "296 GTB", "2001", "Rojo", "3000", "Gasolina", "2", 120000, "Aire condicionado, asientos de cuero, turbo, sport"));
//        vehiculos.registrarVehiculo(new vehiculo("LOL232","Honda", "Civic Type R TC", "2015", "Azul", "2500", "Gasolina", "4", 75000, "Aire condicionado, asientos de cuero, turbo, sport"));
//        vehiculos.registrarVehiculo(new vehiculo("KGB846","Toyota", "Camry Hybrid", "2005", "Blanco", "2500", "Gasolina/Electrico", "4", 75000, "Aire condicionado, hibrido, turbo, sport"));
//        vehiculos.registrarVehiculo(new vehiculo("FBI111","Ford", "Expedition", "2022", "Gris", "3500", "Diesel", "7", 90000, "Aire condicionado, asientos de cuero, 4x4, espacioso"));
//        vehiculos.registrarVehiculo(new vehiculo("GGG101","BMW", "i4", "2021", "Negro", "2500", "Electrico", "5", 100000, "Aire condicionado, asientos de cuero, turbo, consumo económico"));
//        
        
//        vehiculos.consultarLista();
//        
//        vehiculos.consultarPlaca("FBI111");
//        
//        vehiculos.modificarVehiculo("FBI111");
//        
//        vehiculos.consultarPlaca("FBI111");
//        
//        Pruebas para funcionlidad de eliminar
//        vehiculos.consultarLista();
//        vehiculos.eliminarVehiculo("KGB846");
//        vehiculos.eliminarVehiculo("FBI111");
//        vehiculos.eliminarVehiculo("GGG101");
//        vehiculos.consultarLista();
        BinaryTreeClientes clientes = new BinaryTreeClientes();
        clientes.insertaPersona(new persona(15,"Luis Carlos Chaves Montero","1992","luiscach@hotmail.com","Oro"));
        clientes.insertaPersona(new persona(68,"María Fernanda Ramirez Aguilar","1998","mfra98@gmail.com","Zafiro"));
        clientes.insertaPersona(new persona(99,"Diana Quesada Sanchez","2000","dianaq@gmail.com","Plata"));
        clientes.insertaPersona(new persona(5,"Alberto Jimenez Campos","2019","aljic2019@hotmail.com","Oro"));
        clientes.insertaPersona(new persona(35,"Juan Daniel Serrano Vega","1900","juandavega@hotmail.com","Plata"));
    }
    
}
