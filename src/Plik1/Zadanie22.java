package Plik1;

public class
Zadanie22 {
    public static void main(String[] args) {
        int liczbaAkcji = 1000;
        double cenaAkcjiBezProwizji = 32.87;
        double prowizja = 0.02;
        double prowizjaPrzyKupnie = prowizja * cenaAkcjiBezProwizji;
        double zyskBrokera = liczbaAkcji * prowizjaPrzyKupnie;
        double kupno = liczbaAkcji * cenaAkcjiBezProwizji + zyskBrokera;
        double cenaSprzedazyAkcjiBezProwizji = 33.92;
        double prowizjaPrzySprzedazy = cenaSprzedazyAkcjiBezProwizji * prowizja;
        double zyskBrokeraPrzySprzedazy = liczbaAkcji * prowizjaPrzySprzedazy;

        double sprzedaz = liczbaAkcji * cenaSprzedazyAkcjiBezProwizji - zyskBrokeraPrzySprzedazy;

        System.out.println("Kwota zapłacona za akcje: " + kupno);
        System.out.println("Wartość prowizji przy kupnie: " + zyskBrokera);
        System.out.println("Kwota otrzymana za sprzedaż: " + sprzedaz);
        System.out.println("Kwota prowizji przy sprzedaży: " + zyskBrokeraPrzySprzedazy);
        double zysk = sprzedaz - kupno;
        System.out.println("Zysk: " + zysk);
    }
}
