package test.border;


import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

import javarun.CalculoCantidad;
import javarun.Detalle;
import org.junit.jupiter.api.Test;

class CalculoCantidadTestBorder {

    @Test
    void testDescuentoSinDescuento() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 0, 4));
        CalculoCantidad calculoCantidad = new CalculoCantidad();
        double descuento = calculoCantidad.descuento(detalles);
        assertEquals(0.0, descuento, 0.001);
    }

    @Test
    void testDescuentoBordeMinimo() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 5, 4));
        CalculoCantidad calculoCantidad = new CalculoCantidad();
        double descuento = calculoCantidad.descuento(detalles);
        assertEquals(0.0, descuento, 0.001);
    }

    @Test
    void testDescuentoBordePequeno() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 9, 4));
        CalculoCantidad calculoCantidad = new CalculoCantidad();
        double descuento = calculoCantidad.descuento(detalles);
        assertEquals(0.03, descuento, 0.001);
    }

    @Test
    void testDescuentoBordeMediano() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 10, 4));
        CalculoCantidad calculoCantidad = new CalculoCantidad();
        double descuento = calculoCantidad.descuento(detalles);
        assertEquals(0.05, descuento, 0.001);
    }

    @Test
    void testDescuentoBordeGrande() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 15, 4));
        CalculoCantidad calculoCantidad = new CalculoCantidad();
        double descuento = calculoCantidad.descuento(detalles);
        assertEquals(0.05, descuento, 0.001);
    }

    @Test
    void testDescuentoBordeMaximo() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 100, 4));
        CalculoCantidad calculoCantidad = new CalculoCantidad();
        double descuento = calculoCantidad.descuento(detalles);
        assertEquals(0.3, descuento, 0.001);
    }
}