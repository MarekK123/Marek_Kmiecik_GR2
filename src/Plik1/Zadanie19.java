package Plik1;

public class Zadanie19 {
    public static void main(String[] args) {
        int iloscOsob = 12467;
        double procentKupujacychEnergetyki = 0.14;
        double procentLubiacychCytrynowy = 0.64;
        double iloscKupujacychEnergetyki = iloscOsob * procentKupujacychEnergetyki;
        double iloscLubiacychCytrynowy = iloscKupujacychEnergetyki * procentLubiacychCytrynowy;
        System.out.println("Ilość osób kupujących raz w tygodniu napój energetyczny: " + (int)iloscKupujacychEnergetyki +
                 " ilość osób woląca smak cytrusowy: " + (int)iloscLubiacychCytrynowy);
    }
}
