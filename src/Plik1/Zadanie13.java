package Plik1;

import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int iloscCiastek;
        int iloscPorcji;
        int iloscCalNaPorcje;
        int iloscZjedzonychCiastek;
        System.out.println("Podaj liczbe ciastek w pudełku: ");
        iloscCiastek = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj ilosć porcji");
        iloscPorcji = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj ilość kalori na porcję: ");
        iloscCalNaPorcje = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj liczbe zjedzonych ciastek: ");
        iloscZjedzonychCiastek = klawisz.nextInt();
        klawisz.nextLine();
        double calPorcja;
        calPorcja = iloscCalNaPorcje / iloscPorcji;
        double zjedzoneCal;
        zjedzoneCal = iloscZjedzonychCiastek * calPorcja;
        System.out.println("Zjadłeś: " + zjedzoneCal + " kalaori");



    }
}
