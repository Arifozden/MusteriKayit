package oslomet.musteri;

public class Musteri {
    private String isim;
    private String adres;

    public Musteri(String isim, String adres) {
        this.isim = isim;
        this.adres = adres;
    }

    public Musteri(){}

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
