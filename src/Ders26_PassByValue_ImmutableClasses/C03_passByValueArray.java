package Ders26_PassByValue_ImmutableClasses;

import java.util.Arrays;

public class C03_passByValueArray {

    public static void main(String[] args) {

        // verilen bir arrayin elmentlerini 5 arttirip
        // sonra yazdiran bir method olusturun


        int[] arr={3,4,5};
        elementleri5Artir(arr);
        elementleri5Artir(arr);
        elementleri5Artir(arr);

        System.out.println("method call dan sonra main method icinde arr:"+Arrays.toString(arr));


    }

    public static void elementleri5Artir(int[ ]arr){

        for (int i = 0; i < arr.length; i++) {

            arr[i]=arr[i]+5;



        }

        System.out.println(Arrays.toString(arr));
    }
    }
