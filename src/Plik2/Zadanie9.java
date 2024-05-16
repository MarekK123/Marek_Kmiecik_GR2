package Plik2;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        double waga;
        double odleglosc;
        double pom;
        double stawka1 = 1.1;
        double stawka2 = 2.2;
        double stawka3 = 3.7;
        double stawka4 = 3.8;
        int wielkorotnosc = 2;
        System.out.println("Podaj wagę: ");
        waga = klawisze.nextDouble();
        System.out.println("Podaj odległość: ");
        odleglosc = klawisze.nextDouble();
        if (odleglosc <= 500 && waga <= 1) {
            System.out.println("cena 1,10zł");
        } else if (odleglosc <= 500 && waga <= 3 && waga > 1) {
            System.out.println("cena 2,20zł");
        } else if (odleglosc <= 500 && waga <= 5 && waga > 3) {
            System.out.println("cena 3,70zł");
        } else if (odleglosc <= 500 && waga > 5) {
            System.out.println("cena 3,80zł");
        } else if (odleglosc > 500 && odleglosc <= 1000 && waga <= 1) {
            pom = stawka1 * wielkorotnosc;
            System.out.println("cena " + pom);
        }else if (odleglosc > 500 && odleglosc <= 1000 && waga <= 3) {
            pom = stawka2 * wielkorotnosc;
            System.out.println("cena " + pom);
        }else if (odleglosc > 500 && odleglosc <=1000 && waga <= 5) {
            pom = stawka3 * wielkorotnosc;
            System.out.println("cena " + pom);
        }else if (odleglosc > 500 && odleglosc <= 1000 && waga>5) {
            pom = stawka4 * wielkorotnosc;
            System.out.println("cena " + pom);
        }
    }
}

