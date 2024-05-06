package Plik1;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        String firsName,middleName, lastName;
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj Swoje imię: ");
        firsName = klawisz.nextLine();
        System.out.println("Podaj swoje drugie imię: ");
        middleName = klawisz.nextLine();
        System.out.println("Podaj swoje nazwisko: ");
        lastName = klawisz.nextLine();
        char firstInitial = firsName.charAt(0);
        char  middleinitial= middleName.charAt(0);
        char  lastInitial= lastName.charAt(0);
        System.out.println("Imie: " + firsName + " " + middleName + " " + lastName + " " +"Inicjały " +
                firstInitial + " " + middleinitial + " " + lastInitial);
    }
}
