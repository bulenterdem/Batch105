package Ders06_IfElseStatements;

import java.util.Scanner;

public class C13_IfElseStatements {
    public static void main(String[] args) {
        // Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
        // istedigi birim metre veya santimetre ise cevirip yazdirin,
        // yoksa “istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen mesafeyi km olarak giriniz");
        double mesafe = scan.nextDouble();

        System.out.println("metreye cevirmek icin 'm' veya 'M' ye \nsantimetreye icin 'C' veya 'c' ye basiniz");
        char krk = scan.next().charAt(0);


        if (krk != 'M' && krk != 'm' && krk != 'C' && krk != 'c'){

            System.out.println("istediginiz birim sisteme kayitli degil");
        } else if (krk == 'M' || krk == 'm') {
            System.out.println("cevirilen mesafe:" + (mesafe*1000) + " metredir");

        }else if (krk == 'C' || krk == 'c'){
            System.out.println("cevirilen mesafe:" + (mesafe * 100000) + " santimetredir");

        }
}

}