package Plik2;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        int liczbaSec;
        int liczbaMin;
        int liczbaGodz;
        int liczbaDni;
        int liczbaSecWDniu=86400;
        int liczbaSecWGodz=3600;
        int liczbaSecWMinucie=60;
        System.out.println("Podaj liczbę sekund");
        liczbaSec = klawisze.nextInt();
        if(liczbaSec>=liczbaSecWDniu){
            liczbaDni= liczbaSec / liczbaSecWDniu;
            System.out.println(liczbaDni+" dni");
            liczbaSec=liczbaSec-liczbaDni*liczbaSecWDniu;
            liczbaGodz=liczbaSec/liczbaSecWGodz;
            System.out.println(liczbaGodz + " godzin");
            liczbaSec=liczbaSec-liczbaGodz*liczbaSecWGodz;
            liczbaMin=liczbaSec/liczbaSecWMinucie;
            System.out.println(liczbaMin + " minut");
            liczbaSec=liczbaSec-liczbaMin*liczbaSecWMinucie;
            System.out.println(liczbaSec+ " sekund");
        } else if (liczbaSec<=liczbaSecWGodz && liczbaSec >liczbaSecWMinucie) {
            liczbaGodz=liczbaSec/liczbaSecWGodz;
            System.out.println(liczbaGodz + " godzin");
            liczbaSec=liczbaSec-liczbaGodz*liczbaSecWGodz;
            liczbaMin=liczbaSec/liczbaSecWMinucie;
            System.out.println(liczbaMin + " minut");
            liczbaSec=liczbaSec-liczbaMin*liczbaSecWMinucie;
            System.out.println(liczbaSec+ " sekund");
        } else if (liczbaSec<=liczbaSecWMinucie) {
            liczbaMin=liczbaSec/liczbaSecWMinucie;
            System.out.println(liczbaMin + " minut");
            liczbaSec=liczbaSec-liczbaMin*liczbaSecWMinucie;
            System.out.println(liczbaSec+ " sekund");
        }
    }
}
