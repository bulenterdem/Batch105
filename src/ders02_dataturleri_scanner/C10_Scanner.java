package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {

        // Kullanicidan daireni yaricapini alip, alanini hesaplayinve yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen dairenin yaricapini giriniz");

        double yaricap= scan.nextDouble();


        double daireAlani=3.14*yaricap*yaricap;

        System.out.println("Dairenin alani:"+ daireAlani);


    }
}
