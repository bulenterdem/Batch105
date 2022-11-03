package Ders08_Ternary_Swıtch;

import java.util.Scanner;

public class C07_SwıtchCase {
    public static void main(String[] args) {

        // j : Java
        // D : Develeopment
        // K : Kit

        // kullanicidan bir harf alin
        // alinan harf J,D,K'dan biri ise yukaridaki kelimeleri yazdirin
        // bu harflerden biri degilse "gecesiz harf yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");

        char harf= scan.next().charAt(0);

        switch (harf){

            case 'J':
            case 'j':
                System.out.println("Java");
                break;
            case 'D':
            case 'd':
                System.out.println("Develepment");
                break;
            case 'K':
            case 'k':
                System.out.println("Kit");
                break;
            default:
                System.out.println("Gecersiz harf");

        }



    }
}
