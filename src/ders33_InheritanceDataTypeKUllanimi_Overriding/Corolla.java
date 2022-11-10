package ders33_InheritanceDataTypeKUllanimi_Overriding;

public class Corolla extends BToyota{

    String model="corolla";
    String uretimyeri= "Turkiye";
    int yil=2023;

    public static void main(String[] args) {

        /*
        bir obje olusturulurken data turu ve constructor
        ayni class'dan ise bir Variable in degerini bulmak icin
        o class a gideriz
        0 class da yoksa sirasiyla parent classlara bakilir
        ilk bulnan kullanilir
         */

        Corolla corolla1=new Corolla();
        System.out.println(corolla1.model); // Corolla
        System.out.println(corolla1.uretimyeri); // turkiye
        System.out.println(corolla1.yil); // 2023
        System.out.println(corolla1.marka); // BToyota class'i
        System.out.println(corolla1.motor); // Araba class
        System.out.println(corolla1.plaka); // Araba class
        System.out.println(corolla1.yakit); // BToyota clas


        BToyota corolla2=new Corolla();

        /*
         obje olustrulurken data turu ve constructor farkli
         ise Variable in degerini bulmak icin
         Data turu olan class a gidilir varsa kullanilir
         yoksa o class in parentlarina bakilir
         bulunamazsa CTE verir
         (geri vites yapmaz)
         */

        System.out.println(corolla2.model); // Btoyota class
        // System.out.println(corolla2.uretimyeri); // CTE
        System.out.println(corolla2.yil); //  BToyota class
        System.out.println(corolla2.marka); // BToyota class
        System.out.println(corolla2.motor); // Araba class
        System.out.println(corolla2.plaka); // Araba class
        System.out.println(corolla2.yakit); // Btoyota class

        Araba corolla3= new Corolla();


        //System.out.println(corolla3.model); // CTE
        //System.out.println(corolla3.uretimyeri); // CTE
        //System.out.println(corolla3.yil); // CTE
       // System.out.println(corolla3.marka); // CTE
        System.out.println(corolla3.motor); // Araba class
        System.out.println(corolla3.plaka); // Araba class
        System.out.println(corolla3.yakit); // Araba class


        BToyota toyota1=new BToyota();
        System.out.println(toyota1.model); // BToyota
        System.out.println(toyota1.yil); // BToyota
        System.out.println(toyota1.marka); // BToyota class'i
        System.out.println(toyota1.motor); // Araba class
        System.out.println(toyota1.plaka); // Araba class
        System.out.println(toyota1.yakit); // BToyota clas

        Araba toyota2=new BToyota();
       // System.out.println(toyota2.model); // CTE
       // System.out.println(toyota2.yil); // CTE
       // System.out.println(toyota2.marka); // CTE
        System.out.println(toyota2.motor); // Araba class
        System.out.println(toyota2.plaka); // Araba class
        System.out.println(toyota2.yakit); // BToyota clas

        Araba araba =new Araba();
        System.out.println(araba.motor); // Araba
        System.out.println(araba.yakit); //Araba
        System.out.println(araba.plaka); //Araba


    }



}


