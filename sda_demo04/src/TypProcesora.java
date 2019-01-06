public enum TypProcesora {

    JEDNORDZENIOWY(1),
    WIELORDZENIOWY(2);

    private int iloscRdzeni;

    TypProcesora(int iloscRdzeni) {
        this.iloscRdzeni = iloscRdzeni;

    }

    public int iloscRdzeni() {
        return iloscRdzeni;
    }
}