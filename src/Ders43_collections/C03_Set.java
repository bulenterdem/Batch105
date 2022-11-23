package Ders43_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {

    public static void main(String[] args) {

        // verilen bir aaray2in tekrar eden elemntlerini silip
        //her elemntin sadece 1 kere kullanildigi hale getirin

        int[] arr = {6, 4, 5, 3, 5, 4, 8, 7, 9, 6, 2, 1, 1, 2, 3, 5, 4, 8, 7, 9, 8, 9, 8, 6};

        Set<Integer>geciciset=new HashSet<>();

        for (Integer each : arr ) {

            geciciset.add(each);

        }

        // int [] geciciArr=new int[geciciset.size()];
       arr=new int[geciciset.size()];// eski arraye yeni boyut tanimladik (9 uzunlugunda ve bos)

        // setteki benzersiz hale getirilen elementleri geciciArr'ye tasiyalim

        int index=0;

        for (Integer each: geciciset) {

            arr[index]=each;
            index++;
        }

        // tekrarsiz degerleri gecici arr'e tasidik
        // simdi kendi arrayimize bu gecici arr degerini atayalim

           //  arr=geciciArr;
        System.out.println(Arrays.toString(arr));


    }
}
