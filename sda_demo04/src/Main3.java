import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        Komputer pierwszyKomp = new Komputer(3500,"Asus",TypProcesora.JEDNORDZENIOWY);
        Komputer drugiKomp = new Komputer(4500,"Apple",TypProcesora.WIELORDZENIOWY);

        System.out.println("moj pierwszy komp ma "+pierwszyKomp.getTyp().iloscRdzeni()+"");
        System.out.println("moj drugi komp ma "+drugiKomp.getTyp().iloscRdzeni()+"");

        List<Double> listaJakichsOcen = new ArrayList<>();
        listaJakichsOcen.add(4.5);
        listaJakichsOcen.add(5.0);
        listaJakichsOcen.add(3.5);

        Student s1 = new Student(listaJakichsOcen,12791,"Kamil","Koczkowski");

        System.out.println(s1);

    }

}
