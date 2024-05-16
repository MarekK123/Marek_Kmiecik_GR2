package Plik2;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        String imie1;
        String imie2;
        String imie3;
        System.out.println("Podaj pierwsze imię");
        imie1 = klawisze.nextLine();
        System.out.println("Podaj drugie imię");
        imie2 = klawisze.nextLine();
        System.out.println("Podaj trzecie imię");
        imie3 = klawisze.nextLine();
        if (imie1.compareToIgnoreCase(imie2)< 0 && imie1.compareToIgnoreCase(imie3)< 0 && imie2.compareToIgnoreCase(imie3)< 0){
            System.out.println(imie1+" " + imie2+" " + imie3);
        } else if (imie1.compareToIgnoreCase(imie2)< 0 && imie1.compareToIgnoreCase(imie3)< 0 && imie2.compareToIgnoreCase(imie3)< 0) {
            System.out.println(imie1+" " + imie3+" " + imie2);
        } else if (imie2.compareToIgnoreCase(imie1)< 0 && imie2.compareToIgnoreCase(imie3)< 0 && imie1.compareToIgnoreCase(imie3)< 0) {
            System.out.println(imie2+" " + imie1+" " + imie3);
        }
        else if (imie2.compareToIgnoreCase(imie1)< 0 && imie2.compareToIgnoreCase(imie3)< 0 && imie3.compareToIgnoreCase(imie2)< 0) {
            System.out.println(imie2+" " + imie3+" " + imie1);
        }
        else if (imie3.compareToIgnoreCase(imie1)< 0 && imie3.compareToIgnoreCase(imie2)< 0 && imie1.compareToIgnoreCase(imie2)< 0) {
            System.out.println(imie3+" " + imie1+" " + imie2);
        }else if (imie3.compareToIgnoreCase(imie1)< 0 && imie3.compareToIgnoreCase(imie2)< 0 && imie3.compareToIgnoreCase(imie1)< 0) {
            System.out.println(imie3 +" "+ imie2+" " + imie1);
        }
        
    }
}
