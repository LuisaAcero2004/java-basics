package co.endava.app;

import co.endava.datos.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {

    @Test
    public void main() {
        String nombre;
        nombre = "Café";
        Producto p1 = new Producto(101,"Café",15000);
        assertEquals(nombre,p1.getNombre());
    }
}