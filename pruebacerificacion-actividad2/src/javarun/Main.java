package javarun;

import java.util.List;
public class Main {

    public static void main(String[] args) {
        // PRUEBAS:
        Detalle detalle1 = new Detalle("Verduras cocidas", 4, 3);
        Detalle detalle2 = new Detalle("Arroz con pollo", 8, 5);
        Detalle detalle3 = new Detalle("Espinacas", 12, 7);

        // Creamos lista de detalles
        List<Detalle> detalles = List.of(detalle1, detalle2, detalle3);

        // Creamos instancias de los calculadores de descuento
        CalculoDescuento calculoCantidad = new CalculoCantidad();
        CalculoDescuento calculoCantidadCapacidad = new CalculoCantidadCapacidad();

        // Calculamos y mostramos los descuentos por la consola
        double descuentoCantidad = calculoCantidad.descuento(detalles);
        double descuentoCantidadCapacidad = calculoCantidadCapacidad.descuento(detalles);
        System.out.println("Descuento por cantidad de platos: " + (descuentoCantidad * 100) + "%");
        System.out.println("Descuento por cantidad de platos y capacidad de mesa: " +
                (descuentoCantidadCapacidad * 100) + "%");
    }

}