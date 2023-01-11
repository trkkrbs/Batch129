package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        //Example 1:Time'i formatlayiniz
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);// 21:39:18.696787

        //hh==>12 lik saat sistemini kullanir - HH==>24 luk saat sistemini kullanir
        //hh kullandiginizda AM veya PM demelisiniz, bunu denemek icin "a" yazmaniz yeterlidir. Yani; "hh:mm a"

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH-mm:ss a");

        System.out.println(dtf.format(myTime));// 21-49:04 ÖS

    }
}
