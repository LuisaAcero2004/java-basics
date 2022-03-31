/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

import java.time.LocalDate;

/**
 *
 * @author cafajardo
 */
public class Comida extends Producto { //Extiende la clase Producto
    private LocalDate fechaVencimiento; //Se declara la variable fechaVencimiento

    public Comida(int id, String nombre, double precio, LocalDate fechaVencimiento) {//Definición de la función Comida
        super(id, nombre, precio); //Se invoca la clase superior (Producto)
        this.fechaVencimiento = fechaVencimiento; //Se asigna a la fecha de vecimiento del objeto, el valor de fecha de vencimiento
    }
    
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    } //Función que retorna el valor de la fecha de vencimiento

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }//Función que asigna el valor de la fecha de vencimiento

    @Override
    public double getDescuento() { //Función que obtiene el valor del descuento
        if (fechaVencimiento.equals(LocalDate.now())) { //Si la fecha de vencimiento es igual a la fecha de este momento
            return super.getDescuento(); //retornar el valor que se obtiene de llamar a función getDescuento() de la clase superior
        } 
        else { //Si no
            return 0; //Retornar 0
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " + fechaVencimiento;
    } //función que retorna el valor de llamar la función toString() de la clase superior y la fecha de vencimiento, separado por coma
}
