package cl.richard.pruebacertificacion.model.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name="pedido")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Mesa_ID", insertable = false, updatable = false)
    private TableEntity tableEntity;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Camarero_ID", insertable = false, updatable = false)
    private WaiterEntity waiterEntity;

    @Column(name = "Mesa_ID")
    private int mesaId;
    @Column(name = "Camarero_ID")
    private int camareroId;
    @Column(name = "Fecha")
    private Date fecha;
    @Column(name = "Total")
    private Double total;

}