package day02datatypesmethodcreation;

public class Alistirma {

    //Dikdortgen'in alanini hesaplayan methodu olusturunuz ve kullaniniz
    // Dikdortgen'in cevresini hesaplayan methodu olusturunuz ve kullaniniz
    //Daire'nin alanini hesaplayan methodu olusturunuz ve kullaniniz
    //Daire'nin cevresini hesaplayan methodu olusturunuz ve kullaniniz.

    public static void main(String[] args) {

        int areaRectangle = diktortgenAlan(8, 4);
        System.out.println(areaRectangle);

        int perimeterRectangle = dikdortgenCevre(8, 4);
        System.out.println(perimeterRectangle);

        double areaCircle = daireAlan(4);
        System.out.println(areaCircle);

        double perimeterCircle = daireCevre(4);
        System.out.println(perimeterCircle);
    }

    public static int diktortgenAlan(int a, int b){
        return(a*b);
    }

    public static int dikdortgenCevre(int a, int b) {
        return (a + b) * 2;
    }

    public static double daireAlan(double r){
        double pi = 3.14;
        return pi*r*r;
    }

    public static double daireCevre(double r){
        double pi = 3.14;
        return 2*pi*r;
    }
}