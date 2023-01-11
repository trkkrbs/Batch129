package day11loops;

public class C04_ForLoop {
    public static void main(String[] args) {
        //Example: 1'den 100'e kadar 6 ile bolunenler haric tum sayilari ekrana yazdiriniz
        for (int i = 0; i < 101; i++) {
            if(i%6 ==0){
                continue;//bosver
            }//if body
            System.out.print(i+ " ");

        }//for body

        System.out.println();

        //Interview
        //Size verilen bir String'i ters ceviren kodu yaziniz
        String str="Mustafa";//afatsuM
        String ters="";//yeni bir container olusturduk
        for (int i = str.length()-1; i >-1 ; i--) {
            char harf=str.charAt(i);
            // ters=ters+harf;
            ters+=harf;

        }
        System.out.println(ters);

    }//main
}
