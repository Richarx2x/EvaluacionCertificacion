package cl.richard.pruebacertificacion.web.service;

import cl.richard.pruebacertificacion.model.domain.dto.DishDTO;

import java.util.List;
import java.util.Optional;

public interface DishService {
    Optional<List<DishDTO>> findAll();
    Optional<DishDTO> findById(int id);
    Optional<DishDTO> create(DishDTO dishDTO);
    Optional<DishDTO> update(DishDTO dishDTO);
    boolean delete(int id);
}