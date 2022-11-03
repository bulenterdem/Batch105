package Ders19_Arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementiBulma {
    public static void main(String[] args) {
        // verilen nir int arrayde en kucuk ve en buyuk sayilari
        // yazdiran bir method olusturun

        int [] arr={-5,3,8,1,5,2,9,20,0};
        enBuyukEnKucukElementYazdir(arr);

    }

    public static void enBuyukEnKucukElementYazdir(int[]arr){

        Arrays.sort(arr); // sort arrayi siralar
        System.out.println("en buyuk element :" + arr[arr.length-1]); //en buyuk element :20
        System.out.println("en kucuk element :" + arr[0]); // en kucuk element :-5

    }
}
