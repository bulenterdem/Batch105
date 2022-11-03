package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        // soru 3- kullanicidan ismini, soyismini ve yasini alip, asagıdaki formatta yazdirin

        // Isminiz: John
        // Soyisminiz: Doe
        // Yasiniz: 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        // String icin kullanilabilen next() sadece ilk space'e kadar olan kismi alir.
        //                            nextLine() ise o satırda yazilan tum bilgiyi alir.

        String isim= scan.nextLine();

        System.out.println("lutfen soyisminiz giriniz");

        String soyisim= scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        System.out.println("isminiz:"+isim +"\nsoyisminiz:"+soyisim+"\nyasiniz:"+yas+"\nKaydiniz basariyla tamamlanmıstir");


    }
}
