package test.normal;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

import javarun.CalculoCantidad;
import javarun.Detalle;
import org.junit.jupiter.api.Test;

class CalculoCantidadTest {

    @Test
    void testDescuentoSinDescuento() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 2, 4));
        CalculoCantidad calculoCantidad = new CalculoCantidad();
        double descuento = calculoCantidad.descuento(detalles);
        assertEquals(0.0, descuento, 0.001);
    }

    @Test
    void testDescuentoMiniDescuento() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 7, 4));
        CalculoCantidad calculoCantidad = new CalculoCantidad();
        double descuento = calculoCantidad.descuento(detalles);
        assertEquals(0.03, descuento, 0.001);
    }

    @Test
    void testDescuentoMedioDescuento() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 12, 4));
        CalculoCantidad calculoCantidad = new CalculoCantidad();
        double descuento = calculoCantidad.descuento(detalles);
        assertEquals(0.05, descuento, 0.001);
    }

    @Test
    void testDescuentoGranDescuento() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 20, 4));
        CalculoCantidad calculoCantidad = new CalculoCantidad();
        double descuento = calculoCantidad.descuento(detalles);
        assertEquals(0.3, descuento, 0.001);
    }
}