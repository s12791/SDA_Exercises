public class SprawdzaAdres {

    public String czyGdansk(Encja encja) {

        if (encja.getAdres().getMiasto().equals("Gdansk")) {

            if (encja instanceof Osoba) {
                return "osoba z Gdansk";
            } else return "firma z Gdansk";

        }
        else return "Nie z Gdanska";
    }
}