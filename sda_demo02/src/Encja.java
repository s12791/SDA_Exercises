public class Encja {
    private Adres adres;

    public Encja(Adres adres) {
        this.adres = adres;
    }

    public Encja() {
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Encja{" +
                "adres=" + adres +
                '}';
    }
}
