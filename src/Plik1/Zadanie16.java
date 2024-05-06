package Plik1;

import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        String miasto;
        System.out.println("Podaj swoje ulubione miasto: ");
        miasto = klawisze.nextLine();
        int dlugosc = miasto.length();
        System.out.println(dlugosc);
        String male, duze;
        duze = miasto.toUpperCase();
        male = miasto.toLowerCase();
        System.out.println(duze);
        System.out.println(male);
        char ini = miasto.charAt(0);
        System.out.println(ini);

    }
}
