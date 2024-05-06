package Plik1;

import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        double kwotaPieniedzy;
        System.out.println("Podaj kwotę zdeponowanych pieniędzy: ");
        kwotaPieniedzy = klawisze.nextDouble();
        double rocznaStopa;
        System.out.println("Podaj roczną stopę oprocentowania: ");
        rocznaStopa = klawisze.nextDouble();
        int iloscKapitalizowania;
        System.out.println("Podaj ile razy w roku odsetki są kapitalizowane: ");
        iloscKapitalizowania = klawisze.nextInt();
        int liczbaLat;
        System.out.println("Ile lat środki będą na kącie: ");
        liczbaLat = klawisze.nextInt();
        double potega = iloscKapitalizowania * liczbaLat;
        double nawias =(1.0 + rocznaStopa/iloscKapitalizowania);
        double wynikPotegi = Math.pow(nawias,potega);
        double kwotaOstateczna = wynikPotegi * kwotaPieniedzy;
        System.out.println("Kwota wynosi: " + kwotaOstateczna);
    }
}
