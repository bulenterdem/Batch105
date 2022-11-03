package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        // kullanicidan iki sayi alip, ucunu bir degisken kullanmadan ikisinin
        // degerlerini degistirin

        System.out.println("Lutfen birinci sayiyi giriniz");

        double Sayi1= scan.nextDouble();

        System.out.println("lufen ikinci sayiyi giriniz");

        double Sayi2= scan.nextDouble();

        Sayi1=Sayi2+Sayi1;
        Sayi2=Sayi1-Sayi2;
        Sayi1=Sayi1-Sayi2;

        System.out.println("sayilar yer degistirdi:"+ "\n1.sayi: " + Sayi1 + "\n2.sayi:" + Sayi2);



    }
}
