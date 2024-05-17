package Plik4;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner klawisze=new Scanner(System.in);
        int liczba;
        int suma=0;
        System.out.println("Podaj liczbę nie zerową");
        liczba= klawisze.nextInt();
        for (int i=0;i<=liczba;i++){
            suma=i+suma;
        }
        System.out.println("suma to "+ suma);
    }
}
