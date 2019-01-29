import java.util.List;

public class Student {

    private List<Double> listaOcen;
    private int numerIndeksu;
    private String imie;
    private String nazwisko;

    public Student(List<Double> listaOcen, int numerIndeksu, String imie, String nazwisko) {
        this.listaOcen = listaOcen;
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student() {
    }

    public List<Double> getListaOcen() {
        return listaOcen;
    }

    public void setListaOcen(List<Double> listaOcen) {
        this.listaOcen = listaOcen;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(int numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Student{" +
                "listaOcen=" + listaOcen +
                ", numerIndeksu=" + numerIndeksu +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
