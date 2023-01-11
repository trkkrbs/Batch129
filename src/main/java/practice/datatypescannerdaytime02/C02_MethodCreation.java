package practice.datatypescannerdaytime02;

public class C02_MethodCreation {

    //Dikdortgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
    public static void main(String[] args) {

           //protocol alani
        System.out.println(dikdortgenAlani(5, 10));


    }//main'in body

    /*
           Access      static    Data       Method     (parametreler)
           Modifier              type         Adi
     */

        public static int dikdortgenAlani(int a, int b){
            //main method static oldugu icin main icindeki herseyin static olmasi gerekir
            //method adi Camel Case kucuk harf baslar sonraki her kelimenin ilk harfi buyuk olur
            return a*b;  //carpmanin sonucunu kullaniciya ver
    }


}//class'in body
