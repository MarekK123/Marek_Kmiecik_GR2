package Plik3;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        int liczba1;
        int liczba2;
        int wynik=0;
        String odp;
        boolean twierdzenie=true;
        System.out.println("Podaj pierwszą liczbę");
        liczba1 = klawisze.nextInt();
        System.out.println("Podaj drugą liczbę");
        liczba2= klawisze.nextInt();
        klawisze.nextLine();
        do{
            wynik=liczba1+liczba2+wynik;
            System.out.println(wynik);
            System.out.println("dodać jeszcze raz?");
            odp= klawisze.nextLine();
           if (odp.equalsIgnoreCase("tak")) {
               twierdzenie = true;
           }else {
               twierdzenie=false;
           }

        }while(twierdzenie);

        }
    }

