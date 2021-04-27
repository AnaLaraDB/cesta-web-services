package web.service.cesta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.service.cesta.dto.ProductDto;
import web.service.cesta.model.Product;
import web.service.cesta.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ProductDto create(Product product) {
        Product newProduct = productRepository.save(product);
        return new ProductDto(newProduct);
    }
}
