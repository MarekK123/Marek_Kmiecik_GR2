package Plik2;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        int wynik1;
        int wynik2;
        int wynik3;
        int iloscWynikow = 3;
        System.out.println("Podaj pierwszy wynik");
        wynik1 = klawisze.nextInt();
        System.out.println("Podaj drugi wynik");
        wynik2 = klawisze.nextInt();
        System.out.println("Podaj trzeci wynik");
        wynik3 = klawisze.nextInt();
        double srednia = (wynik1+wynik2+wynik3)/iloscWynikow;
        if (srednia >=90 && srednia<=100) {
            System.out.println("5");
        } else if (srednia >=80 && srednia <=89) {
            System.out.println("4");
        } else if (srednia>=70 && srednia<=79) {
            System.out.println("3");
        } else if (srednia>=60 && srednia<=69) {
            System.out.println("2");
        } else if (srednia<60) {
            System.out.println("1");
        }
    }
}
