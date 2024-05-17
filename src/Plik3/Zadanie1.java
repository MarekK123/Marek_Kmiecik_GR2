package Plik3;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        int liczba;
        boolean twierdzenie = true;

        while (twierdzenie) {
            System.out.println("Podaj liczbę od 10 do 24");
            liczba = klawisze.nextInt();
        if (liczba < 10 | liczba > 24) {
            twierdzenie = true;
            System.out.println("Błędne dane");
        } else {
            twierdzenie = false;

            System.out.println("Poprawne dane liczba " + liczba);
        }

    }

    }

}
