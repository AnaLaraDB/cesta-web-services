package web.service.cesta.dto;

import java.util.Set;

public class Market {
    private String nameMarket;
    private Set<Product> products;
    private long longitude;
    private long latitude;

    public Market(String nameMarket, Set<Product> products, long longitude, long latitude) {
        this.nameMarket = nameMarket;
        this.products = products;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getNameMarket() {
        return nameMarket;
    }

    public void setNameMarket(String nameMarket) {
        this.nameMarket = nameMarket;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
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
