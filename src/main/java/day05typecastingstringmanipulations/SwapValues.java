package day05typecastingstringmanipulations;

public class SwapValues {

    //Swap: Yer degistirmek. 1.kap:Patates 2.kap:Domates
    // ==> Swap ==> 1.kap:Domates 2.kap:Patates
    public static void main(String[] args) {
        int a = 12;
        int b = 5; //Swap'den sonra ==> a=5 ve b=12
        int temp = 0;

        System.out.println("a" + a);
        System.out.println("b" + b);

        //1.YOL:
        //I.Adim
        temp = a;

        //II.Adim
        a = b;

        //III.Adim
        b = temp;

        System.out.println("a: " + a);//5
        System.out.println("b: " + b);//12

        //2.YOL: (Interview'larda cok sik sorulur)
        int x = 12;
        int y = 5;

        x = x + y;
        // 12 + 5 = 17 ==> x=17
        y = x - y;
        // 17 - 5 = 12 ==> y=12
        x = x - y;
        // 17 - 12 = 5 ==> x=5
    }
}
