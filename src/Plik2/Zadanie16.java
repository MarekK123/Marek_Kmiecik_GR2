package Plik2;

import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        int liczbaKsiazek;
        System.out.println("Podaj liczbę kupionych książek");
        liczbaKsiazek= klawisze.nextInt();
        if (liczbaKsiazek==0) {
            System.out.println("otrzymujesz 0 punktów");
        } else if (liczbaKsiazek==1) {
            System.out.println("Otrzymujesz 5 punktów");
        }else if (liczbaKsiazek==2) {
            System.out.println("Otrzymujesz 15 punktów");
        }else if (liczbaKsiazek==3) {
            System.out.println("Otrzymujesz 30 punktów");
        }else if (liczbaKsiazek>=4) {
            System.out.println("Otrzymujesz 60 punktów");
        }
    }
}
