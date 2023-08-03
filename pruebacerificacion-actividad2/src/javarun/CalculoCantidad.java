package javarun;

import java.util.List;
public class CalculoCantidad implements CalculoDescuento {

    @Override
    public double descuento(List<Detalle> detalles) {
        int totalPlatos = detalles.stream().mapToInt(detalle -> detalle.cantidad).sum();

        if (totalPlatos <= 5) {
            return 0.0;
        } else if (totalPlatos < 10) {
            return 0.03;
        } else if (totalPlatos <= 15) {
            return 0.05;
        } else {
            return 0.3;
        }
    }
}
