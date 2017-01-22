package ts.house;


import ts.human.President;
import ts.outside.Developmentalcenter;
import ts.outside.Parking;
import ts.outside.Playground;
import ts.outside.Shop;

import java.util.List;

/**
 * Created by Алексей on 23.09.2016.
 */
public class House
{
    private String address;
    private President president;
    Shop shop;
    Playground playground;
    Parking parking;
    Developmentalcenter developmentalcenter;
    List<Flat> flats;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public President getPresident() {
        return president;
    }

    public void setPresident(President president) {
        this.president = president;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Playground getPlayground() {
        return playground;
    }

    public void setPlayground(Playground playground) {
        this.playground = playground;
    }

    public Parking getParking() {
        return parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }

    public Developmentalcenter getDevelopmentalcenter() {
        return developmentalcenter;
    }

    public void setDevelopmentalcenter(Developmentalcenter developmentalcenter) {
        this.developmentalcenter = developmentalcenter;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }

    @Override
    public String toString() {
        return "House{address='" + address + "'}";
    }
}
