package cl.richard.pruebacertificacion.model.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="detalle_pedido")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDetailEntity {
    @EmbeddedId
    private OrderDetailPK id;

    @ManyToOne
    @MapsId("pedidoId")
    private OrderEntity orderEntity;
    @ManyToOne
    @MapsId("platoId")
    private DishEntity dishEntity;

    @Column(name = "Cantidad")
    private int cantidad;
    @Column(name = "Subtotal")
    private Double subTotal;


/*    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Pedido_ID")
    private int PedidoId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Plato_ID")
    private int platoId;
    */
}
