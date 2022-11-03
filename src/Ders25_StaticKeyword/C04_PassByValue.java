package Ders25_StaticKeyword;

public class C04_PassByValue {
    public static void main(String[] args) {

       double fiyat=100;

        indirmUygula(fiyat);

        System.out.println(fiyat);
        System.out.println(indirmUygula(fiyat));
    }

    private static double indirmUygula(double fiyat) {

        // %10 indirim yapsin

        fiyat= fiyat*0.9; // fiyata atama yaptik kalici olarak kalir

        return fiyat;



    }
}
