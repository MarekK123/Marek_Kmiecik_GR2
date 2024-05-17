package Plik3;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner klawisze=new Scanner(System.in);
        int liczba;
        System.out.println("Podaj liczbę");
        liczba = klawisze.nextInt();
        while (liczba<100){
            liczba=liczba*10;
        }
        System.out.println(liczba);
    }
}
