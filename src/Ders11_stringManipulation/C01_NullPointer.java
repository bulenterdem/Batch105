package Ders11_stringManipulation;

import java.util.Locale;

public class C01_NullPointer {
    public static void main(String[] args) {

        String str1= ""; // str1 'e deger atanmistir

        System.out.println(str1); // hiclik uazdirir
        System.out.println(str1.concat("java")); // java


        String str2;

        // str2 olusturuldu ama deger atanmadi

        // System.out.println(str2);  // str2 deger atanmadigi icin yazdırırlmaz

       //  System.out.println(str2.concat("java"));  // str2 deger atanmadigi icin methodla yazdırırlmaz

        str2="java candir";

        System.out.println(str2); // java candir

        System.out.println(str2.concat("."));  // java candir.

        String str3= null ;  // str3'e deger atanmamistir.
        //  null pointer ile javaya deger atamadigimizin farkinda oldugumuuzu soyluyoruz.

        System.out.println(str3);

      //  System.out.println(str3.concat("java")); // NullPointerException

        System.out.println(str3+"java");

        // System.out.println(str3.toUpperCase(Locale.ROOT)); // NullPointerException


    }
}
