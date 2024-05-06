package Plik1;

import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double cena;
        System.out.println("Podaj cene produktu");
        cena = klawisz.nextDouble();
        klawisz.nextLine();
        double podatekStanowy = 0.04;
        double podatekLokalny = 0.02;
        double cenaPoPodatku;
        cenaPoPodatku = cena + cena * podatekLokalny + cena * podatekStanowy;
        System.out.println("Cena: " + cena + " cena po podatku: " + cenaPoPodatku +
                " podatek stanowy: " + podatekStanowy + " podatek lokalny : " + podatekLokalny);

    }
}
