package advanced_practice.practice01;

import java.util.Scanner;

public class Q04_Regex_AdSoyad {
    /*
    Kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz,
    ad ayri soyad ayri sekilde ekrana yazdiriniz.
    Orn:
    Ad: Ali
    Soyad: Can
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ad ve soyadinizi arada bir bosluk olacak sekilde giriniz.");
        String adSoyad = input.nextLine().replaceAll("[^a-zA-Z ]","").replaceAll("\\s+", " ").trim().toLowerCase();
        System.out.println("adSoyad = " + adSoyad);
        String ad = adSoyad.split(" ")[0];
        String soyAd = adSoyad.split(" ")[1];
        String adIlkHarf= ad.substring(0,1).toUpperCase();
        String soyadIlkHarf = soyAd.substring(0,1).toUpperCase();

        String adFormat = adIlkHarf = adIlkHarf + ad.substring(1);
        String soyadFormat = soyadIlkHarf + soyAd.substring(1);

        System.out.println("Ad: " + adFormat);
        System.out.println("Soyad: " + soyadFormat);


    }
}
