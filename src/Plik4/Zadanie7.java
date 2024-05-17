package Plik4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        int calkowiteZajete = 0;
        double obciazenie=0;
        int zajete;
        double liczbaZaokroglona;
        int wszystkie = 0;
        Scanner klawisze = new Scanner(System.in);
        int liczbaPienter;
        System.out.println("Podaj liczbę pięter");
        liczbaPienter = klawisze.nextInt();
        if (liczbaPienter>=1){
        for (int i = 1; i <= liczbaPienter; i++) {
            System.out.println("Podaj liczbę wszystkich pokoi na " + i + " piętrze");
            wszystkie = klawisze.nextInt();
            if (wszystkie >= 10) {
                System.out.println("Podaj liczbę zajętcyh pokoi na " + i + " piętrze");
                zajete = klawisze.nextInt();

                wszystkie = wszystkie + wszystkie;
                calkowiteZajete = zajete + calkowiteZajete;

                obciazenie = (double) calkowiteZajete / wszystkie;
                BigDecimal bd = new BigDecimal(obciazenie).setScale(3, RoundingMode.HALF_UP);
                liczbaZaokroglona = bd.doubleValue();
                System.out.println(" Wszystkich pokoi " + wszystkie + " zajetętych " + calkowiteZajete + " obciążenie " + liczbaZaokroglona);
            }else {
                System.out.println("błąd");
            }

            }

        }else {
            System.out.println("błąd");
        }

    }
}

