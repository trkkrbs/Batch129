package advanced_practice.practice01;

import java.util.Scanner;

public class Q03_Ternary_NotSistemi {
    /*
Yuzluk not cinsinden kullanicidan alinan notu harf not sistemine ceviren bir kod yaziniz.(Ternary kullaniniz)
(90 ve ustu A, 80-89 B, 70-79 C, 60-69 D, 50-59 E, Digerleri F)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Notunuzu sayi cinsinden giriniz.");
        int notSayi = input.nextInt();

        String notHarf = notSayi>100 ? "O ile 100 arasi bir not giriniz": notSayi > 89 ?
                "A" : notSayi>79 ?
                "B" : notSayi>69 ?
                "C" : notSayi>59 ?
                "D" : notSayi>49 ?
                "E" : notSayi>-1 ?
                "F" : "O ile 100 arasi bir not giriniz";

        System.out.println("notHarf = " + notHarf);


    }


}
