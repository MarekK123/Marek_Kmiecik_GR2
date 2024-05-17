package Plik4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args)throws IOException {
        Scanner klawisze=new Scanner(System.in);
        String lancuch;
        System.out.println("Podaj nazwe pliku");
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
        System.out.println("W pliku litera "+ znak+" występuje "+ suma+ " razy");
        FileWriter nw=new FileWriter("dane2.txt",true);
        PrintWriter pw= new PrintWriter(nw);
        pw.println("W pliku litera "+ znak+" występuje "+ suma+ " razy");
        pw.close();
    }
}
