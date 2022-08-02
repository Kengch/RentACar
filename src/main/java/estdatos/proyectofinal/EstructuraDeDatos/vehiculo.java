/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package estdatos.proyectofinal.EstructuraDeDatos;

/**
 *
 * @author Luis Chavarria
 */
public class vehiculo {
    //Atributos
    private String placa;
    private String marca;
    private String modelo;
    private String año;
    private String color;
    private String cilindrada;
    private String combustible;
    private String pasajeros;
    private double precioXdia;
    private String extras;
    private String status;
    
    //Método constructor
    public vehiculo (String placa, String marca, String modelo, String año, String color, String cilindrada, String combustible, String pasajeros, double precioXdia, String extras){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.pasajeros = pasajeros;
        this.precioXdia = precioXdia;
        this.extras = extras;
        this.status = "Disponible";
        
    }

    //Getters y Setters de los atributos
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }
 
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }

    public double getPrecioXdia() {
        return precioXdia;
    }

    public void setPrecioXdia(double precioXdia) {
        this.precioXdia = precioXdia;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
