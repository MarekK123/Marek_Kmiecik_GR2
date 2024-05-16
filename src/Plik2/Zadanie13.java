package Plik2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner klaiwsze=new Scanner(System.in);
        double cenaA =39.99;
        double cenaB =59.99;
        double cenaC =69.99;
        double freeTimeA=450;
        double freeTimeB=900;
        double freeMinutA=0.45;
        double freeMinutB=0.40;
        String a="a";
        String b="b";
        String c="c";
        String pakiet;
        int minutRozmowy;
        double cenaZaMinuty;
        double nowaCena;
        System.out.println("Wybierz pakiet a, b lub c i liczbę minut na rozmowę");
        pakiet = klaiwsze.nextLine();
        minutRozmowy= klaiwsze.nextInt();
        if(pakiet.equalsIgnoreCase(a) && minutRozmowy<=freeTimeA) {
            System.out.println("cena to 39,99zł");
        } else if (pakiet.equalsIgnoreCase(a) && minutRozmowy>freeTimeA) {
            cenaZaMinuty=(minutRozmowy-freeTimeA) *freeMinutA;
            BigDecimal bd = new BigDecimal(cenaZaMinuty).setScale(3, RoundingMode.HALF_UP);
            double liczbaZaokroglona = bd.doubleValue();
            nowaCena=cenaA +liczbaZaokroglona;
            System.out.println("cena to " +nowaCena);
        } else if (pakiet.equalsIgnoreCase(b) && minutRozmowy<=freeTimeB) {
            System.out.println("cena to " +cenaB);
        }else if (pakiet.equalsIgnoreCase(b) && minutRozmowy>freeTimeB) {
            cenaZaMinuty=(minutRozmowy-freeTimeB) *freeMinutB;
            BigDecimal bd = new BigDecimal(cenaZaMinuty).setScale(3, RoundingMode.HALF_UP);
            double liczbaZaokroglona = bd.doubleValue();
            nowaCena=cenaB +liczbaZaokroglona;
            System.out.println("cena to " +nowaCena);
        }else if (pakiet.equalsIgnoreCase(c)) {
            System.out.println("cena to " + cenaC);
        }
    }
}
