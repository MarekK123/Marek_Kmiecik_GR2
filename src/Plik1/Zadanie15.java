package Plik1;

import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        double marze = 0.4;
        double cenaDetaliczna;
        Scanner klawisze = new Scanner(System.in);
        System.out.println("Podaj cene detaliczną: ");
        cenaDetaliczna = klawisze.nextDouble();
        klawisze.nextLine();
        double zysk;
        zysk = marze * cenaDetaliczna;
        System.out.println("Zysk to " + zysk);
    }
}
