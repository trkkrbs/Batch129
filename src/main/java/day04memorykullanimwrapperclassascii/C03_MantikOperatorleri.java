package day04memorykullanimwrapperclassascii;

public class C03_MantikOperatorleri {

    //10< sayi Mantikoperatoru sayi<20;
    //== esittir icin cift ==kullanilir = tek esittir atama (assignment) yapar
    /*
    Java uclu karsilastirma kabul etmez.
    Ikili karsilastirmalar yapip Mantik Operatorleriyle birlestirmeliyiz



    && == ve and // or operatoru veya demek
    &&


       Cay ve Limon
        +      &&       +         = true
        +      &&       -         = false
        -      &&       +         = false
        -      &&       -         = false

     && ile &
     &&'de boolean sonucta bir tane false bulunca durur
     & 'de ise tum satiri tarar sonra durur
     bu da && ' ni & ' den daha huzli calismasini saglar



     || veya operatoru Polayanacidir.En ufak bir pozitiflikten true doner

       Cay veya Limon
        +      ||       +         = true
        +      ||       -         = true
        -      ||       +         = true
        -      ||      -          = false


     */
    public static void main(String[] args) {
        System.out.println(5+2 == 8);//false

        boolean sonuc1 = 5>4 && 7<9 && 6+3 == 9 && 5+2 !=8;
        System.out.println(sonuc1);//true

        boolean sonuc2= 5>4 && 7>9 && 6+3 == 9 && 5+2 ==7;
        System.out.println(sonuc2);//false

        int sayi1= 15;
        System.out.println(10 < sayi1 && sayi1 < 20);//true

        int sayi2 = 5;
        System.out.println(sayi2<10 || sayi2 > 20);//true

    }

}
