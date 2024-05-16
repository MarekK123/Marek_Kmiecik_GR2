package Plik2;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
                double kalorie;
                double gramTluszcz;
        System.out.println("Podaj liczbę kalori: ");
        kalorie = klawisze.nextDouble();
        System.out.println("Podaj ilość gramów tłuszczu: ");
        gramTluszcz = klawisze.nextDouble();
        double kalorieZTluszcz = gramTluszcz * 9;
        double procentKaroliZTluszcz = kalorieZTluszcz/kalorie;
        double procentZKalori = kalorie *0.3;
        if (procentKaroliZTluszcz<procentZKalori) {
            System.out.println("Produkt jest niskotłuszczowy");
        }
        if (kalorieZTluszcz>kalorie){
            System.out.println("Dane błędne");
        }
    }
}
