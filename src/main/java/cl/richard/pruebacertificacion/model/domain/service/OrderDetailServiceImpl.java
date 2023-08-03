package cl.richard.pruebacertificacion.model.domain.service;

import cl.richard.pruebacertificacion.model.domain.dto.OrderDetailDTO;
import cl.richard.pruebacertificacion.model.persistence.mapping.OrderDetailMapper;
import cl.richard.pruebacertificacion.model.persistence.repository.OrderDetailRepository;
import cl.richard.pruebacertificacion.web.service.OrderDetailService;

import java.util.List;
import java.util.Optional;

public class OrderDetailServiceImpl implements OrderDetailService {
    private final OrderDetailRepository repository;
    private final OrderDetailMapper mapper;

    public OrderDetailServiceImpl(OrderDetailRepository repository, OrderDetailMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<OrderDetailDTO>> findAll() {
        return Optional.of(mapper.toOrderDetailDTOs(repository.findAll()));
    }

    @Override
    public Optional<OrderDetailDTO> findById(int id) {
        return null;
    }

    @Override
    public Optional<OrderDetailDTO> create(OrderDetailDTO orderDetailDTO) {
        return Optional.of(mapper.toOrderDetailDTO(repository.save(mapper.toOrderDetailEntity(orderDetailDTO))));
    }
}
