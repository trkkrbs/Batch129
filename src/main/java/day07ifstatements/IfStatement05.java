package day07ifstatements;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {
        //Example5: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ay ismi giriniz...");
        String monthName = input.next();

        if (monthName.equals("January")){
            System.out.println("1. ay");
        }
        else if (monthName.equals("February")){
            System.out.println("2. ay");
        }
        else if (monthName.equals("March")){
            System.out.println("3. ay");
        }
        else if (monthName.equals("April")){
            System.out.println("4. ay");
        }
        else if (monthName.equals("May")){
            System.out.println("5. ay");
        }else if (monthName.equals("June")){
            System.out.println("6. ay");
        }
        else if (monthName.equals("July")){
            System.out.println("7. ay");
        }else if (monthName.equals("August")){
            System.out.println("8. ay");
        }
        else if (monthName.equals("September")) {
            System.out.println("9. ay");
        }
        else if (monthName.equals("October")) {
            System.out.println("10. ay");
        }
        else if (monthName.equals("November")) {
            System.out.println("11. ay");
        }
        else if (monthName.equals("December")) {
            System.out.println("12. ay");
        }
        else {
            System.out.println("Invalid valid month name...");
        }

        /*
          Stack Memory'de
          1)Primitive Data'lar depolanir
          2)Non-primitive'lerin adresleri depolanir.(Reference)
          Heap Memory'de Non-primitive'ler depolanir.
         */
        /*

           Note: String'lerin esitliklerini kontrol ederken  "==" yerine "equals()" kullaniriz.
                 Niye?
                 Cunku; "==" sembolu iki String' i karsilastirirken hem adreslerine bakar,
                 ikisi de ayni ise siz String'ler esittr der ama biz code yazarken genellikle String'lerin
                 adresleri ile degil degerleri ile ilgileniriz.Bu yuzden String karsilastirmalarinda  "==" kullanmayiz.

                 "equals()" methodu ise iki String'i karsilastirirken sadece degerlerine bakar, degerler ayni ise
                 bu iki String esittir der degerler farkli ise bu iki String farklidir der ki bu bizim kod yazarken
                 ihtiyac duydugumuz seydir.


         */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");
        String m = "Tom";

        System.out.println(s==t);// false cunku; adres'ler ve degerler farkli
        System.out.println(s.equals(t));//false cunku degerler farkli

        System.out.println(s==t);// false cunku; adres'ler farkli
        System.out.println(s.equals(t));//true cunku equals() sadece degerlere bakar. "s" ve "r" nin degerleri ayni oldugundan true verir.

        System.out.println(s==m);//true

    }






}
