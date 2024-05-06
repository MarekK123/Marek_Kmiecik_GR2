package Plik1;

import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        int iloscWynikow = 3;
        int wynik1;
        int wynik2;
        int wynik3;
        Scanner klawisze = new Scanner(System.in);
        System.out.println("Podaj wynik z pierwszego testu: ");
        wynik1 = klawisze.nextInt();
        klawisze.nextLine();
        System.out.println("Podaj wynik z drugiego testu: ");
        wynik2 = klawisze.nextInt();
        klawisze.nextLine();
        System.out.println("Podaj wynik z trzeciego testu: ");
        wynik3 = klawisze.nextInt();
        klawisze.nextLine();
        double srednia;
        srednia = (double)(wynik1 + wynik2 + wynik3) / iloscWynikow;
        System.out.println("Z pierwszego testu otrzymałeś " + wynik1 + " z drugiego " + wynik2 + " z trzeciego " +
                wynik3 + " co oznacza że masz średnią " + srednia);

    }
}
