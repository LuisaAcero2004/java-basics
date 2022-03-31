/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

import java.time.LocalTime;

/**
 *
 * @author cafajardo
 */
public class Bebida extends Producto { //Extiende la clase producto
    
    public Bebida(int id, String nombre, double precio){ //Definición de la función Bebida
        super(id, nombre, precio);//Se invoca la clase superior (Producto)
    }
    
    @Override
    public double getDescuento() { //Función para obtener el valor del descuento
        LocalTime now = LocalTime.now(); //Se asigna a la varible now el valor de la hora de este momento
        if (now.isAfter(LocalTime.of(17, 0)) && now.isBefore(LocalTime.of(18, 0))) { //Si el valor de la variable now  es después de las 17:00 y antes de 18:00
            return this.getPrecio() * 0.2d; //retornar el valor de la función getPrecio()*0.2
        } else { //si no
            return 0; //retornar 0
        }
    }
}
