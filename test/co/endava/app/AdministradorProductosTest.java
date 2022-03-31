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
        descuento = 200.0;
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now());
        assertEquals(descuento,p3.getDescuento());



    }

}