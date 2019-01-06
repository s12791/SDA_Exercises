public class Komputer {

    private int potrzebnaMoc;
    private String producent;
    private TypProcesora typ;

    public Komputer(int potrzebnaMoc, String producent, TypProcesora typ) {
        this.potrzebnaMoc = potrzebnaMoc;
        this.producent = producent;
        this.typ = typ;
    }

    public Komputer() {
    }

    public int getPotrzebnaMoc() {
        return potrzebnaMoc;
    }

    public void setPotrzebnaMoc(int potrzebnaMoc) {
        this.potrzebnaMoc = potrzebnaMoc;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public TypProcesora getTyp() {
        return typ;
    }

    public void setTyp(TypProcesora typ) {
        this.typ = typ;
    }

}
