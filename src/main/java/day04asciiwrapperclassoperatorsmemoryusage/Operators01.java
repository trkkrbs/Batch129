package day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {

    /*
        1) +, -, *, / islemleri Java'da matematik'te kullanildigi gibi kullanilir.
        Note 1: int / int ==> int olur
        Note 2: double + int ==> double olur. Cunku; Java'da matematiksel islemlerde farkli data type'lari kullanilirsa sonuc buyuk data type' inda olur.

        2)java'da "logical operatorlar"lar vardir.
        AND ve OR islemleri "logical operator" lardir.
           i)   AND isleminden (&&) true alabilmek icin her sey true olmalidir.
                AND islemi "perfectionist" tir.
                AND isleminde bir tane false sonucu false yapar.

           ii)  OR isleminde (||) bir tane true sonucu true yapmaya yeter.
                OR isleminde sonucun false olmasi icin her sey false olmalidir.
                OR islemi "polyanna" gibidir.

           iii) NOT Operatoru (!) true olani false, false olani true yapar.
            !true = false
            !false = true
            !!true = true

         3)Comparison(Karsilastirma) Operators
              <, >, <=, >=, ==, !=
            Note: Karsilastirma operatorlerini kullandiginizda kesinlikle boolean(true veya false) alirsiniz.

            Note: Biz AND islemi icin "&&" kullaniriz ama "&" kullanim da gecerlidir.
                  Farklari nedir?

            "&&" kullanim ilk ifade "false" oldugunda digerlerini kontrol etmez
            dolayisiyla hizli calisir.
            "&" kullanim ilk ifade ne olursa olsun digerlerini kontrol eder dolayisiyla
            yavas calisir.
            Bu yuzden biz hep "&&" kullaniriz.

     */

    public static void main(String[] args) {

        boolean first  = 3<5;
        boolean second = 2+3 != 5;
        boolean third  = 2+3*5 >= 19;

        System.out.println(first + " - " + second + " - " + third);
        System.out.println(first & second);
        System.out.println(first || second || third);
    }
}