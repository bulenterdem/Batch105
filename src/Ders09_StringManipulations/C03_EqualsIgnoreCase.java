package Ders09_StringManipulations;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali" ;
        String str3= "ALI";

        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str3)); // false

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // true

        System.out.println(str1.equalsIgnoreCase("Ali can ")); // false

        /*
        equalsIgnoreCase  ayni metnin buyuk kucuk harf kullanilarak olusturulan
        farkli yazimlarini biribirine esit olarak kabul eder.

        ali,ALI,Ali,ALi,aLI,alI, birbiirne esittir
        a li ile ali birbirne esit degildir.

         */

    }
}
