/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

/**
 *
 * @author cafajardo
 */
public class Producto { //Declaración de la clase Producto
    
    private int id; //declaración de la variable entero id
    private String nombre; //declaración de la variable string nombre
    private double precio; //declaración de la variable double precio
    public Producto() { // llamado a la función Producto
    }
    
    public Producto(int id, String nombre, double precio) { //declaración de la función Producto
        this.id = id; //asigna al id del objeto, el id enviado en la función
        this.nombre = nombre; //asigna al nombre del objeto, el nombre enviado en la función
        this.precio = precio; //asigna al precio del objeto, el precio enviado en la función
    }
    
    public int getId() {
        return id;
    } //Define la función para retornar el id del objeto

    public void setId(int id) {
        this.id = id;
    } //Define la función para asignar el id del objeto

    public String getNombre() {
        return nombre;
    } //Define la función para retornar el nombre del objeto

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } //Define la función para asignar el nombre del objeto

    public double getPrecio() {
        return precio;
    }//Define la función para retornar el precio del objeto

    public void setPrecio(double precio) { //Función para asignar el precio
        if (precio < 0) { //Si el precio es menor que 0
            System.out.println("No se permiten precios negativos"); //Imprimir en consola que no se permiten precios negativos
        } else { //Si no
            this.precio = precio; //Asignar el precio del objeto
        }
    }
    
    public double getDescuento(){
        return precio * 0.1d;
    } //Define función que devuelve el valor del descuento
    
    @Override
    public String toString() {
        return id + ", " + nombre + ", " + precio;
    } //Función que retorna el id, nombre y precio del producto, separados por coma
}
