package Ders18_Arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {

        String [] arr= {"Ali","Ulus", "Nesrin"};

        // bu array'in tum elementlerini aralarinda bir bosluk birakarak yazdirin

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");

        }
        System.out.println(" ");
        // bu arrayi array olarak yazdirin

        System.out.println(arr);
        // array bir able/ non-primitive data oldugunda referans yazdirir
        // [Ljava.lang.String;@566776ad
        // arrayi array olarak yazirma isterseniz Arrays classindan  yardim aliriz.

        System.out.println(Arrays.toString(arr));
    }
}
