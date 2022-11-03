package Ders08_Ternary_Swıtch;

public class C04_Ternary {

    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise
        // “Eskenar ucgen” yazdirin, degilse
        // “Eskenar degil” yazdirin.

        int kenar1 =10;
        int kenar2=10;
        int kenar3=10;
        System.out.println(kenar1==kenar2 && kenar2==kenar3 ?
                "Eşkenar Üçgen" : "Eşkenar üçgen değil");

        // kullanicidan iki sayi alin be buyuk olmayan sayiyi yazdirin

        int sayi1=16;
        int sayi2=18;

        System.out.println(sayi1>sayi2 ? sayi2: sayi1);



    }
}
