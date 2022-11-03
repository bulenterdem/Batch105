package Ders17_Scope;

public class C01_LocalVariables {
    public static void main(String[] args) {
       // bir methodun icersinde olusturulan variable'larin scope'u
        // icinde olusturduklari methoddur
        // o methodun disindan ULASILAMAZLAR

        int sayi=10;
        String isim="Ramazan";

        for (int i = 0; i < 10; i++) {

            String adres="Ankara";
            // bir loop icersinde olusturulan variabler sadece o loop icersinde gecerlidir

        }

        // System.out.println(adres);

        double pi;
        // System.out.println(pi); local variable'lar deger atamadan olusturulabilir
        // ancak KULLANILMAZ
        // kullanmadan once deger atanmis olmalidir

    }
     public static void  method(){

         // System.out.println(sayi);
         //  isim="tugay";

         boolean dogruMU=true;
     }
}
