package Plik1;

import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        int liczbaCiastek;
        System.out.println("Podaj liczbę ciastek: ");
        liczbaCiastek = klawisze.nextInt();
        klawisze.nextLine();
        double iloscCukruNaCiastko = 1.5/48;
        double iloscMaslaNaCiastko = 1.0/48;
        double iloscMakiNaCiastko = 2.75/48;
        double iloscCukru = liczbaCiastek * iloscCukruNaCiastko;
        double iloscMasla = liczbaCiastek * iloscMaslaNaCiastko;
        double iloscmaki = liczbaCiastek * iloscMakiNaCiastko;
        System.out.println("Na " + liczbaCiastek + " potrzeba " + iloscCukru + " szklanki cukru " +
                iloscMasla + " szklanki masła " + iloscmaki + " szklanki mąki");

    }
}
