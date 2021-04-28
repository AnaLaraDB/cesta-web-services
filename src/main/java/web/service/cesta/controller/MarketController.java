package web.service.cesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.service.cesta.dto.MarketDto;
import web.service.cesta.model.Market;
import web.service.cesta.service.MarketService;

@RestController
@RequestMapping("/mercado")
public class MarketController {

    @Autowired
    MarketService marketService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Market market) {
        try {
            MarketDto marketDto = marketService.create(market);
            return ResponseEntity.status(HttpStatus.CREATED).body(marketDto);
        } catch (ArithmeticException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


}
