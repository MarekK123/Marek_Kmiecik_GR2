package Plik2;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        double liczbaSec;
        double liczbaMin;
        double liczbaGodz;
        double liczbaDni;
        int zmienaCzasu = 60;
        int liczbaGodzWDniu = 24;
        System.out.println("Podaj liczbę sekund");
        liczbaSec = klawisze.nextInt();
        if(liczbaSec>=86400){
            liczbaDni= liczbaSec / (zmienaCzasu*zmienaCzasu*liczbaGodzWDniu);
            System.out.println(liczbaDni+" dni");
        } else if (liczbaSec<=3600 && liczbaSec >60) {
            liczbaMin = liczbaSec/zmienaCzasu;
            System.out.println(liczbaMin +" minut");
        } else if (liczbaSec<=60) {
            System.out.println(liczbaSec + "sekund");
        }
    }
}
