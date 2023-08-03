package cl.richard.pruebacertificacion.model.persistence.mapping;

import cl.richard.pruebacertificacion.model.domain.dto.DishDTO;
import cl.richard.pruebacertificacion.model.domain.dto.TableDTO;
import cl.richard.pruebacertificacion.model.persistence.entity.DishEntity;
import cl.richard.pruebacertificacion.model.persistence.entity.TableEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TableMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "numero", target = "number"),
            @Mapping(source = "capacidad", target = "capacity"),
            @Mapping(source = "ubicacion", target = "location"),
    })
    TableDTO toTableDTO(TableEntity tableEntity);
    List<TableDTO> toTableDTOs(List<TableEntity> tableEntities);
    @InheritInverseConfiguration
    TableEntity toTableEntity(TableDTO tableDTO);
}