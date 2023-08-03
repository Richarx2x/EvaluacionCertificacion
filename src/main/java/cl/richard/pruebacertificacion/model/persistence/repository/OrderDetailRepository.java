package cl.richard.pruebacertificacion.model.persistence.repository;

import cl.richard.pruebacertificacion.model.persistence.entity.OrderDetailEntity;
import cl.richard.pruebacertificacion.model.persistence.entity.OrderDetailPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository <OrderDetailEntity, OrderDetailPK> {
}
