package web.service.cesta.dto;

import web.service.cesta.model.Product;

public class ProductDto {
    private String name;
    private long valor;

    public ProductDto(Product product) {
        this.name = product.getNameProduct();
//        this.valor = product.;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }
}
