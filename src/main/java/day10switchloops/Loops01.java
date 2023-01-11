package day10switchloops;

public class Loops01 {

    public static void main(String[] args) {

        //Example1: Ekrana 5 kere "Hi" yazdiriniz.

        //1.YOL:
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.YOL:
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop" lar kullanilir.
        //Dort tane loop var; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //i)for-loop
        //  Baslangic degeri   Loop'un calisma sarti Increment/Decrement
        for (int i = 1      ;  i<6                 ;   i++                    ) {
            System.out.println("Hi");
        }

        //Example2: 11'den 44'e kadar tum tamsayilari ekrana yazdiran kodu yaziniz.

        for(int i=11; i<15;           i++){

            System.out.println(i);
        }

        //Example3: 40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kody yaziniz.

        for(int i=40; i>22;     i-- ) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Example4: 40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kody yaziniz.

        for(int i=18; i<57;     i++){
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }


    }


}
