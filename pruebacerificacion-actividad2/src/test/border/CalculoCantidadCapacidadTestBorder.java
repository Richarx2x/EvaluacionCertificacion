package test.border;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import javarun.CalculoCantidadCapacidad;
import javarun.Detalle;
import org.junit.jupiter.api.Test;

class CalculoCantidadCapacidadTestBorder {

    // algunos ejemplos de test en borde
    // @TODO: corregir/revisar esto

    @Test
    void testDescuentoSinDescuento() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 0, 4));
        CalculoCantidadCapacidad calculoCantidadCapacidad = new CalculoCantidadCapacidad();
        double descuento = calculoCantidadCapacidad.descuento(detalles);
        assertEquals(0.0, descuento, 0.001);
    }

    @Test
    void testDescuentoBordeMinimo() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 5, 1));
        CalculoCantidadCapacidad calculoCantidadCapacidad = new CalculoCantidadCapacidad();
        double descuento = calculoCantidadCapacidad.descuento(detalles);
        assertEquals(0.0, descuento, 0.001);
    }

    @Test
    void testDescuentoBordePequeno() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 8, 2));
        CalculoCantidadCapacidad calculoCantidadCapacidad = new CalculoCantidadCapacidad();
        double descuento = calculoCantidadCapacidad.descuento(detalles);
        assertEquals(0.15, descuento, 0.001);
    }

    @Test
    void testDescuentoBordeMediano() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 15, 4));
        CalculoCantidadCapacidad calculoCantidadCapacidad = new CalculoCantidadCapacidad();
        double descuento = calculoCantidadCapacidad.descuento(detalles);
        assertEquals(0.2, descuento, 0.001);
    }

    @Test
    void testDescuentoBordeGrande() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 15, 6));
        CalculoCantidadCapacidad calculoCantidadCapacidad = new CalculoCantidadCapacidad();
        double descuento = calculoCantidadCapacidad.descuento(detalles);
        assertEquals(0.2, descuento, 0.001);
    }

    @Test
    void testDescuentoBordeMaximo() {
        List<Detalle> detalles = Arrays.asList(new Detalle("Verduras cocidas", 100, 10));
        CalculoCantidadCapacidad calculoCantidadCapacidad = new CalculoCantidadCapacidad();
        double descuento = calculoCantidadCapacidad.descuento(detalles);
        assertEquals(0.3, descuento, 0.001);
    }
}