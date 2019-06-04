import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args)
    {

        Data data01 = new Data(1);
        Data data02 = new Data(1.84);
        Data data03 = new Data("fdsfdsf");

        List<Data> myList = new ArrayList<Data>();
        myList.add(data01);
        myList.add(data02);
        myList.add(data03);

        System.out.println(myList.toString());

    }
}
