package cl.richard.pruebacertificacion.model.persistence.repository;

import cl.richard.pruebacertificacion.model.persistence.entity.DishEntity;
import cl.richard.pruebacertificacion.model.persistence.entity.TableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository <TableEntity, Integer> {
}
