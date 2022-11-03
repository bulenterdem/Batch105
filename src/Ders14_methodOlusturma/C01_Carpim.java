package Ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {

    // main method icersinde kullanicidan iki sayi alin
    // bu iki sayiyi parametre olarak kabul edip carpimlarini
    // main methoda bize donduren
    // bir method olusturun

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen iki sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println(carpimMethodu(sayi1, sayi2));

        double carpimsonucu =carpimMethodu(6,2);

    }

    public static double carpimMethodu(double sayi1, double sayi2){
        System.out.println("carpim methodu calisti");

        return sayi1*sayi2;

    }
}
