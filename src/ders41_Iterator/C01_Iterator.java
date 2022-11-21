package ders41_Iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {


        // java collections icersindeki bazi class'lar index desteklemez
        // bu durumda index kullanmadan collection icersindeki tum elementlere ulasabilmek
        // ve onlari update edebilmek icin farkli ihtiyaclarimiz olur

        // List<> index yapisini desstekledigi icin boyle bir ihtiyac duymaz
        // ancak bugunluk index kullanmadan List' elemntlerine ulasmya
        // ve onlari update etmeye calisalim

        List<Integer>sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // index kullanmadan List elemntelrini yazdirin

        for (Integer each:sayilar
             ) {
            System.out.print(each+" ");

            // İNDEX kullanmadan List'in elementlerini birer arttırın.
            //    İNDEX kullanmadan 25'den büyük sayıları List'den silin



        }
        for (Integer each :sayilar
        ) {
            System.out.print(each+1+" ");

        }
        System.out.println("");
        System.out.println(sayilar);


        for (Integer each:sayilar
             ) {
            each+=1;
            System.out.print(each+" ");

        }

        System.out.println("");
        System.out.println(sayilar);

        /*

        Index kullanmadan list'in elemanlarini kalici olarak degistirmek mumkun olmadi
        java bunu n icin Iterator interface'i olusturmustur
         */

    }







}
