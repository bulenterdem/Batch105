package Ders19_Arrays;

import java.util.Arrays;

public class C06_ArrayeYeniDegeratama {
    public static void main(String[] args) {

        String str= "java";

        str="hava";

        /*
        var olan bir arrayin uzunlugu degistirilemez
        AMA
        var olan bir araye yeni bir array degeri atanabilir.
         */

        // 1- var olan bir arraye yeni deger olarak atayabiliriz

        String[]arr1= {"Ali","Veli"};
        String[]arr2={"A","B","C"};

        arr1=arr2;

        System.out.println(Arrays.toString(arr1)); // {A,B,C}

        // 2- istedigimiz uzunlukta yeni bos bir array degeri atayabiliriz

        arr1= new  String[6];
        System.out.println(Arrays.toString(arr1));

        // 3- yeni olusturulan bir arraye {} icinde deger yazarak atama yapabiliriz
        // ancak var olan bir arraye yeni deger atamasi icin {} KULLNILMAZ
        // arr1={"g","h"}; olmaz

        int[]arr= {3,4,5};


    }
}
