package cl.richard.pruebacertificacion.model.persistence.repository;

import cl.richard.pruebacertificacion.model.persistence.entity.WaiterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaiterRepository extends JpaRepository<WaiterEntity, Integer> {
}
