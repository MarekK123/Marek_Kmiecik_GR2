package Plik2;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        int dni;
        int miesiac;
        int rok;
        System.out.println("Podaj dzień");
        dni = klawisze.nextInt();
        System.out.println("Podaj miesiąc");
        miesiac = klawisze.nextInt();
        System.out.println("Podaj rok");
        rok = klawisze.nextInt();
        double iloczyn = dni*miesiac;
        if(rok == iloczyn) {
            System.out.println("Data jest magiczna");
        }
        else {
            System.out.println("Data nie jest magiczna");
        }
    }
}
