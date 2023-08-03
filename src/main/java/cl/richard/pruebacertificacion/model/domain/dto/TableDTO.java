package cl.richard.pruebacertificacion.model.domain.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TableDTO {
    private int id;
    private int number;
    private int capacity;
    private String location;

}
