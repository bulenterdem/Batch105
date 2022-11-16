package Ders37_exceptions;

import java.util.Scanner;

public class C06_ThrowKeyWord {
    public static void main(String[] args) {

        // kullanicidan yasini isteyin
        // eger sifir veya negatif bir sayi girerse uyari olarak
        // iilegalArgumentException uyarisi verin
        // ancak kodunuz calismaya devam etsin


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen Yasiniz giriniz");

        int yas= scan.nextInt();

        if (yas<=0){

            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
               e.printStackTrace();
                System.out.println("Yas sifir veya negatif OLAMAZ");
            }
        }
    }
}
