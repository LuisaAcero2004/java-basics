package co.endava.app;

import co.endava.datos.Comida;
import co.endava.datos.Producto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdministradorProductosTest {

    @Test
    public void main() {
        double descuento;
        String nombre;
        nombre = "Pastel";
        descuento = 150.0;
        Comida p3 = new Comida(103, "Pastel", 1500, LocalDate.now());
        //Validación descuento
        assertEquals(descuento,p3.getDescuento());

        //Validación nombre
        assertEquals(nombre,p3.getNombre());


    }

}