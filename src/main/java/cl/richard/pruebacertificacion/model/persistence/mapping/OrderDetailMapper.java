package cl.richard.pruebacertificacion.model.persistence.mapping;

import cl.richard.pruebacertificacion.model.domain.dto.OrderDetailDTO;
import cl.richard.pruebacertificacion.model.persistence.entity.OrderDetailEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DishMapper.class, OrderMapper.class})
public interface OrderDetailMapper {

    @Mappings({
            @Mapping(source = "id.pedidoId", target = "orderId"),
            @Mapping(source = "id.platoId", target = "dishId"),
            @Mapping(source = "orderEntity", target = "orderDTO"),
            @Mapping(source = "dishEntity", target = "dishDTO"),
            @Mapping(source = "cantidad", target = "amount"),
            @Mapping(source = "subTotal", target = "subTotal"),
    })
    OrderDetailDTO toOrderDetailDTO(OrderDetailEntity orderDetailEntity);
    List<OrderDetailDTO> toOrderDetailDTOs(List<OrderDetailEntity> orderDetailEntities);
    @InheritInverseConfiguration
    OrderDetailEntity toOrderDetailEntity(OrderDetailDTO orderDetailDTO);
}