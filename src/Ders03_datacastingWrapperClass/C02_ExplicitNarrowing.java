package Ders03_datacastingWrapperClass;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi= 20;

        /* genis data turundki bir degeri dar data turundeki bir variable'a
        atamak isterseniz java sorumlulugu almanizi ister

        bu sorumlulugu almak icin cast edecegimiz degeréin onune () icersinde ,
        cast etmek istedigimiz data turu yazilir

        ancak bu durumda data kayiplari ( double'den virgulden sonraso silinir)
        veya baskalasim olabilir( int'i byte cevirirsek tekrar tekrar basa doner)
         */
           short sh=(short)sayi;

        System.out.println(sh); //20

        double dbl= 23.5;

        int say= (int) dbl;

        System.out.println(say); //23

        say=256; // int

        byte byt= (byte)say;

        System.out.println(byt);


    }
}
