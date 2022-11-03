package Ders18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturma {

    public static void main(String[] args) {
        // Soru 5- Kullanicidan array’in boyutunu ve
        // elementlerini alip array’i olusturan ve
        // bize donduren bir method olusturun.

        int []KullaniciArrayi=arrayOlustur();
        System.out.print(Arrays.toString(KullaniciArrayi));

    }

    public static int[]arrayOlustur(){

        Scanner scan=new Scanner(System.in);
        System.out.println("olusturulacak array'in boyutunu giriniz");

        int length= scan.nextInt();

        int [] KullaniciArrayi=new int[length];

        for (int i = 0; i <length; i++) {

            System.out.println("array'e eklenecek bir sayi giriniz");
            KullaniciArrayi[i]= scan.nextInt();

        }
        return KullaniciArrayi;


    }
}
