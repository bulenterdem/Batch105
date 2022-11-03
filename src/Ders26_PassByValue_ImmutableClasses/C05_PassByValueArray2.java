package Ders26_PassByValue_ImmutableClasses;

import java.util.Arrays;

public class C05_PassByValueArray2 {

    public static void main(String[] args) {
        // bir method olusturun.
        // main method'da verilen arrayin uzunlugundan 2 fazla olan
        // ve elementlerin tamami 5 olan yeni bir array olusturup
        // deger olarak sayilar arrayine atayin ve sayilar arrayini yazdirin


        int[] sayilar = {3, 4, 5,6};
        arrayeYenidegerAta(sayilar);

        System.out.println(Arrays.toString(sayilar));


    }

    public static void arrayeYenidegerAta(int[]sayilar){

        int[] yeniArray=new int[sayilar.length+2];

        for (int i = 0; i < yeniArray.length; i++) {

            yeniArray[i]=5;

        }
        sayilar=yeniArray;

        System.out.println("methodda sayilarin son hali: "+ Arrays.toString(sayilar));



    }
}
