package ders02_dataturleri_scanner;

import java.util.Locale;

public class C03_NonPrimitives {
    public static void main(String[] args) {

        String isim= "Ali akpinar";

        System.out.println(isim.toUpperCase(Locale.ROOT)); //ALI AKPINAR

        System.out.println(isim.toLowerCase()); // ali akpinar

        // non-primitive data turleri deger yaninda hazır method'lar da bulundururlar.

        // bankadaki hesaplari tuttugum bir uygulama

        int birinciHesap= 100;
        int ikinciHesap= 500;
        int ucuncuHesap= 1000;

        System.out.println(ucuncuHesap);


    }
}
