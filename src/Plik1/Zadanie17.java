package Plik1;

import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        double cena;
        System.out.println("Podaj cenę jedzenia: ");
        cena = klawisze.nextDouble();
        double podatek = 0.0675;
        double napiwek = 0.2;
        double wielkoscPoPodatku = cena * podatek;
        double cenaZPodatkiem = cena + wielkoscPoPodatku;
        double wielkoscNapiwku = napiwek * cenaZPodatkiem;
        double cenaOstateczna = cena + wielkoscPoPodatku + wielkoscNapiwku;
        System.out.println("Cena: " + cena + " podatek: " + wielkoscPoPodatku + " wielkość napiwku: " + wielkoscNapiwku +
                " cena ostateczna: " + cenaOstateczna);


    }
}
