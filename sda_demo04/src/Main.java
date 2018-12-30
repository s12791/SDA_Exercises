import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        int pierscionki = 0;
        int zegarki = 0;

        System.out.println("Witam ! Rozpoczynamy ankiete !");
        boolean endLoop = false;

        try (FileWriter fw = new FileWriter("/Users/kamilk/aaaaa02.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            while (!endLoop) {

                System.out.println(" Jaki jest twoj wiek");
                Scanner scanner = new Scanner(System.in);
                int wiek = scanner.nextInt();

                System.out.println("Jaki jest twoj wzrost ( podaj tylko liczbę, w cm)");
                int wzrost = scanner.nextInt();

                System.out.println("Jaka jest twoja pleć");
                String plec = scanner.next();

                if (plec.equals("Kobieta") || plec.equals("KOBIETA") || plec.equals("kobieta")) {
                    System.out.println("Podaj ile masz pierscionkow");
                    pierscionki = scanner.nextInt();
                }
                if (plec.equals("Mezczyzna") || plec.equals("MEZCZYZNA") || plec.equals("mezczyzna")) {
                    System.out.println("Podaj ile masz zegarkow");
                    zegarki = scanner.nextInt();
                }

                System.out.println("Jakie sa twoje zarobki ( podaj liczbe zl przychodu na miesiac)");
                int zarobki = scanner.nextInt();

                System.out.println("Jaki jest twoj ulubiony kolor");
                String kolor = scanner.next();

                System.out.println("Dzieki za wypelnienie ankiety");
                System.out.println("Czy chcesz przeprowadzic ankiete jeszcze raz? Napisz odpowiedz tak/nie ");

                String pytanie = scanner.next();

                bw.write(String.valueOf("Osoba"));
                bw.newLine();
                bw.write("Jaki jest twoj wiek " + wiek);
                bw.newLine();
                bw.write("Jaki jest twoj wzrost ( podaj tylko liczbę, w cm) " + wzrost);
                bw.newLine();
                bw.write("Jaka jest twoja pleć " + plec);
                bw.newLine();
                if (plec.equals("kobieta")) {
                    bw.write(String.valueOf("Liczna pierscionkow " + pierscionki));
                    bw.newLine();
                } else if (plec.equals("mezczyzna")) {
                    bw.write(String.valueOf("Liczna zegarkow " + zegarki));
                    bw.newLine();
                }

                bw.write("Jakie sa twoje zarobki ( podaj liczbe zl przychodu na miesiac) " + zarobki);
                bw.newLine();
                bw.write("Jaki jest twoj ulubiony kolor " + kolor);
                bw.newLine();

                if (pytanie.equals("nie") || pytanie.equals("NIE") || pytanie.equals("Nie")) {
                    System.out.println("Dziekujemy za udział w ankiecie");
                    endLoop = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}