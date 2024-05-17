package Plik4;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner klawisze=new Scanner(System.in);
        System.out.println("Podaj liczbę lat");
        int liczbaLat= klawisze.nextInt();
        int liczbaMiesiecy;
        double sredniaopadow;
        double wszystkieOpady=0;
        if (liczbaLat<0){
            System.out.println("błąd");
        }else {
            for (int i = 0; i <= liczbaLat; i++) {
                for (int j = 1; j <= 12; j++) {
                    System.out.println("Podaj ilość opadów w " + j + " miesiącu " + i + " roku");
                    double opadyWMiesiacu = klawisze.nextDouble();
                    wszystkieOpady = wszystkieOpady + opadyWMiesiacu;
                }

            }
            liczbaMiesiecy = liczbaLat * 12;
            sredniaopadow = wszystkieOpady / liczbaMiesiecy;
            System.out.println("Liczba miesięcy " + liczbaMiesiecy);
            System.out.println("liczba opadów " + wszystkieOpady);
            System.out.println("średnia ilość opadów " + sredniaopadow);
        }
    }
}
