package web.service.cesta.dto;

import web.service.cesta.model.Market;

import java.util.Set;

public class MarketDto {
    private String nameMarket;
    private Set<ProductDto> productDtos;
    private long longitude;
    private long latitude;

    public MarketDto(Market market) {
        this.nameMarket = market.getName();
        this.longitude = market.getLongitude();
        this.latitude = market.getLatitude();
    }


    public String getNameMarket() {
        return nameMarket;
    }

    public void setNameMarket(String nameMarket) {
        this.nameMarket = nameMarket;
    }

    public Set<ProductDto> getProducts() {
        return productDtos;
    }

    public void setProducts(Set<ProductDto> productDtos) {
        this.productDtos = productDtos;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }
}
