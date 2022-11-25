package Ders45_maps;

import Ders44_maps.MapDepo;

import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {

        // ogrenci map'inden numara , isim ve soyisim degerlerini yazdiralim

        Map<Integer,String>ogrenciMap= MapDepo.ornekMapOlustur();
        ogrenciMap.put(110,"Suleyman-sah-11-T-MF");
        ogrenciMap.put(105,"Sule-Karaca-10-L-MF");

        MapDepo.numaraIsimSoyisimyazdir(ogrenciMap);
    }
}
