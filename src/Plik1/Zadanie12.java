package Plik1;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double dystans;
        double zuzytePaliwo;
        System.out.println("Podaj liczne przejechanych kilometrów: ");
        dystans = klawisz.nextDouble();
        klawisz.nextLine();
        System.out.println("Podaj ilość zużytego paliwa: ");
        zuzytePaliwo = klawisz.nextDouble();
        klawisz.nextLine();
        double kilometryNaPaliwo;
        kilometryNaPaliwo = dystans / zuzytePaliwo;
        System.out.println("Liczba przejechanych kilometrów na litrze paliwa: " + kilometryNaPaliwo);
    }
}
