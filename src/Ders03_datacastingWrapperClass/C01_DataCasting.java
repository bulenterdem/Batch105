package Ders03_datacastingWrapperClass;

public class C01_DataCasting {
    public static void main(String[] args) {
        /* bazi data turleri asla birbirne cast edilmez

         */

         // String str=20;
        // boolean mutluMu="true";

        // int a=true;

        double s=20;

        int sayi= 15;

        long ln= sayi; // esitligin sol tarafi long, sa tarafi yani deger int
                        // java itiraz etmedi

        /* dar data turunden bır degerı genıs data
        turundenki variable'a atama yaparsanız java bunu
        yapar
         */

        short sh=23;
        int a=sh;
        long lng= sh;

        float fl=lng;

        /* ama tersini yapmak isterseniz yani buyuk data turundeki
        bir degeri kucuk bir data turundeki variable'a atama isterseniz
        java kabul etmez
         */

        double dbl=20;
              //  a=dbl;
              //  short abc= dbl;


    }
}
