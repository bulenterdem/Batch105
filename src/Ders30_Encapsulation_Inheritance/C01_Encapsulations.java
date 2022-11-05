package Ders30_Encapsulation_Inheritance;

public class C01_Encapsulations {
    public static void main(String[] args) {

        AEncapsuleClass pers1=new AEncapsuleClass();

        // pers1.hastaneIsmi="java Hastanesi"; private oldugu icin gorulemez

       //  pers1.hastaucreti=10000;   private oldugu icin gorulemez

        //pers1.hemsireAdresi="Ankara";
       // pers1.hemsireIsmi="Yildiz yildiz";

      ; System.out.println(  pers1.getHastaneIsmi());

      pers1.setHastaUcreti(500);
        pers1.setHemsireAdresi("istanbul");
        System.out.println(pers1.getHemsireAdresi());
     pers1.setHemsireIsmi("ayse");
        System.out.println(pers1.getHemsireIsmi());

    }
    // getter ve setter methodlari
    // bazen de erisimi sinirlandirmak icin degil
    // kullanicilarin islevi iyi anlamasi icin kullanilir


}
