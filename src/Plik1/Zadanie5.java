package Plik1;

public class Zadanie5 {
    public static void main(String[] args) {
        int pomieszczenie3X4 = 2;
        int pomieszczenie2X3 = 1;
        int pomieszczenie2X2 = 1;
        int szerokosc1 = 4;
        int szerokosc2 = 3;
        int szerokosc3 = 2;
        int dlugosc1 = 3;
        int dlugosc2 = 2;
        int wielkosc1 = szerokosc1 * dlugosc1;
        int wielkosc2 = szerokosc2 * dlugosc2;
        int wielkosc3 = szerokosc3 * dlugosc2;

        int wielkoscPomieszczenie3X4 = (pomieszczenie3X4 * wielkosc1) / pomieszczenie3X4;
        int wielkoscPomieszczenie2X3 = (pomieszczenie2X3 * wielkosc2) / pomieszczenie2X3;
        int wielkoscPomieszczenie2X2 = (pomieszczenie2X2 * wielkosc3) / pomieszczenie2X2;
        int wielkoscCalkowita = pomieszczenie3X4 * wielkosc1 + pomieszczenie2X3 * wielkosc2 + pomieszczenie2X2 *  wielkosc3;

        System.out.println("Wielkość pomieszczenia 3X4: " + wielkoscPomieszczenie3X4 +"m2");
        System.out.println("Wielkość pomieszczenia 2X3: " + wielkoscPomieszczenie2X3 +"m2");
        System.out.println("Wielkość pomieszczenia 2X2: " + wielkoscPomieszczenie2X2 +"m2");
        System.out.println("Wielkość całkowita: " + wielkoscCalkowita +"m2");
    }
}
