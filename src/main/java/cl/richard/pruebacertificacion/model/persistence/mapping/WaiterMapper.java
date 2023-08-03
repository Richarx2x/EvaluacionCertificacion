package cl.richard.pruebacertificacion.model.persistence.mapping;

import cl.richard.pruebacertificacion.model.domain.dto.WaiterDTO;
import cl.richard.pruebacertificacion.model.persistence.entity.WaiterEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WaiterMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "edad", target = "age"),
            @Mapping(source = "fechaInicio", target = "startDate"),
    })
    WaiterDTO toWaiterDTO(WaiterEntity waiterEntity);
    List<WaiterDTO> toWaiterDTOs(List<WaiterEntity> waiterEntities);
    @InheritInverseConfiguration
    WaiterEntity toWaiterEntity(WaiterDTO waiterDTO);
}