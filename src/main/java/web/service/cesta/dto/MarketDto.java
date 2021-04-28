package web.service.cesta.dto;

import web.service.cesta.model.Market;

import java.util.Set;

public class MarketDto {
    private String name;
    private Set<ProductDto> productDto;
    private double longitude;
    private double latitude;

    public MarketDto(Market market) {
        this.name = market.getNameMarket();
        this.longitude = market.getLongitude();
        this.latitude = market.getLatitude();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ProductDto> getProducts() {
        return productDto;
    }

    public void setProducts(Set<ProductDto> productDtos) {
        this.productDto = productDtos;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
