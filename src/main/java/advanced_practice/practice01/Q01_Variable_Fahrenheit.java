package advanced_practice.practice01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Variable_Fahrenheit {
    // Fahrenheit degeri, Celcius degere ceviren kod yaziniz.
    // formul: c = (f-32)*5/9

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz.");
        double f = input.nextDouble();
        double c = (f-32)*5/9;
        System.out.println("Celcius: "+c);// 0.5555555555555556

        DecimalFormat format = new DecimalFormat("0.00");
        String formattedCelcius = format.format(c);
        System.out.println("formattedCelcius = " + formattedCelcius); // 0,56

        System.out.printf("Formatli " + "%.2f",c);// 0,56
    }
}
