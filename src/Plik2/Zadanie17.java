package Plik2;

import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        Scanner klawisze = new Scanner(System.in);
        String pom2 = "Nie";
        String wegetarianskie;
        String weganskie;
        String bezglutenowe;
        System.out.println("Czy któraś z osób jest na diecie wegetariańskiej?");
        wegetarianskie = klawisze.nextLine();
        System.out.println("Czy któraś z osób jest na diecie wegańskiej?");
        weganskie = klawisze.nextLine();
        System.out.println("Czy któraś z osób jest na diecie bezglutenowej?");
        bezglutenowe = klawisze.nextLine();
        if (pom2.equalsIgnoreCase(wegetarianskie) && pom2.equalsIgnoreCase(weganskie) && pom2.equalsIgnoreCase(bezglutenowe)){
            System.out.println("Luksusowe burgery u Jacka");
        } if (pom2.equalsIgnoreCase(weganskie) && pom2.equalsIgnoreCase(bezglutenowe)) {
            System.out.println("Włoskie speciały");
        } if (pom2.equalsIgnoreCase(weganskie)) {
            System.out.println("Pizzeria przy dworcowej");
        }
        System.out.println("Kawiarnia na rogu\nKuchnia u szefa");
    }
}
