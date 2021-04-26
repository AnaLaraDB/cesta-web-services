package web.service.cesta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nameMarket;
    private int cnpj;
    private long longitude;
    private long latitude;

    public Market() {
    }

    public Market(long id, String nameMarket, int cnpj, long longitude, long latitude) {
        this.id = id;
        this.nameMarket = nameMarket;
        this.cnpj = cnpj;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return nameMarket;
    }

    public void setName(String name) {
        this.nameMarket = name;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
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
