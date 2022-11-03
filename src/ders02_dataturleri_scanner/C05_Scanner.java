package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // soru 2- Kıullanicidan bir doublei birde int sayi alip
        // bunlarin toplamini ve carpimini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen ondalikli bir sayi giriniz");
        double ondalikliSayi= scan.nextDouble();

        System.out.println("lutfen bir tamSayi giriniz");
        int tamSayi=scan.nextInt();

        System.out.println("Girilen sayilarin toplami:"+ (ondalikliSayi+tamSayi));

        System.out.println("Girilen sayilerin carpimi:"+(ondalikliSayi*tamSayi));
    }


}
