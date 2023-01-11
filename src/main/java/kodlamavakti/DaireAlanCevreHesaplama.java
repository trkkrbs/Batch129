package kodlamavakti;

import java.util.Scanner;

public class DaireAlanCevreHesaplama {
    public static void main(String[] args) {
        int r;
        double alan,cevre, pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Daire yaricapini giriniz: \n");
        r = input.nextInt();
        alan = pi*r*r;
        cevre = 2*pi*r;
        System.out.println("Dairenin alani: " + alan);
        System.out.println("Dairenin cevresi: " + cevre);
    }
}
