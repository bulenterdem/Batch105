package Ders13_NestedForLoop_methodolusturma;

import java.util.Scanner;

public class C10_Method {
    public static void main(String[] args) {
        /*
        Kullanicidan main method icinde pozitif bir tamsayi alin.
        Girilen sayinin asal sayi olup olmadigini kontrol edip,
          sonuc olarak “asal sayi” veya “asal sayi degil”
          sonuclarini donduren bir method olusturun.
         */
        asalsayibulyaz();
    }

    public static void asalsayibulyaz(){

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");

        ;
        double sayi= scan.nextDouble();
        boolean bayrak=true;

        for (int i = 2; i <=sayi-1 ; i++) {

            if (sayi % i==0){

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



