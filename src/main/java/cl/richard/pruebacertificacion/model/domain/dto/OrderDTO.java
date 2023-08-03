package cl.richard.pruebacertificacion.model.domain.dto;

import lombok.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderDTO {
    private int id;
    private TableDTO tableDTO;
    private WaiterDTO waiterDTO;
    private int tableId;
    private int weiterId;
    private Date date;
    private Double total;

}
