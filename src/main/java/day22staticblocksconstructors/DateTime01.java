package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {

        Date myDate = new Date();

        System.out.println(myDate);//Sat Jan 07 23:26:34 EET 2023
        System.out.println(myDate.getTime());// 1673123334488 ==> 1 Ocak 1970 den su ana kadar ki mili saniye miktari

        //Icinde bulundugumuz an nasil alinir?
        System.out.println(LocalDate.now());//2023-01-07

        System.out.println(LocalTime.now());// 23:34:36.422825

        System.out.println(LocalDateTime.now());// 2023-01-07T23:37:24.292310


        //Dunyanin herhangi bir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Vienna")));// 2023-01-08T05:44:33.514794

        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));// 2023-01-08T05:49:43.155292

        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow")));// 2023-01-07T23:49:43.156111

        //Ileriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));// 2030-07-12

        //Geriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));// 2018-10-05

        //Ileriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3));// 02:56:11.732646

        //Geriki bir tarihe nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));// 23:13:10.001200

        //Zaman'da belli bir bolumu nasil aliriz?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute()); // 0:4

        //Tarih'de belli bir bolumu nasil anlariz?
        System.out.println(LocalDate.now().getMonthValue() + ":" + LocalDate.now().getDayOfMonth()); // 1:8

        //Iki tarih nasil karsilastirilir?
        //02/13/2005 - 03/01/2007
        boolean result = LocalDate.of(2005, 02, 13).isAfter(LocalDate.of(2007,03,01));
        System.out.println(result);// false

        //Tarih'lerin formatlari nasil degistirilir?
        //M-->Tek rakamla ay no'sunu yazar - MM-->Iki rakamla ay no'sunu yazar
        //MMM-->Ay isminin ilk uc harfini yazar - MMMM-->Ay isminin tamamini yazar

        //d-->Tek rakamla gun no'sunu yazar - dd-->Iki rakamla gun no'sunu yazar
        //yy-->Yilin son iki rakamini yazar - yyyy--> Yilin tamamini yazar
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(LocalDate.now()));// 08/01/2023

    }

}
