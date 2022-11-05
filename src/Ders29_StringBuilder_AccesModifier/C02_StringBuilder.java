package Ders29_StringBuilder_AccesModifier;

public class C02_StringBuilder {
    public static void main(String[] args) {
         StringBuilder sb1=new StringBuilder("java candir");

        System.out.println(sb1.reverse()); // ridnac avaj

        System.out.println("tersini yazdirdiktan sonra sb1: "+sb1); // tersini yazdirdiktan sonra sb1: ridnac avaj

        sb1.insert(0,".");

        System.out.println(sb1); //.ridnac avaj

        sb1.reverse();

        StringBuilder sb2= new StringBuilder("java candir.");
        String str= "java candir.";

        System.out.println(sb1==sb2);// false    icerik ayni olsa bile false verir

        System.out.println(sb1==sb1); // true     sadece sb kendisi ile karsilastirirsa true verir

        // System.out.println(sb1=str); farkli iki data turu == ile karsilastirilamaz

        System.out.println(sb1.equals(sb2)); // false  icerik ayni olsa bile false verir

        System.out.println(sb1.equals(sb1)); // true  sadece sb kendisi ile karsilastirirsa true verir

        System.out.println(sb1.equals(str)); // false  CTE vermez ama sonuc herzaman false verir

        System.out.println(sb1.compareTo(sb2)); // 0

        StringBuilder sb3= new StringBuilder("hava kandir");

        System.out.println(sb1.compareTo(sb3)); // 2

        /*
        compareTo sadece tamamen ayni mi yoksa farkli mi sorusunun cevabini verir
        tamamne ayni ise ==> 0 doner

        farklilik varsa ==> ilk farkli harfi buldugunda farkli harflerin arasinda kac harf oldugunu verir
         */


    }
}
