package kodlamavakti;

import java.util.Scanner;

public class KdvHesaplayanProgram {
    public static void main(String[] args) {
        double tutar, kdvliFiyat, kdv = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Urunun tutarini giriniz: ");
        tutar = input.nextDouble();
        kdvliFiyat = tutar + (tutar*kdv);
        System.out.println("Urunun KDV'li Fiyati: " + kdvliFiyat);

    }
}
