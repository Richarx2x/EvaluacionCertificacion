package cl.richard.pruebacertificacion.model.domain.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderDetailDTO {
    private DishDTO dishDTO;
    private OrderDTO orderDTO;
    private int orderId;
    private int dishId;
    private int amount;
    private Double subTotal;

}
