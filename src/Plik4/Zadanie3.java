package Plik4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) throws IOException {
        Scanner klawisze = new Scanner(System.in);
        int szybkosc;
        int czas;
        System.out.println("Podaj szybkość");
        szybkosc = klawisze.nextInt();
        System.out.println("Podaj czas");
        czas = klawisze.nextInt();
        int odleglosc = 0;
        int pom;
        if (czas < 1 || szybkosc <= 0) {
            System.out.println("Błąd");
        } else
            for (int i = 1; i <= czas; i++) {
                odleglosc = szybkosc * czas + odleglosc;
                pom = odleglosc / czas;
                System.out.println(i + "." + " " + pom);
                FileWriter nw=new FileWriter("dane.txt",true);
                PrintWriter pw= new PrintWriter(nw);
                pw.println(i + "." + " " + pom);
                pw.close();
            }


    }
    }

