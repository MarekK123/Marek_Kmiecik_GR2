package Plik4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner klawisze=new Scanner(System.in);
        int dni;
        double zaDzien=0.01;
        double suma=0;
        double wynik=0;
        double suma1=0;
        double suma2=0;
        double suma3=0;
        double osta;

        System.out.println("Podaj liczbę dni");
        dni= klawisze.nextInt();
        if(dni<1){
            System.out.println("Błąd");
        }else {
        for (int i=1;i<=dni;i++){
            if (i==1){
                System.out.println(zaDzien);
                suma1=zaDzien;
            }else if (i==2){
                wynik=zaDzien*2;
                System.out.println(wynik);
                suma2=wynik;
            }else {
                wynik = wynik * 2;
                System.out.println(wynik);
                suma3 = wynik + suma3;
            }
            }
        }

        osta=suma1+suma2+suma3;
        BigDecimal bd = new BigDecimal(osta).setScale(3, RoundingMode.HALF_UP);
        double liczbaZaokroglona = bd.doubleValue();

        System.out.println("Wynik to "+liczbaZaokroglona+" zł");
    }
}
