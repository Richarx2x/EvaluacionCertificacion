package cl.richard.pruebacertificacion.web.service;

import cl.richard.pruebacertificacion.model.domain.dto.WaiterDTO;

import java.util.List;
import java.util.Optional;

public interface WaiterService {
    Optional<List<WaiterDTO>> findAll();
    Optional<WaiterDTO> findById(int id);
    Optional<WaiterDTO> create(WaiterDTO waiterDTO);

}
