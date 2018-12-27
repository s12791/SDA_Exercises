public class Main {

    public static void main(String[] args) {

        String[] tablicaImion = new String[]{"Marek", "Zdenek", "Zdzichu", "Kazik", "Rysio", "Ala", "Roksana", "Monika", "Dobrawa", "Wladyslawa"};
        int[] tablicaWiek = new int[]{23, 34, 33, 28, 22, 15, 17, 29, 39, 55};
        String[] tablicaSex = new String[]{"M", "M", "M", "M", "M", "W", "W", "W", "W", "W"};

        for (int i = 0; i < tablicaImion.length; i++) {
            Osoba osoba = new Osoba();
            osoba.setImie(tablicaImion[i]);
            int rand = (int) (Math.random() * tablicaImion.length);

            osoba.setRokUrodzenia(tablicaWiek[rand]);
            osoba.setSex(tablicaSex[i]);

            if (osoba.czyKobieta(osoba.getSex())) {
                osoba.przedstawSie();
            }

        }
    }
}
