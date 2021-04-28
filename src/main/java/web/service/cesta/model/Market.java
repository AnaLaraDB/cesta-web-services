package web.service.cesta.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_market")
    private long id;
    @OneToMany(mappedBy = "product")
    private Set<ProductMarket> productMarket;
    private String nameMarket;
    private int cnpj;
    private double longitude;
    private double latitude;


    public Market() {
    }

    public Market(String nameMarket, int cnpj, long longitude, long latitude) {
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

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNameMarket() {
        return nameMarket;
    }

    public void setNameMarket(String nameMarket) {
        this.nameMarket = nameMarket;
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
