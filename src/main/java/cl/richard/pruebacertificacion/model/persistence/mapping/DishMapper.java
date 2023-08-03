package cl.richard.pruebacertificacion.model.persistence.mapping;

import cl.richard.pruebacertificacion.model.domain.dto.DishDTO;
import cl.richard.pruebacertificacion.model.persistence.entity.DishEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DishMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "categoria", target = "category"),
    })
    DishDTO toDishDTO(DishEntity dishEntity);
    List<DishDTO> toDishDTOs(List<DishEntity> dishEntities);
    @InheritInverseConfiguration
    DishEntity toDishEntity(DishDTO dishDTO);
}