package Plik2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner klaiwsze = new Scanner(System.in);
        double cenaA = 39.99;
        double cenaB = 59.99;
        double cenaC = 69.99;
        double freeTimeA = 450;
        double freeTimeB = 900;
        double freeMinutA = 0.45;
        double freeMinutB = 0.40;
        double zmienaB;
        double zmienaC;
        String a = "a";
        String b = "b";
        String c = "c";
        String pakiet;
        int minutRozmowy;
        double cenaZaMinuty;
        double nowaCena;
        System.out.println("Wybierz pakiet a lub b i liczbę minut na rozmowę ");
        pakiet = klaiwsze.nextLine();
        minutRozmowy = klaiwsze.nextInt();
        if (pakiet.equalsIgnoreCase(a) && minutRozmowy <= freeTimeA) {
            System.out.println("opłata wynosi 39,99");
        } else if (pakiet.equalsIgnoreCase(a) && minutRozmowy > freeTimeA) {
            cenaZaMinuty = (minutRozmowy - freeTimeA) * freeMinutA;
            BigDecimal bd = new BigDecimal(cenaZaMinuty).setScale(3, RoundingMode.HALF_UP);
            double liczbaZaokroglona = bd.doubleValue();
            nowaCena = cenaA + liczbaZaokroglona;
            zmienaB = nowaCena-cenaB;
            zmienaC = nowaCena-cenaC;
            BigDecimal ba = new BigDecimal(zmienaB).setScale(3, RoundingMode.HALF_UP);
            double ZB = ba.doubleValue();
            BigDecimal bb = new BigDecimal(zmienaC).setScale(3, RoundingMode.HALF_UP);
            double ZC = bb.doubleValue();
                System.out.println("Gdyby klient z pakietem a wybrał pakiet b zaoszczędziłby " + ZB + " a gdyby wybrał pakiet c " + ZC);

        } else if (pakiet.equalsIgnoreCase(b) && minutRozmowy <= freeTimeB) {
            System.out.println("opłata wynosi 69,99");
        } else if (pakiet.equalsIgnoreCase(b) && minutRozmowy > freeTimeB) {
            cenaZaMinuty = (minutRozmowy - freeTimeB) * freeMinutB;
            BigDecimal bd = new BigDecimal(cenaZaMinuty).setScale(3, RoundingMode.HALF_UP);
            double liczbaZaokroglona = bd.doubleValue();
            nowaCena = cenaB + liczbaZaokroglona;
            zmienaC = nowaCena-cenaC;
            BigDecimal bb = new BigDecimal(zmienaC).setScale(3, RoundingMode.HALF_UP);
            double ZC = bb.doubleValue();
                System.out.println("Gdyby klient z pakietem b wybrał pakiet c zaoszczędziłby " + ZC);

        }
    }
}
