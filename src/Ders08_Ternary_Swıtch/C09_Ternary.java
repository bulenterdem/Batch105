package Ders08_Ternary_Swıtch;

import java.util.Scanner;

public class C09_Ternary {
    public static void main(String[] args) {
        // Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");

        char harf= scan.next().charAt(0);

        System.out.println( harf>='a' && harf<='z' ? (char) (harf-32): harf );
    }
}
