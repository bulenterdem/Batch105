package Ders12_forLoops;

public class C05_DikkatEdilecekler {

    public static void main(String[] args) {

        /* for (int i = 0; i >-10 ; i++) {

        }
        sonsuz loop
         */


        // ilk deger icin sarti true olmuyorsa for body'si devreye girmez
        for (int i = 0; i >10 ; i++) {

            System.out.println(i);

        }


        // bir loopu sonunu beklemeden bitirmek istersek

        // kullanicinin verdigi bir sayinin asal olup olmadigini bulun
        // kendisi ve 1 sayisi disinda hic bir sayiya bolunmez

        int sayi=130;
        boolean bayrak=true;

        for (int i = 2; i <=sayi-1 ; i++) {

            if (sayi % i==0){
                // askimiz bitti
                bayrak=false;
                break;
            }
        }


        System.out.println(bayrak);


        if (bayrak){
            System.out.println("asal sayi");
        }else {
            System.out.println("asal sayi degil");
        }
    }


}
