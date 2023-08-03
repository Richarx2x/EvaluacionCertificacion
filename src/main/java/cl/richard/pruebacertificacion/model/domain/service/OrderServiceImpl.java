package cl.richard.pruebacertificacion.model.domain.service;

import cl.richard.pruebacertificacion.model.domain.dto.OrderDTO;
import cl.richard.pruebacertificacion.model.persistence.mapping.DishMapper;
import cl.richard.pruebacertificacion.model.persistence.mapping.OrderMapper;
import cl.richard.pruebacertificacion.model.persistence.repository.DishRepository;
import cl.richard.pruebacertificacion.model.persistence.repository.OrderRepository;
import cl.richard.pruebacertificacion.web.service.OrderService;

import java.util.List;
import java.util.Optional;

public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;
    private final OrderMapper mapper;

    public OrderServiceImpl(OrderRepository repository, OrderMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<OrderDTO>> findAll() {
        return Optional.of(mapper.toOrderDTOs(repository.findAll()));
    }

    @Override
    public Optional<OrderDTO> findById(int id) {
        return repository.findById(id).map(mapper::toOrderDTO);
    }

    @Override
    public Optional<OrderDTO> create(OrderDTO orderDTO) {
        return Optional.of(mapper.toOrderDTO(repository.save(mapper.toOrderEntity(orderDTO))));
    }
}
