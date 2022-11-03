package Ders26_PassByValue_ImmutableClasses;

public class C01_PassByValue {
    public static void main(String[] args) {

       double fiyat=100;

        indirmUygula(fiyat);

        System.out.println(fiyat);
        System.out.println(indirmUygula(fiyat));
        System.out.println(indirmUygula(fiyat));
        System.out.println(indirmUygula(fiyat));

        fiyat=indirmUygula(fiyat);

        System.out.println("indirm uygulanmis yeni fiyat:" + fiyat);
    }

    // kodlarimizin anlasilir olmasi icin main method'dan diger methodlara parametre olarak
    // gonderdigimiz variable lar icin ayni isimli variable olusturmayi TERCIH EDERIZ

    // java methodlar arasinda gecis yaparken variable'i degil variable'in value'sunu pass eder

    // Bu java nin Pass By Value yu tercih etmesinden kaynaklaniyor
    // eger methodun icersinde yaptiginiz degisikligin main method icin de gecerli olmasini
    // isterseniz main method
    // icersinde fiyat=indirmUygula(fiyat);  atamasini yapabiliriz



    private static double indirmUygula(double fiyat) {

        // %10 indirim yapsin

      fiyat= fiyat*0.9; // fiyata atama yaptik kalici olarak kalir

        return fiyat;



    }
}
