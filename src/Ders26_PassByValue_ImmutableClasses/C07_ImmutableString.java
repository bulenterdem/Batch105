package Ders26_PassByValue_ImmutableClasses;

public class C07_ImmutableString {
    public static void main(String[] args) {

        String str="Java Candir";

        str=str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        /*
        ımmutable class'lardan olusturulan bir objenin degeri Degistirilemez
        Eger atama yaparsak java degerini degistirmez
        bunu yerine yeni bir obje olusturur.
        ve bu yeni objeye yeni atadaginiz degeri atar

        eski obje bosa cikar garbage collector tarafindan silinmeyi bekler

         */

    }
}
