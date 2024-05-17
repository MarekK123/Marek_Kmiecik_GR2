package Plik3;

import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        int suma=0;
        int liczba;
        for (int i=0;i<10;i++){
            System.out.println("Podaj liczbę");
            liczba= klawisze.nextInt();
            suma=liczba+suma;
        }
        System.out.println(suma);
    }
}
