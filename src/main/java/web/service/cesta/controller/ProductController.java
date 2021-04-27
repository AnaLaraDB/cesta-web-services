package web.service.cesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.service.cesta.dto.MarketDto;
import web.service.cesta.dto.ProductDto;
import web.service.cesta.model.Market;
import web.service.cesta.model.Product;
import web.service.cesta.service.ProductService;

@RestController
@RequestMapping("/produto")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Product product) {
        try {
            ProductDto productDto = productService.create(product);
            return ResponseEntity.status(HttpStatus.CREATED).body(productDto);
        } catch (ArithmeticException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

}
