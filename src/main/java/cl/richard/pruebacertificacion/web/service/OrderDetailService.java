package cl.richard.pruebacertificacion.web.service;

import cl.richard.pruebacertificacion.model.domain.dto.OrderDetailDTO;

import java.util.List;
import java.util.Optional;

public interface OrderDetailService {
    Optional<List<OrderDetailDTO>> findAll();
    Optional<OrderDetailDTO> findById(int id);
    Optional<OrderDetailDTO> create(OrderDetailDTO orderDetailDTO);

}
