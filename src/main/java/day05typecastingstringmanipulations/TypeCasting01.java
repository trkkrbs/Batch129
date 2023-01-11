package day05typecastingstringmanipulations;

public class TypeCasting01 {

    /*
       Numeric primitive data type'larinin birbirine donusturulmesine "Type Casting" denir.
       Numeric(Sayisal) Data Type'lar byte - short - int - long - float - double

       Note1: Kucuk data type'larini buyuk data type'larina cevirmeyi Java otomatik olarak yapabilir.
              Bu isleme "Autowidening"(Otomatik Genisletme) denir.

       Note2: Buyuk data type'larini kucuk data type'larina cevirmek riskli bir istir,
              Java bu riskli isi otomatik olarak yapmaz.Bu islemi kod yazan'lar yapar.
              Bu isleme "ExplicitNarrowing"(Aciktan daraltma) denir.

     */

    public static void main(String[] args) {

        //byte data type'ini int data type'ina ceviriniz
        byte age = 13;
        int ageInt = age;//AutoWidening

        //long data type'ini short data type'ina cevirelim
        long weight = 234;
        short weightShort = (short)weight;//Explicit Narrowing

        //int data type'ini float data type'ina ceviriniz
        int population = 700000;
        System.out.println(population);

        float populationFloat = population;
        System.out.println(populationFloat);

        //double data type'ini short data type'ina ceviriniz
        double number = 12.934;
        System.out.println(number);

        short numberShort = (short)number;
        System.out.println(numberShort);//12

        //Dikkat!
        //Donusum yaptiginiz sayi(2600, donuceginiz data ype'inin sinirlari disinda ise,
        // Java kullandiginiz sayi ile "mod" islemi yapar ve mod isleminin sonucu
        // sizin yeni degeriniz olur.

        //Example1
        short num = 260;
        System.out.println(num);//260

        byte numByte = (byte)num;
        System.out.println(numByte);//4

        //Example2
        short n = 255;
        System.out.println(n);//1023

        byte nbyte = (byte)n;
        System.out.println(nbyte);//-1

    }
}
