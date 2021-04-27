package web.service.cesta.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Set<ProductMarket> productMarket;
    private String nameProduct;

    public Product() {
    }

    public Product(long id, String nameProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
    }

}
