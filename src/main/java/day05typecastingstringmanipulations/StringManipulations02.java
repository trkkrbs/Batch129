package day05typecastingstringmanipulations;

import java.sql.SQLOutput;

public class StringManipulations02 {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Example1 "s" String'inin "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Example2 "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.
        String s1 = s.replace("money", "dollar");
        System.out.println(s1);//Learn Java earn dollar

        //Example3 "s" String'indeki "earn" kelimesini "win" kelimesine ceviriniz.
        String s2 = s.replace("earn", "money");
        System.out.println(s2);//Learn Java earn dollar

        //Example4 "s" String'indeki "a" harflerini "*" a ceviriniz.
        //Note: replace() method'unda coklu character ile calisirsaniz mecbur cift tirnak kullanacaksiniz.
        //Ama tek character ile calisirsaniz cift tirnak veya tek tirnak kullanabilirsiniz.
        String s3 = s.replace('a', '*');
        System.out.println(s3);//Le*rn J*v* e*rn money

        //Note: Ama ya ikisi de cift tirnak olmalidir, ya da ikisi de tek tirnak olmalidir.
        //Example5 "s" String'indeki "n" harflerini "XXX" a ceviriniz.
        String s4 = s.replace("n", "XXX");
        System.out.println(s4);

        //Example6 "s" String'indeki tum "e" harflerini siliniz.
        //Note: "Hicbir sey" char data type'inda yok bu yuzden replace() method'u kullanarak silme islemi yaparsaniz mutlaka cift tirnak kullaniniz.
        String s5 = s.replace("e", "");
        System.out.println(s5);//Larn Java arn mony

        String t = "ali 13 yasindadir!...";

        //Example7 "t" String'indeki tum rakamlari (0, 1, 2, 3, 4, 5, 6, 7, 8, 9) "*" a ceviriniz.
        //Note: Bir grup data'yi degistirmek icin replaceAll() kullanilir.
        //Note: Bir grup data'yi ifade etmek icin "Regular Expressions" (Regex) kullaniriz.
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);

        /*
           Meshur Regex'ler
           1) Tum rakamlar ==> [0-9]
           2) Tum kucuk harfler ==> [a-z]
           3) Tum buyuk harfler ==> [A-Z]
           4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
           5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
           6) Tum noktalama isaretleri ==> \\p{Punct}
           7) Tum sesli harfler [aeiouAEIOU]
              x, q, w hargleri ==> [xqw]
           8) Kucuk harflerden farkli tum character'ler ==>[^a-z]
           9) Tum harflerden farkli tum character'ler ==> [^a-zA-Z]
           10) Space disindaki tum character'ler ==> \\S

         */

        //Example8 "t" String'indeki tum rakamlari ve harfleri '!" e ceviriniz.
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);

        //Example9 "t" String'indeki tum sesli harfleri '?" e ceviriniz.
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);//

        //Example10 "t" String'indeki kucuk harfler disindaki tum character'leri "<>" ceviriniz
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);

        //Example11 "t" String'indeki tum harfler disindaki tum character'leri "+" ceviriniz
        String t5 =t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);

        //Example12 "t" String'indeki space'ler disindaki tum character'leri "+" ceviriniz
        String t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6);

        //Example13 "t" String'indeki sesli harfler disindaki tum character'leri "&" ceviriniz.
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);
    }
}