package cl.richard.pruebacertificacion.model.domain.service;

import cl.richard.pruebacertificacion.model.domain.dto.WaiterDTO;
import cl.richard.pruebacertificacion.model.persistence.mapping.WaiterMapper;
import cl.richard.pruebacertificacion.model.persistence.repository.WaiterRepository;
import cl.richard.pruebacertificacion.web.service.WaiterService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WaiterServiceImpl implements WaiterService {

    private final WaiterRepository repository;
    private final WaiterMapper mapper;

    public WaiterServiceImpl(WaiterRepository repository, WaiterMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<WaiterDTO>> findAll() {
        return Optional.of(mapper.toWaiterDTOs(repository.findAll()));
    }

    @Override
    public Optional<WaiterDTO> findById(int id) {
        return repository.findById(id).map(mapper::toWaiterDTO);
    }

    @Override
    public Optional<WaiterDTO> create(WaiterDTO waiterDTO) {
        return Optional.of(mapper.toWaiterDTO(repository.save(mapper.toWaiterEntity(waiterDTO))));
    }

/*    @Override
    public Optional<List<Training>> findAll() {
        return Optional.of(mapper.toTrainings(repository.findAll()));
    }
    @Override
    public Optional<Training> create(Training training){
        return Optional.of(mapper.toTraining(repository.save(mapper.toCapacitacion(training))));
    }
    @Override
    public Optional<Training> findById(int id) {
        return repository.findById(id).map(mapper::toTraining);*/
}

