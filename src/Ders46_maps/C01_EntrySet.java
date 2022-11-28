package Ders46_maps;

import Ders44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {



        // onceki iki derste key(set) ve value(collection) degerlerini toplu olarak alabiliyorduk
        // ancak key ve value birlikte kullanmak istedigimizde bu islemi yapmak zor olur

        // bunun icin Java Entry interface'ini olusturmustur
        //Entry'ler key=value ikilisini 1 entry olarak kabul eder

        Map<Integer,String>ogrenciMap= MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.size()); // 6

        ogrenciMap.put(107,"mehmet-erkan-12-K-MF");
        /*
        {101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
         103=Ali-Cem-11-H-TM,
         104=Ayse-Can-10-H-MF,
         105=Ayse-Cem-11-M-TM,
         106=Fatma-Han-10-K-Soz}
         */
        Set<Map.Entry<Integer,String>> ogrenciEntrySeti=ogrenciMap.entrySet();
        System.out.println(ogrenciEntrySeti);
        /*
        [101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
         103=Ali-Cem-11-H-TM,
         104=Ayse-Can-10-H-MF,
         105=Ayse-Cem-11-M-TM,
         106=Fatma-Han-10-K-Soz]

        aralarindaki farklar
        1- yukaridaki map bu set
        2- yukaridaki {}  kullanir bu ise []
        3- yukaridaki key ve value'ler her eleman icin bir arada ama ayri ayri bireyler
        Entry'de ise K=V ikisi birlikte bir element olusturuyor
         */

        // entry seti icersindeki entryleri biz de sira numarasi vererek yazdiralim

        int siraNo=1;

        for (Map.Entry<Integer,String>eachEntry:ogrenciEntrySeti
             ) {

            System.out.println(siraNo+"-"+eachEntry);
            siraNo++;
        }
        // Entry'leri kullanarak Key'leri yazdirin

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySeti
             ) {
            System.out.println(eachEntry.getKey());
        }
        // Entry'leri kullanarak tum ogrencilerin siniflarini 1 artirin
        // 12. sinifta olan varsa map'ten cikarin

        // tum entry'leri elden gecirelim

        String entryValue;
        String []entryValueArr;

        for (Map.Entry<Integer, String> eachEntry :ogrenciEntrySeti
                ) {

            // her bir entry deki value'yi alip parcalayip istenen update'i yapip
            // yeniden map'e eklemem lazim
            entryValue=eachEntry.getValue(); // Ali-Can-10-H-MF,
            entryValueArr=entryValue.split("-"); // [Ali-Can-10-H-MF]

            if (entryValueArr[2].equals("12")){

                eachEntry.setValue("mezun Oldu");

                // ogrencinin sinifi 12 ise
            } else {
                // ogrencinin sinifi 12 degilse
                int sinif=Integer.parseInt(entryValueArr[2]);
                sinif++;
                entryValueArr[2]=sinif+""; // [Ali-Can-11-H-MF]
                eachEntry.setValue( entryValueArr[0]+"-" +
                                    entryValueArr[1]+"-"+
                                    entryValueArr[2]+"-"+
                                    entryValueArr[3]+"-"+
                                    entryValueArr[4]);
            }

        }
        System.out.println(ogrenciMap);




    }
}
