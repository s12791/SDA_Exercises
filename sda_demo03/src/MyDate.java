public class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void wyswietlDateA() {
        System.out.println(day + "." + month + "." + year);
    }

    public void wyswietlDateB() {
        if (day > 9) {
            System.out.println(day + "." + month + "." + year);
        } else {
            System.out.println("0" + day + "." + month + "." + year);
        }
    }

    public void wyswietlDateC() {

        String monthWord = "";

        if (month == 1) {
            monthWord = "sty";
        } else if (month == 2) {
            monthWord = "lut";
        } else if (month == 3) {
            monthWord = "mar";
        } else if (month == 4) {
            monthWord = "kwi";
        } else if (month == 5) {
            monthWord = "maj";
        } else if (month == 6) {
            monthWord = "cze";
        } else if (month == 7) {
            monthWord = "lip";
        } else if (month == 8) {
            monthWord = "sie";
        } else if (month == 9) {
            monthWord = "wrz";
        } else if (month == 10) {
            monthWord = "paz";
        } else if (month == 11) {
            monthWord = "lis";
        } else if (month == 12) {
            monthWord = "gru";
        } else monthWord = "???";

        System.out.println(day + " " + monthWord + " " + year);

    }

    @Override
    public String toString() {
        return year +"-" + month +"-" + day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}