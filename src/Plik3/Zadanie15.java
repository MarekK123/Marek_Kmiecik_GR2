package Plik3;

public class Zadanie15 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print("#");
                for (int l = i; l>0; l--) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}