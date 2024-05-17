package Plik4;

import javax.swing.text.ElementIterator;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner klawisze=new Scanner(System.in);
        String lancuch;
        System.out.println("Podaj łańcuch znaków");
        lancuch= klawisze.nextLine();
        String znak;
        System.out.println("Podaj znak");
        znak= klawisze.nextLine();
        int dlugosc=lancuch.length();
        int suma=0;
        for (int i=0;i<dlugosc;i++){
            char litera=lancuch.charAt(i);
            if(String.valueOf(litera).equalsIgnoreCase(znak)){
                suma=suma+1;
            }
        }
        System.out.println("W łańchuchu znaków litera "+ znak+" występuje "+ suma+ " razy");
        }
    }


