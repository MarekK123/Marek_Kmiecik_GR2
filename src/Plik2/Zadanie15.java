package Plik2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner klwisze = new Scanner(System.in);
        int liczbaCzekow;
        int podsOplata=10;
        double oplata1=0.1;
        double oplata2=0.08;
        double oplata3=0.06;
        double oplata4=0.04;
        double zmienna;
        double cenaCalkowita;
        System.out.println("Podaj liczbę czeków wystawionych w tym miesiącu: ");
        liczbaCzekow=klwisze.nextInt();
        if (liczbaCzekow<20) {
        zmienna=liczbaCzekow*oplata1;
        cenaCalkowita=podsOplata+zmienna;
            BigDecimal bd = new BigDecimal(cenaCalkowita).setScale(3, RoundingMode.HALF_UP);
            double liczbaZaokroglona = bd.doubleValue();
            System.out.println("Bank pobrał " + liczbaZaokroglona+" zł w tym miesiącu");
        } else if (liczbaCzekow<=39 && liczbaCzekow>=20) {
            zmienna=liczbaCzekow*oplata2;
            cenaCalkowita=podsOplata+zmienna;
            BigDecimal bd = new BigDecimal(cenaCalkowita).setScale(3, RoundingMode.HALF_UP);
            double liczbaZaokroglona = bd.doubleValue();
            System.out.println("Bank pobrał " + liczbaZaokroglona+" zł w tym miesiącu");
        }else if (liczbaCzekow<=59 && liczbaCzekow>=40) {
            zmienna=liczbaCzekow*oplata3;
            cenaCalkowita=podsOplata+zmienna;
            BigDecimal bd = new BigDecimal(cenaCalkowita).setScale(3, RoundingMode.HALF_UP);
            double liczbaZaokroglona = bd.doubleValue();
            System.out.println("Bank pobrał " + liczbaZaokroglona+" zł w tym miesiącu");
        }else if (liczbaCzekow>=60) {
            zmienna=liczbaCzekow*oplata4;
            cenaCalkowita=podsOplata+zmienna;
            BigDecimal bd = new BigDecimal(cenaCalkowita).setScale(3, RoundingMode.HALF_UP);
            double liczbaZaokroglona = bd.doubleValue();
            System.out.println("Bank pobrał " + liczbaZaokroglona+" zł w tym miesiącu");
        }
    }
}
