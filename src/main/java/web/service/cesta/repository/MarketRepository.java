package web.service.cesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.service.cesta.model.Market;

public interface MarketRepository extends JpaRepository<Market, Long> {
}
