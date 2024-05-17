package Plik3;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner klawisze=new Scanner(System.in);
        boolean twierdzenie=true;
        String odp;
        while (twierdzenie) {
            System.out.println("Podaj Tak lub nie");
            odp = klawisze.nextLine();
            if (odp.equalsIgnoreCase("tak") || odp.equalsIgnoreCase("Nie")){
                System.out.println("Dobrze");
                twierdzenie=false;
            }else {
                twierdzenie=true;
                System.out.println("Źle");
            }
        }
    }
}
