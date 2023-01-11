package day12forloopwhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Example1: 3'den 10'a kadar tamsayilari console'a yazdiriniz.

        //1.YOL:
        for (int i =3; i<11; i++) {
            System.out.print(i+ "");
        }

        System.out.println();

        //2.YOL: while-loop
        int i=3;
        while(i<11){
            System.out.print(i + "");
            i++;
        }

        System.out.println();

        //Example2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz
        int k=23;
        while(k>11) {
            if (k%2==0){
            System.out.print(k + " ");
        }
            k--;
        }

        System.out.println();
        //Example3: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz.

        //1.YOL:
        int num = -578;
        num = Math.abs(num);
        int sum = 0;
        while(num>0){
         sum = sum + num%10;
         num /=10;
        }
        System.out.println(sum);

//2.Yol: for-loop
        int a = 6841;
        int toplam = 0;

        for(int m = a; m>0; m/=10){
            toplam = toplam + m%10;
        }
        System.out.println(toplam);//19

    }
}
