/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.app;

import co.endava.datos.Bebida;
import co.endava.datos.Comida;
import co.endava.datos.Producto;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author dsanchez
 */
public class AdministradorProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto p1 = new Producto(101, "Café", 1500); // Creación del objeto Producto p1
        Producto p2 = new Producto(102, "Azucar", 2500); //Creación del objeto Producto p2
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now().plusDays(2)); //Creación del objeto Comida
        Producto p4 = new Bebida(104, "Té", 1800); //Creación del objeto Bebida
        
        System.out.println(p1.getPrecio()); //Imprimir en consola el precio del producto p1
        System.out.println(p2.getPrecio()); //Imprimir en consola el precio del producto p2
        System.out.println("Fecha: "+ p3.getFechaVencimiento() +  ", Precio: "+ p3.getPrecio() + ", Dcto: " + p3.getDescuento()); //Imprimir en consola la fecha vencimiento, el precio y el descuento del objeto comida p3
        System.out.println("Precio: "+ p4.getPrecio() + ", Dcto: " + p4.getDescuento()); //Imprimir en consola el precio y descuento del
        
        Producto p5 = new Producto(105, "Agua", 1800); // Creación del objeto Producto p5
        if (p5 == null) { //Si p5 está vacío (null)
            System.out.println("El objeto está nulo"); //Imprimir en consola "El objeto está nulo"
        } else { //si no
            if (p5.getNombre() == null) { //Si el nombre de p5 está vacío
                System.out.println("El nombre está nulo");//Imprimir en consola "El nombre está nulo"
            } else { //si no
                System.out.println(p5.getNombre()); //Imprimir en consola el nombre del objeto p5
            }
        }
        BigDecimal numero = BigDecimal.ZERO; //Declara y asigna a la varible BidDecimal numero, el valor de 0

        try { //Intentar
            numero = BigDecimal.valueOf(Long.parseLong("140")); //Asignar el valor long 140 a la variable número
        } catch (Exception e){ //Manejar la excepción
            numero = BigDecimal.ONE; //Asignar a la variable numero el valor de 1
            System.out.println("No se pudo convertir " + e); //Imprimir que no se pudo convertir y la excepción
        }
        System.out.println(numero); //Imprimir en consola el valor en la variable numero
    }
    
}
