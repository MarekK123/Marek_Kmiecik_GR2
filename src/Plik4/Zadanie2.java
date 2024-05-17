package Plik4;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        int szybkosc;
        int czas;
        System.out.println("Podaj szybkość");
        szybkosc = klawisze.nextInt();
        System.out.println("Podaj czas");
        czas = klawisze.nextInt();
        int odleglosc = 0;
        int pom;
        if (czas < 1 || szybkosc <= 0) {
            System.out.println("Błąd");
        } else
            for (int i = 1; i <= czas; i++) {
                odleglosc = szybkosc * czas + odleglosc;
                pom = odleglosc / czas;
                System.out.println(i + "." + " " + pom);
            }
    }
    }

