public class Main3 {

    public static void main(String[] args) {

        Komputer pierwszyKomp = new Komputer(3500,"Asus",TypProcesora.JEDNORDZENIOWY);
        Komputer drugiKomp = new Komputer(4500,"Apple",TypProcesora.WIELORDZENIOWY);

        System.out.println("moj pierwszy komp ma "+pierwszyKomp.getTyp().iloscRdzeni()+"");
        System.out.println("moj drugi komp ma "+drugiKomp.getTyp().iloscRdzeni()+"");

    }

}
