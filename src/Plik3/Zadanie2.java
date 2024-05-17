package Plik3;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner klawisze=new Scanner(System.in);
        boolean twierdzenie=true;
        String letter;
        while (twierdzenie) {
            System.out.println("Podaj literę T, t N lub n");
            letter= klawisze.nextLine();
            if (letter.equalsIgnoreCase("t") || letter.equalsIgnoreCase("n")){
                System.out.println("Dobrze");
                twierdzenie=false;
            }else {
                twierdzenie=true;
                System.out.println("Źle");
            }
        }
    }
}
