package Plik1;

import java.util.Scanner;

public class Zadanie23 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        double dlugoscRzedu;
        System.out.println("Podaj długość rzędu: ");
        dlugoscRzedu = klawisze.nextDouble();
        double iloscMiejscaNaOkratowanie;
        System.out.println("Podaj ilość miejsca zajmowanego przez okratowanie: ");
        iloscMiejscaNaOkratowanie = klawisze.nextDouble();
        double odlegloscSadzonek;
        System.out.println("Podaj odleglość między sadzonkami: ");
        odlegloscSadzonek = klawisze.nextDouble();
        double iloscSadzonekWRzedzie = (dlugoscRzedu-2*iloscMiejscaNaOkratowanie)/odlegloscSadzonek;
        System.out.println("Liczna sadzonek wynosi: " + iloscSadzonekWRzedzie);
    }
}
