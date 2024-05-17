package Plik3;

public class Zadanie12 {
    public static void main(String[] args) {
        double suma=0;
        for (int i=1,j=30 ;i<=30;i++,j--){
        suma=(double)i/j+suma;
        }
        System.out.println("suma to " + suma);
    }
}
