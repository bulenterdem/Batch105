package Ders03_datacastingWrapperClass;

public class C05_WrapperClass {
    public static void main(String[] args) {

        int sayi=10;
        String str="java cok guzel";

        /* primitive data turleri sadece deger barındırırlar,hazir method'lari yoktur

        Java'ya talepler sonucunda primitive data turleri ile bazi hazir methodlarin kullanilabilmesi
        icin Wrapper class'lar olusturulmustur.

        Wrapper class'lar primitive dta turlerindeki degerleri alirlar ancak method'lari da vardir
         */

        char krk='b';

        Character krkWrapper='c';

        System.out.println(Character.isLetter('5'));  // false

        System.out.println(Character.isDigit('7'));  // true

        String str1="123";
        String str2="12";

        // str1 ve str2'nin degerlerini matematiksel olarak toplayin

        System.out.println(str1+str2);  //12312

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));// 135

        // Integer.parselInteger(str) icine yazilan str rakamlardan olusuyorsa str'i int'a cevirir
        // ancak bir karakter bile rakam degilse hata verir

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
