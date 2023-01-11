package day11forloop;

public class ForLoop03 {
    public static void main(String[] args) {
        //Example1: Size verilen bir String' i tersten yazdiriniz.
        //          "Germany" ==> ynamreG

        String s = "Java";

        String t = "";


        for (int i =s.length()-1; i>=0; i--) {
            t = t + s.charAt(i);


        }
        System.out.println(t);

        //Example2: Size verilen bir String'in "Palindrome" olup olmadigini kontrol eden kodu yaziniz
        //          civic, nalan, kucuk, 11211 ==>

        //Logic: String'i ters cevir sonra da duz hali ile ters halini karsilastir, ayni ise "Palindrome" de.
        String duz = "Civic";

        String ters = "";

        for(int i=duz.length()-1; i>=0; i--){
            ters = ters + duz.charAt(i);
        }

        if(duz.equalsIgnoreCase(ters)){
            System.out.println(duz + ": Palindrome'dur");
        }else{
            System.out.println(duz + ": Palindrome degildir");
        }



    }

}
