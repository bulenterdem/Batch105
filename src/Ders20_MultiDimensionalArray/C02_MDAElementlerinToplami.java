package Ders20_MultiDimensionalArray;

public class C02_MDAElementlerinToplami {

    public static void main(String[] args) {

        int[] arr1= {3,5,7,8}; // 23

        int toplam=0;

        for (int i = 0; i <arr1.length ; i++) {

            toplam+=arr1[i];

        }
        System.out.println("tek katli array elemntler toplami: "+toplam); //tek katli array elemntler toplami: 23

        int[][] arr= {{1,2},{3,4,5},{7}};

        toplam=0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                toplam+=arr[i][j];

            }

        }

        System.out.println("iki katli arrayin elementleri toplami: "+ toplam); //iki katli arrayin elementleri toplami: 22


    }
}
