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

    public OrderDTO(int id, int tableId, int weiterId, Date date, Double total) {
        this.id = id;
        this.tableId = tableId;
        this.weiterId = weiterId;
        this.date = date;
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", tableId=" + tableId +
                ", weiterId=" + weiterId +
                ", date=" + date +
                ", total=" + total +
                '}';
    }
}
