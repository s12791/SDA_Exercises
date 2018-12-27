public class Firma extends Encja implements PosiadaNazwe, PosiadaAdres{
    private String nazwa;
    private Adres adres;

    public Firma() {
    }

    public Firma(String nazwa, Adres adres) {
        this.nazwa = nazwa;
        this.adres = adres;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "nazwa='" + nazwa + '\'' +
                ", adres=" + adres +
                '}';
    }
}
