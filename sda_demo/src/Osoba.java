public class Osoba {

    private String imie;
    private int rokUrodzenia;
    private String sex;

    public Osoba() {
        imie = "Anonim";
        rokUrodzenia = 0;
        sex = "N/A";
    }

    public String getImie() {
        return imie;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public String getSex() {
        return sex;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void przedstawSie() {

        System.out.println("mam na imie " + imie + " ,rok urodzenia " + rokUrodzenia + " moja plec to " + sex + "");
    }

    public boolean czyKobieta(String sex) {
        if (sex.equals("W")) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                ", sex='" + sex + '\'' +
                '}';
    }

}
