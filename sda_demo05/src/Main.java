import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main5 {
    public static void main (String[] args)
    {

        List<Double> listaJakichsOcen = new ArrayList<>();
        listaJakichsOcen.add(4.5);
        listaJakichsOcen.add(5.0);
        listaJakichsOcen.add(3.5);

        Student s1 = new Student(listaJakichsOcen,12791,"Kamil","Koczkowski");

        // instance of Integer type
        Test <Integer> obj01 = new Test<Integer>(15);
        System.out.println(obj01.getObject());

        // instance of String type
        Test <String> obj02 = new Test<String>("GeeksForGeeks");
        System.out.println(obj02.getObject());

        Test obj03 = new Test();

        System.out.println(obj03.getObject());
        System.out.println(obj03.isNull());
        System.out.println(obj02.isNull());

        Test <Student> obj04 = new Test<Student>(s1);
//        System.out.println(obj04.getObject());

        Test.printObject(obj04);


    }

}
