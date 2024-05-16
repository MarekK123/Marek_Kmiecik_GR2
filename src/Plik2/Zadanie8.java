package Plik2;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        double sztuki;
        System.out.println("Podaj liczbę sztuk");
        sztuki = klawisze.nextDouble();
        double cena = 99;
        double rabat1 = 0.2;
        double rabat2 = 0.3;
        double rabat3 = 0.4;
        double rabat4 = 0.5;
        double cenaCalkowita=cena * sztuki;
        double cenaRabat1 = cenaCalkowita*rabat1;
        double cenaRabat2=cenaCalkowita*rabat2;
        double cenaRabat3=cenaCalkowita*rabat3;
        double cenaRabat4=cenaCalkowita*rabat4;
        double cenaPoRabat1=cenaCalkowita - cenaRabat1;
        double cenaPoRabat2=cenaCalkowita -cenaRabat2;
        double cenaPoRabat3= cenaCalkowita - cenaRabat3;
        double cenaPoRabat4=cenaCalkowita - cenaRabat4;
        if (sztuki < 10) {
            System.out.println("Brak rabatu cena: " + cenaCalkowita);
        } else if (sztuki >= 10 && sztuki <= 19) {
            System.out.println("Rabat 20% cena: " + cenaPoRabat1);
        } else if (sztuki >= 20 && sztuki <= 49) {
            System.out.println("Rabat 30% cena: " + cenaPoRabat2);
        } else if (sztuki >= 50 && sztuki <= 99) {
            System.out.println("Rabat 40% cena: " + cenaPoRabat3);
        } else if (sztuki >= 100) {
            System.out.println("Rabat 50% cena: " + cenaPoRabat4 );
        }
    }
}
