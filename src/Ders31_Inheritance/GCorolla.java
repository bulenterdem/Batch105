package Ders31_Inheritance;

public class GCorolla extends FToyota{

    String model= "Corolla";
    String uretimyeri="Turkiye";

    GCorolla(){
        super();
        System.out.println("corolla cons. calisti");
    }


    public static void main(String[] args) {

        GCorolla corolla1=new GCorolla();
        System.out.println(corolla1.marka); // Toyota
        /*
        Bir child class'dan obje olusturdugumuzda olusturulan obje sadece child class' a
        ait ozellikleri degil tum parent class'lardaki ozellikleri tasir

        Bir objenin bir clas'in ozelliklerini tasimasi icin o obje olustutulurken class2 ait constructor'in
        calismis olmasi gerekir
        yani child class'indaki obje olusturulurken tum parent class'lardaki constructor'lar otomatik olarak
        calisir

        Java bu islem icin soyle bir mekanizma gelistirmistir. Bir class olusturdugumuzda biz constructor
        olusturmasak da Java'nin o class'a default
         */




    }
}
