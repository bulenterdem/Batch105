package Ders46_maps;

import Ders44_maps.MapDepo;

import java.util.Map;
import java.util.Set;


public class C02_EntrySet {
    public static void main(String[] args) {
        //    ogrenci map'inde sirali olarak tum ogrencilerin
        //    bolum, sinif ,sube isim , soyisim ve numaralarini yazdirin

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        ogrenciMap.put(109,"Adem-Demir-11-D-Soz");

        // Soz,11,D,Adem,Demir,109
        // bu formatta stringler olusturup bir treeset'e atalayan ve
        // bu seti bize donduren bir method olusturalim

        Set<String>siraliOgrenciListesi=MapDepo.siraliOgrenciListesiOlustur(ogrenciMap);
        System.out.println(siraliOgrenciListesi);








    }
}
