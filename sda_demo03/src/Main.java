public class Main {

    public static void main(String [] args){

        String string = "kamilos";

        LastLetterGetter lastLetterGetter02 = new LastLetterGetter();
        System.out.println(lastLetterGetter02.getLastLetter(string));

        MyDate myDate = new MyDate(5,12,2019);

        myDate.wyswietlDateA();

        Wydarzenie wydarzenie = new Wydarzenie("wydarzenie 01",myDate);

        System.out.println(wydarzenie.getNazwa());
        System.out.println(wydarzenie.getMyDate().toString());
        System.out.println("------------");

        wydarzenie.howManyYearsRemain();

        wydarzenie.howManyDaysRemain();

        wydarzenie.howManyMonthsRemain();

    }
}
