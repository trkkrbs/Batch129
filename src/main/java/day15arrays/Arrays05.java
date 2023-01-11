package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {

    public static void main(String[] args) {
        //Example1: String Array elemanlarini character sayisina gore kucukten buyuge siralayiniz.
        //          ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Tom", "Ajda", "Thomas", "Michael"]
        String arr[] = {"Tom", "Ajda", "Thomas", "Michael"};

        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));
        //Example2: String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz.
        //          ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Michael", "Thomas", "Cuneyt", "Ajda", "Tom"]
        String brr[] = {"Michael", "Thomas", "Cuneyt", "Ajda", "Tom"};
        System.out.println(Arrays.toString(brr));
        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));//["Michael", "Thomas", "Cuneyt", "Ajda", "Tom"]

        //Example3: String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz.
        //          Ayni character sayisinda olanlari da alfabetik siraya koyunuz.
        //          ["Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin", "Cuneyt", "Cem"]
        //          ["Gabriel", "Michael", "Reyhane", "Thomas", "Cuneyt", "Ajda", "Ali", "Cem", "Cin", "Tom"]

        String crr [] = {"Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin", "Cuneyt", "Cem"};
        System.out.println(Arrays.toString(crr));

        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));

    }
}
