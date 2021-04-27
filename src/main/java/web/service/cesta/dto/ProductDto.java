package web.service.cesta.dto;

public class ProductDto {
    private String name;
    private long valor;

    public ProductDto(String name, long valor) {
        this.name = name;
        this.valor = valor;
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
