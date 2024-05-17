package Plik3;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner klawisze=new Scanner(System.in);
        int liczba;
        int suma=0;
        for (int i=0;i<7;i++){
            System.out.println("Podaj liczbę");
            liczba= klawisze.nextInt();
            suma=liczba+suma;
        }
        System.out.println("suma tych liczb to "+ suma);
    }
}
