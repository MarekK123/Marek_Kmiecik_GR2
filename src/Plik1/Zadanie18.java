package Plik1;

public class Zadanie18 {
    public static void main(String[] args) {
        int iloscAkcji = 600;
        double cenaZaAkcje = 21.77;
        double prowizja = 0.02;
        double cenaBezProwizji = iloscAkcji * cenaZaAkcje;
        double wielkoscProwizji = cenaBezProwizji * prowizja;
        double calkowitaKwota = cenaBezProwizji + wielkoscProwizji;
        System.out.println("Cena bez prowizji: " + cenaBezProwizji + " wielkość prowizji: " + wielkoscProwizji +
                 " całkowita kwota: " + calkowitaKwota);
    }
}
