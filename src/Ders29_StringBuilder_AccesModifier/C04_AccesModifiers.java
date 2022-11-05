package Ders29_StringBuilder_AccesModifier;

public class C04_AccesModifiers {

    String isim="ali"; // accss modifier gorunmuyor, o zaman default access modifier gecerlidir
    // bu class'dan ders29 package icersindeki diger class dan kullanilabilir

    //  default int sayi=10;  default access modifier yazilmaz YAZILAMAZ
    // java CTE verir

    private  static int sayi=10;


    public static void main(String[] args) {

        System.out.println(sayi); //10

        sayi=20;

        System.out.println(sayi); //20



    }
}
