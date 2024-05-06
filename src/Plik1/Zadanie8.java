package Plik1;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int pomieszczenie1 = 1;
        int pomieszczenie2 = 1;
        int pomieszczenie3 = 1;
        int pomieszczenie4 = 1;
        int szerokosc1;
        int szerokosc2;
        int szerokosc3;
        int szerokosc4;
        int dlugosc1;
        int dlugosc2;
        int dlugosc3;
        int dlugosc4;
        System.out.println("Podaj pierwszą szerokosć pokoju ");
        szerokosc1= klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj pierwszą długość pokoju ");
        dlugosc1= klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj szerokość drugiego pokoju ");
        szerokosc2= klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj długość drugiego pokoju ");
        dlugosc2= klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj szerokość trzeciego pokoju ");
        szerokosc3= klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj długość trzeciego pokoju ");
        dlugosc3= klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj szerokość czwartego pokoju ");
        szerokosc4= klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj długość czwartego pokoju ");
        dlugosc4= klawisz.nextInt();
        klawisz.nextLine();
        int wielkosc1 = szerokosc1 * dlugosc1;
        int wielkosc2 = szerokosc2 * dlugosc2;
        int wielkosc3 = szerokosc3 * dlugosc3;
        int wielkosc4 = szerokosc4 * dlugosc4;
        int wielkoscCalkowita = wielkosc1 + wielkosc2 + wielkosc3 + wielkosc4;


        System.out.println("Wielkość pomieszczenia1: " + wielkosc1+"m2");
        System.out.println("Wielkość pomieszczenia2: " + wielkosc2+"m2");
        System.out.println("Wielkość pomieszczenia3: " + wielkosc3 +"m2");
        System.out.println("Wielkość pomieszczenia4: " + wielkosc4 +"m2");
        System.out.println("Wielkość całkowita: " + wielkoscCalkowita);
        int osoby = 4;
        System.out.println("Ilość miejsca na 1 osobę " + (double) wielkoscCalkowita / osoby +"m2");
    }
}

