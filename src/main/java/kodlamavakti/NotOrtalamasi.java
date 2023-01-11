package kodlamavakti;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int quiz, vize, ffinal;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.println("Quiz Notunu Giriniz: ");
        quiz = input.nextInt();
        System.out.println("Vize Notunu Giriniz: ");
        vize = input.nextInt();
        System.out.println("Final Notunu Giriniz: ");
        ffinal = input.nextInt();

        ortalama = (quiz*0.2) + (vize*0.35) + (ffinal*0.45);
        System.out.println("Not Ortalamaniz: " + ortalama);
        String sonuc = (ortalama >=50) ? "Gectiniz" : "Kaldiniz" ;
        System.out.println(sonuc);
    }

}
