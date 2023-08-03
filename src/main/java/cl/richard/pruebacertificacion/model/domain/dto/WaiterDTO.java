package cl.richard.pruebacertificacion.model.domain.dto;

import lombok.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class WaiterDTO {
    private int id;
    private String name;
    private int age;
    private Date startDate;
}
