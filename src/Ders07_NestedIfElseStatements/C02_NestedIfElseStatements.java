package Ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C02_NestedIfElseStatements {
    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,  yoksa %15 indirim yapin
        //  Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        int urunAdedi=30;
        boolean kartvarmi=false;
        double Listefiyati=12.5;
        double toplamFiyat=0;

        if (kartvarmi && urunAdedi>10){
            toplamFiyat=urunAdedi*Listefiyati*(0.8);

            System.out.println("%20 indirimli fiyat: "+ toplamFiyat);
        } else if (kartvarmi && urunAdedi<10 && urunAdedi>0) {
            toplamFiyat=urunAdedi*Listefiyati*(0.85);
            System.out.println("%15 indirimli fiyat: "+ toplamFiyat);

        } else if (!kartvarmi && urunAdedi>10) {
            toplamFiyat=urunAdedi*Listefiyati*(0.85);
            System.out.println("%15 indirimli fiyat: "+ toplamFiyat);

        } else if (!kartvarmi && urunAdedi<10 && urunAdedi>0) {
            toplamFiyat=urunAdedi*Listefiyati*(0.9);
            System.out.println("%10 indirimli fiyat: "+ toplamFiyat);

        }


    }




    }

