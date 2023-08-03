package cl.richard.pruebacertificacion.model.persistence.repository;

import cl.richard.pruebacertificacion.model.persistence.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <OrderEntity, Integer> {

}
