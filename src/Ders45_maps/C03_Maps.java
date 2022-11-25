package Ders45_maps;

import Ders44_maps.MapDepo;

import java.util.Map;

import static Ders44_maps.MapDepo.subeOgrenciBilgilerinYazdir;

public class C03_Maps {
    public static void main(String[] args) {
        // ogrenciler map'inde subesi H olan ogrencilerin isim soyisim ve siniflarini yazdiralim

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();

         /*
            {101=Ali-Can-10-H-MF,
            102=Veli-Cem-11-M-Soz,
            103=Ali-Cem-11-H-TM,
            104=Ayse-Can-10-H-MF,
            105=Ayse-Cem-11-M-TM,
            106=Fatma-Han-10-K-Soz}
         */
        ogrenciMap.put(107,"Hasan-yan-12-H-MF");
        ogrenciMap.put(101,"Adem-Fan-12-T-Soz");
        String subeAdi="H";
        subeOgrenciBilgilerinYazdir(ogrenciMap,subeAdi);
        System.out.println(ogrenciMap);
    }


}
