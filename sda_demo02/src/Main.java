public class Main {

    public static void main(String [] args){

        Adres a1 = new Adres("polna",25,"Gdansk");
        Adres a2 = new Adres("wolna",25,"Gdansk");
        Adres a3 = new Adres("szkolna",26,"Sopot");
        Adres a4 = new Adres("namolna",37,"Sopot");

        Osoba o1 = new Osoba("Stefan","Cebula",a1);
        Firma f1 = new Firma("Cebulex",a2);
        Osoba o2 = new Osoba("Marian","Burak",a3);
        Firma f2 = new Firma("Buraczekx",a4);


        System.out.println(o1.getAdres());
        System.out.println(o1.getImie());
        System.out.println(f1.getAdres());
        System.out.println(f1.getNazwa());

        SprawdzaAdres spr = new SprawdzaAdres();
        System.out.println(spr.czyGdansk(o1));
        System.out.println(spr.czyGdansk(f1));
        System.out.println(spr.czyGdansk(o2));
        System.out.println(spr.czyGdansk(f2));


                String string = "kamilos";
                System.out.println("last character: " +
                        string.substring(string.length() - 1));

    }
}
