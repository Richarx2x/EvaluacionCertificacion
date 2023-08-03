package cl.richard.pruebacertificacion.model.persistence.repository;

import cl.richard.pruebacertificacion.model.persistence.entity.DishEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository <DishEntity, Integer> {
}
