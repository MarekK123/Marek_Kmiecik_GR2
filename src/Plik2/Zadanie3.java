package Plik2;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        double waga;
        System.out.println("Podaj swoją wagę");
        waga = klawisze.nextDouble();
        double wzrost;
        System.out.println("Podaj wzrost w metrach");
        wzrost = klawisze.nextDouble();
        double wzrostKwadrat = wzrost*wzrost;
        double bmi = waga/wzrostKwadrat;
        if (bmi > 25){
            System.out.println("Masz nadwagę");
        } else if (bmi < 18.5) {
            System.out.println("Masz niedowagę");
        }else if (bmi<=25 && bmi >= 18.5) {
            System.out.println("Masz odpowiednią wagę");
        }
    }
}
