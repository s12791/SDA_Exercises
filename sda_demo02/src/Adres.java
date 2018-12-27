public class Adres {
    private String ulica;
    private int nrDomu;
    private String miasto;

    public Adres ( ){};

    public Adres (String ulica, int nrDomu, String miasto){
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public int getNrDomu() {
        return nrDomu;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setNrDomu(int nrDomu) {
        this.nrDomu = nrDomu;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", nrDomu=" + nrDomu +
                ", miasto='" + miasto + '\'' +
                '}';
    }
}


