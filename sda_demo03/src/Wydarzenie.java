import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import static java.util.Calendar.*;

public class Wydarzenie {

    String nazwa;
    MyDate myDate;

    public Wydarzenie(String nazwa, MyDate myDate) {
        this.nazwa = nazwa;
        this.myDate = myDate;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    @Override
    public String toString() {
        return "Wydarzenie{" +
                "nazwa='" + nazwa + '\'' +
                ", myDate=" + myDate +
                '}';
    }

    public void howManyYearsRemain() {
        Date dateNow = createNowDate();
        Date date = createDate();
        System.out.println(getDiffYears(date, dateNow));
    }

    public void howManyDaysRemain() {
        Date dateNow = createNowDate();
        Date date = createDate();
        System.out.println(getDiffDays(date, dateNow));
    }

    public void howManyMonthsRemain() {
        Date dateNow = createNowDate();
        Date date = createDate();
        System.out.println(getDiffDays(date, dateNow)/30);
    }


    public Date createDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            date = dateFormat.parse(myDate.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    public Date createNowDate(){
        Date dateNow = new Date();
        return dateNow;
    }

    public int getDiffYears(Date first, Date last) {
        Calendar a = getCalendar(first);
        Calendar b = getCalendar(last);
        int diff = b.get(YEAR) - a.get(YEAR);
        if (a.get(MONTH) > b.get(MONTH) ||
                (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
            diff--;
        }
        return diff;
    }

    public Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }

    public long getDiffDays(Date first, Date last) {
        long diffInMillies = Math.abs(last.getTime() - first.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return diff;
    }

}
