package cl.richard.pruebacertificacion.model.persistence.mapping;


import cl.richard.pruebacertificacion.model.domain.dto.OrderDTO;
import cl.richard.pruebacertificacion.model.persistence.entity.OrderEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {TableMapper.class, WaiterMapper.class})
public interface OrderMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "tableEntity", target = "tableDTO"),
            @Mapping(source = "waiterEntity", target = "waiterDTO"),
            @Mapping(source = "mesaId", target = "tableId"),
            @Mapping(source = "camareroId", target = "weiterId"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "total", target = "total"),
    })
    OrderDTO toOrderDTO(OrderEntity orderEntity);
    List<OrderDTO> toOrderDTOs(List<OrderEntity> orderEntities);
    @InheritInverseConfiguration
    OrderEntity toOrderEntity(OrderDTO orderDTO);

}
