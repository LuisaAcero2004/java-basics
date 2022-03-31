package co.endava.app;

import co.endava.datos.Comida;
import co.endava.datos.Producto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.lang.Math;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdministradorProductosTest {

    @Test
    public void main() {
        double descuento;
        String nombre;
        int id;
        nombre = "Pastel";
        id = 103;
        //1500 -> 100
        //? -> 10
        // 10*1500/100
        descuento = 1500 * (10.0/100.0);
        Comida p3 = new Comida(103, "Pastel", 1500, LocalDate.now());

        //Validación descuento
        assertEquals(descuento,p3.getDescuento());

        //Validación nombre
        assertEquals(nombre,p3.getNombre());

        //Validación id
        assertEquals(id,p3.getId());

        id = 108;
        p3.setId(id);

        //Validación set id
        assertEquals(id,p3.getId());


    }

}