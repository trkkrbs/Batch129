package kodlamavakti;

public class IfveElseBloklari {
    public static void main(String[] args) {
        int a = 50;
        int b = 20;
        int c = 20;

        /*if(a==b){
            System.out.println("A ve B sayilari birbirine esittir:");
        }
        else {
            System.out.println("A ve B sayilari birbirine esit degil :");
        }
        */

        /*
        if (b==c) {
            System.out.println("B ve C esittir.");
        } else if (a>c) {
            System.out.println("A buyuktur C'den.");
        } else {
            System.out.println("B ve C esit degil");
        }
        */

        if((a<c) && (a<b)){
            System.out.println("A en kucuk sayidir.");
        }
        else if ((c<a) && (c<b)) {
            System.out.println("C en kucuk sayidir.");
        }else {
            System.out.println("B en kucuk sayidir.");
        }

        if (a==10){
            System.out.println("A 10' a esittir.");
        }

    }
}
