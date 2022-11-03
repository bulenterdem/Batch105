package Ders18_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int [] arr1= {2,4,6,8,10};

        // array'in bir elementine ulasmak ve update etmek istersek

        System.out.println(arr1[2]); // 6

        arr1[3]=20;

        System.out.println(arr1[3]); // 20

        System.out.println(arr1.length); // 5

        // son elementi yazdirin

        System.out.println(arr1[arr1.length-1]); // 10

        for (int i = 0; i < arr1.length; i++) {

            System.out.print(arr1[i]+ " "); //2 4 6 20 10
            }


        // arr1 [5]=35;

    }
}
