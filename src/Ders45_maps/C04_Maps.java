package Ders45_maps;

import Ders44_maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C04_Maps {
    public static void main(String[] args) {
         // ogrenci map2inde numarasi verilen sayilar arasinda (sinirlar dahil) olan ogrencilerin
        // isim soyisim ve bolumlerini list olarak bize donduren bir method olusturun


        Map<Integer,String>ogrenciMap= MapDepo.ornekMapOlustur();

        ogrenciMap.put(107,"Tugay-Cil-12-K-MF");
        ogrenciMap.put(103,"Hikmet-Saglam-11-M-Soz");
        int basNo=102;
        int bitNo= 120;
        List<String> isimlistesi=MapDepo.numaradegerineGoreListeOlustur(ogrenciMap,basNo,bitNo);

        System.out.println(isimlistesi);


    }
}
