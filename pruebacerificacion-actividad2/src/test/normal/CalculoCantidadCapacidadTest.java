package test.normal;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

import javarun.CalculoCantidadCapacidad;
import javarun.Detalle;
import org.junit.jupiter.api.Test;

class CalculoCantidadCapacidadTest {

    @Test
    void testDescuentoSinDescuento() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 3, 3));
        CalculoCantidadCapacidad calculoCantidadCapacidad = new CalculoCantidadCapacidad();
        double descuento = calculoCantidadCapacidad.descuento(detalles);
        assertEquals(0.0, descuento, 0.001); // sin desc.
    }

    @Test
    void testDescuentoMiniDescuento() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 8, 3));
        CalculoCantidadCapacidad calculoCantidadCapacidad = new CalculoCantidadCapacidad();
        double descuento = calculoCantidadCapacidad.descuento(detalles);
        assertEquals(0.15, descuento, 0.001); // desc. 15%
    }

    @Test
    void testDescuentoMiniDescuento2() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 8, 2));
        CalculoCantidadCapacidad calculoCantidadCapacidad = new CalculoCantidadCapacidad();
        double descuento = calculoCantidadCapacidad.descuento(detalles);
        assertEquals(0.15, descuento, 0.001); // desc. 15%
    }

    @Test
    void testDescuentoMedioDescuento() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 10, 5));
        CalculoCantidadCapacidad calculoCantidadCapacidad = new CalculoCantidadCapacidad();
        double descuento = calculoCantidadCapacidad.descuento(detalles);
        assertEquals(0.2, descuento, 0.001); //desc. 20%
    }

    @Test
    void testDescuentoGranDescuento() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 20, 7));
        CalculoCantidadCapacidad calculoCantidadCapacidad = new CalculoCantidadCapacidad();
        double descuento = calculoCantidadCapacidad.descuento(detalles);
        assertEquals(0.3, descuento, 0.001); // desc. 30%
    }
}