package web.service.cesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.service.cesta.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
