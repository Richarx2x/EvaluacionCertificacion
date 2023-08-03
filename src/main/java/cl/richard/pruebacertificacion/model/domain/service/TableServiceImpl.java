package cl.richard.pruebacertificacion.model.domain.service;

import cl.richard.pruebacertificacion.model.domain.dto.TableDTO;
import cl.richard.pruebacertificacion.model.persistence.mapping.DishMapper;
import cl.richard.pruebacertificacion.model.persistence.mapping.TableMapper;
import cl.richard.pruebacertificacion.model.persistence.repository.DishRepository;
import cl.richard.pruebacertificacion.model.persistence.repository.TableRepository;
import cl.richard.pruebacertificacion.web.service.TableService;

import java.util.List;
import java.util.Optional;

public class TableServiceImpl implements TableService {

    private final TableRepository repository;
    private final TableMapper mapper;

    public TableServiceImpl(TableRepository repository, TableMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<TableDTO>> findAll() {
        return Optional.of(mapper.toTableDTOs(repository.findAll()));
    }

    @Override
    public Optional<TableDTO> findById(int id) {
        return repository.findById(id).map(mapper::toTableDTO);
    }

    @Override
    public Optional<TableDTO> create(TableDTO tableDTO) {
        return Optional.of(mapper.toTableDTO(repository.save(mapper.toTableEntity(tableDTO))));
    }
}
