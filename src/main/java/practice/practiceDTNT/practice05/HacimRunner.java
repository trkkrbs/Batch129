package practice.practiceDTNT.practice05;

public class HacimRunner {
    public static void main(String[] args) {

        //Kup, kare prizma ve dikdortgen prizmanin
        // hacmini hesaplayan bir method olustrunuz.(Method overloading kullaniniz)

        Hacim hacim = new Hacim();//burada obje olusturduk

        int kup = hacim.hacimHesapla(5);
        int karePrizma = hacim.hacimHesapla(5, 6);
        int dikdortgenPrizma = hacim.hacimHesapla(5, 6, 7);

        System.out.println("kup : " + kup);
        System.out.println("karePrizma : " + karePrizma);
        System.out.println("dikdortgenPrizma : " + dikdortgenPrizma);


    }//main
}//class
