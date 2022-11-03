package Ders09_StringManipulations;

public class C05_Lengtth {
    public static void main(String[] args) {

        String str = "Uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.length()); // 34 son karakteri yazdirir

        System.out.println(str.charAt(0)); // u

        System.out.println(str.length() - 1); // son karakteri elde etmek icin kullanilir //33

        // sondan 3.karakteri yazdirin

         System.out.println(str.charAt(str.length()-1)); // u

        System.out.println(str.charAt(str.length()-3)); // g



    }
}
