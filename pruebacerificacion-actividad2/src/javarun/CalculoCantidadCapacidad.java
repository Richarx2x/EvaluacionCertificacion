package javarun;

import java.util.List;

public class CalculoCantidadCapacidad implements CalculoDescuento {

    @Override
    public double descuento(List<Detalle> detalles) {
        int totalPlatos = detalles.stream().mapToInt(detalle -> detalle.cantidad).sum();
        int capacidadMesa = detalles.get(0).capacidadMesa;
        // Se supone que todos los detalles tienen la misma
        // capacidad de mesa ¿?

        if (totalPlatos > 5 && capacidadMesa < 4) {
            return 0.15;
        } else if (totalPlatos >= 5 && totalPlatos <= 15 && capacidadMesa >= 4 && capacidadMesa <= 6) {
            return 0.2;
        } else if (capacidadMesa > 6 && totalPlatos > 15) {
            return 0.3;
        } else if (capacidadMesa == 2 && totalPlatos > 5) {
            return 0.15;
        } else {
            return 0.0;
        }
    }
}
