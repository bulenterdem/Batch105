package ders35_exceptions;

public class C02_ArithmeticExpection {

    public static void main(String[] args) {

        // verilen iki tam sayiyi birbirine bolup sonucun tam sayi kismini yazdirin

        int sayi1=20;
        int sayi2=0;

        try {
            // riskli oldugunu ongordugumuz kodlar
            System.out.println(sayi1/sayi2);
            System.out.println("bakalim bu satir calisacakmi");
        } catch (Exception e) {

            // catch (Exception e) onfordugumuz risk

            System.out.println("sayi sifira bolunemez");

            // catch (0'den sonraki {} catch blogu denir
            // beklenen risk gerceklesirse calisacak kodlar

        }

        /*
        bazi exception'lar if else ile handle edilebilir ancak
        yum exception2lar icin if else yeterli olmaz
         */

    }
}
