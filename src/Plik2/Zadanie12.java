package Plik2;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner klawisze= new Scanner(System.in);
        String Powietrze="Powietrze";
        String Woda="Woda";
        String Stal="Stal";
        double czas;
        double pPowietrze=343;
        double pWoda=1490;
        double pStal=5100;
        String material;
        double odleglosc;
        System.out.println("Podaj materiał i odległość jaką ma przebyć fala:");
        material=klawisze.nextLine();
        odleglosc= klawisze.nextDouble();
        klawisze.nextLine();
        if (material.equalsIgnoreCase(Powietrze)) {
            czas=odleglosc/pPowietrze;
            System.out.println("czas to: " + czas);
        } else if (material.equalsIgnoreCase(Woda)) {
            czas=odleglosc/pWoda;
            System.out.println("czas to " +czas);
        }else if (material.equalsIgnoreCase(Stal)) {
            czas=odleglosc/pStal;
            System.out.println("czas to " +czas);
        }
    }
}
