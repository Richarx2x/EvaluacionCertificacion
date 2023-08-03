package cl.richard.pruebacertificacion.model.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderDetailPK implements Serializable {
    @Column(name="Pedido_ID")
    private Integer pedidoId;
    @Column(name = "Plato_ID")
    private Integer platoId;
}
