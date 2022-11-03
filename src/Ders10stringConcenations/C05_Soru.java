package Ders10stringConcenations;

public class C05_Soru {
    public static void main(String[] args) {

        /* mail kontrolu yapan bir program hazirlayin
          1- mai @ isareti icermiyorsa " gecersiz email"
          2- @gmail.com icermiyorsa "gmail adresi giriniz
          3-@gmail.com ile bitmiyorsa "yazim hatasi"
          seklinde sonuc versin

         */

        String email="ahmet@gmail.com";

        if (!email.contains("@")){

            System.out.println("gecersiz email");

        } else if (!email.contains("@gmail.com")) {

            System.out.println("gmail adresi giriniz");

        } else if (!email.endsWith("@gmail.com")) {

            System.out.println("yazim hatasi");

        }else {
            System.out.println("email basari ile kaydedildi");

    }

    }
    }

