package cl.richard.pruebacertificacion.model.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="mesa")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "Numero")
    private int numero;
    @Column(name = "Capacidad")
    private int capacidad;
    @Column(name = "Ubicacion")
    private String ubicacion;
}
