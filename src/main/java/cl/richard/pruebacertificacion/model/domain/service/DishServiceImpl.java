package cl.richard.pruebacertificacion.model.domain.service;

import cl.richard.pruebacertificacion.model.domain.dto.DishDTO;
import cl.richard.pruebacertificacion.model.persistence.mapping.DishMapper;
import cl.richard.pruebacertificacion.model.persistence.repository.DishRepository;
import cl.richard.pruebacertificacion.web.service.DishService;


import java.util.List;
import java.util.Optional;

public class DishServiceImpl implements DishService {

    private final DishRepository repository;
    private final DishMapper mapper;

    public DishServiceImpl(DishRepository repository, DishMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<DishDTO>> findAll() {
        return Optional.of(mapper.toDishDTOs(repository.findAll()));
    }

    @Override
    public Optional<DishDTO> findById(int id) {
        return repository.findById(id).map(mapper::toDishDTO);
    }

    @Override
    public Optional<DishDTO> create(DishDTO dishDTO) {
        return Optional.of(mapper.toDishDTO(repository.save(mapper.toDishEntity(dishDTO))));
    }
}