package Ders20_MultiDimensionalArray;

public class C05_MDA_SayialarinCarpimi {

    public static void main(String[] args) {

        // Soru 4- Verilen 2 katli bir array’de bulunan
        // tum sayilarin carpinini bize donduren bir method olusturun.

        int[][] arr={{5,7}, {5, 8, 9},{2,1}};
        System.out.println(elemntleriCarp(arr));

    }

    public static int elemntleriCarp(int[][]arr){

        int carpim=1;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                carpim*= arr[i][j];
            }

        }
        return carpim;
    }
}
