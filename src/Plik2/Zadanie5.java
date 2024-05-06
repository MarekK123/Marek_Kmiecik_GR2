package Plik2;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        double masaObietku;
        double grawitacja = 9.8;
        System.out.println("Podaj mase obiektu");
        masaObietku = klawisze.nextDouble();
        double ciezar = masaObietku * grawitacja;
        if (ciezar > 1000) {
            System.out.println("Obiekt zbyt ciężki");
        } else if (ciezar < 10) {
            System.out.println("Za lekki");
        } else if (ciezar <= 1000 && ciezar >= 10) {
            System.out.println("Ciężar odpowiedni");
        }
    }
    }
