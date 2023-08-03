package cl.richard.pruebacertificacion.web.service;

import cl.richard.pruebacertificacion.model.domain.dto.TableDTO;

import java.util.List;
import java.util.Optional;
public interface TableService {

    Optional<List<TableDTO>> findAll();
    Optional<TableDTO> findById(int id);
    Optional<TableDTO> create(TableDTO tableDTO);
}
