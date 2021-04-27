package web.service.cesta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.service.cesta.dto.MarketDto;
import web.service.cesta.model.Market;
import web.service.cesta.repository.MarketRepository;

import java.util.ArrayList;

@Service
public class MarketService {
    @Autowired
    MarketRepository marketRepository;

//    //list by product name
//    public ArrayList<MarketDto>listByProductName() {
//        return null;
//    }

    public MarketDto createMarket(Market market) {
        Market newMarket = marketRepository.save(market);
        return new MarketDto(newMarket);
    }

}
