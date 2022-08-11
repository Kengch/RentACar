/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EstructuraDeClientes;

/**
 *
 * @author Luis Chavarria
 */
public class persona {
    private int cedula;
    private String nombre;
    private String nacimiento;
    private String correo;
    private String categoria;
    
    public persona(int cedula, String nombre, String nacimiento, String correo, String categoria){
        this.cedula = cedula;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.correo= correo;
        this.categoria = categoria;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
