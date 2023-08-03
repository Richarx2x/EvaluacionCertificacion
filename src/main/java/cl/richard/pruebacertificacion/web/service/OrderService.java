package cl.richard.pruebacertificacion.web.service;


import cl.richard.pruebacertificacion.model.domain.dto.OrderDTO;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    Optional<List<OrderDTO>> findAll();
    Optional<OrderDTO> findById(int id);
    Optional<OrderDTO> create(OrderDTO orderDTO);
}
