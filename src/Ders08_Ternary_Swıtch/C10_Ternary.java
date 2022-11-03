package Ders08_Ternary_Swıtch;

import java.util.Scanner;

public class C10_Ternary {
    public static void main(String[] args) {

        // - Kullanicidan bir sayi isteyin, sayiyi kontrol edip
        // 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int girilensayi= scan.nextInt();

        System.out.println(girilensayi%5==0 ? "sayi 5'in tam kati" : "5'in tam kati degil");


    }
}
