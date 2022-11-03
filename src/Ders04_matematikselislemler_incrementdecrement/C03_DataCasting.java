package Ders04_matematikselislemler_incrementdecrement;

import java.util.Scanner;

public class C03_DataCasting {

    public static void main(String[] args) {

        // kullanicidan iki int deger alip
        // bumları birbirine bolun ve sonucu double olarak yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen iki tam sayi giriniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        System.out.println(sayi1/sayi2);

        double ondalikliSonuc= (double)(sayi1/sayi2); //  (double)(3) ==> 3.0


        double dogruSonuc=(double)sayi1 / sayi2; // double / int ==> genis olana gore sonuc verir

        System.out.println(dogruSonuc);






    }
}
