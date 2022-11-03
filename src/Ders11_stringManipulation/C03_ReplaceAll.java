package Ders11_stringManipulation;

public class C03_ReplaceAll {
    public static void main(String[] args) {

        String str= "J1ava2 G9uzel5dir8";

        // str'daki sayilari silip metni Java Guzeldir haline donusturelim

       //  str.replaceAll() sadece bir harf veya char squence'i degil genelleme
        // ile soyleyebilecegimz ortak ozellikteki tum karakterleri degistirir.

        System.out.println(str.replaceAll("\\d",""));  // Java Guzeldir

        System.out.println(str.replaceAll("\\D","")); // 12958


        String s1= "ilk urun fiyati: 1250 tl";
        String s2= "ikinci urun fiyati : 1500 tl";

        // iki urunun fiyatini toplayin
        s1= s1.replaceAll("\\D",""); // "1250"
        s2=s2.replaceAll("\\D",""); // "1500"

        System.out.println(s1+s2); // 12501500
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); // 2750


    }
}
