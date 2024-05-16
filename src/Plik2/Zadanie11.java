package Plik2;

import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        String nazwisko1;
        String nazwisko2;
        String nazwisko3;
        double czas1;
        double czas2;
        double czas3;
        System.out.println("Podaj nazwisko pierwsze : ");
        nazwisko1=klawisze.nextLine();
        System.out.println("czas");
        czas1 = klawisze.nextDouble();
        klawisze.nextLine();
        System.out.println("Podaj nazwisko drugie : ");
        nazwisko2=klawisze.nextLine();
        System.out.println("czas");
        czas2 = klawisze.nextDouble();
        klawisze.nextLine();
        System.out.println("Podaj nazwisko trzecie: ");
        nazwisko3=klawisze.nextLine();
        System.out.println("czas");
        czas3 = klawisze.nextDouble();
        klawisze.nextLine();
        if (czas1<czas2 && czas1<czas3 && czas2<czas3){
            System.out.println(nazwisko1+" " + nazwisko2+" " + nazwisko3);
        } else if (czas1<czas2 && czas1<czas3 && czas2>czas3) {
            System.out.println(nazwisko1+" " + nazwisko3+" " + nazwisko2);
        } else if (czas2>czas1&& czas2<czas3 && czas1<czas3) {
            System.out.println(nazwisko2+" " + nazwisko1+" " + nazwisko3);
        }
        else if (czas2<czas1&& czas2<czas3 && czas1>czas3) {
            System.out.println(nazwisko2+" " + nazwisko3+" " + nazwisko1);
        }
        else if (czas3<czas1 && czas3<czas2 && czas1<czas2) {
            System.out.println(nazwisko3 + " " + nazwisko1 + " " + nazwisko2);
        }else if (czas3<czas1 && czas3<czas2 && czas1>czas2) {
            System.out.println(nazwisko3 + " " + nazwisko2 + " " + nazwisko1);
        }

    }
}
