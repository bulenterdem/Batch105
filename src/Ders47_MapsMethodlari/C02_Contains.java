package Ders47_MapsMethodlari;

import Ders44_maps.MapDepo;

import java.util.Map;

public class C02_Contains {
    public static void main(String[] args) {


        Map<Integer,String>ogrenciMap= MapDepo.ornekMapOlustur();

        System.out.println(ogrenciMap);
        // {101=Ali-Can-10-H-MF,
        // 102=Veli-Cem-11-M-Soz,
        // 103=Ali-Cem-11-H-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Ayse-Cem-11-M-TM,
        // 106=Fatma-Han-10-K-Soz}

        System.out.println(ogrenciMap.containsKey(105)); // true

        System.out.println(ogrenciMap.containsKey(111)); //false

        System.out.println(ogrenciMap.containsValue("10")); //false

        System.out.println(ogrenciMap.containsValue("Veli-Cem-11-M-Soz")); //true
        System.out.println(ogrenciMap.containsValue("Veli-Cem-11-M-Soy")); //false

        /*

            contains value ("arananDeger") value'larin icindeki bir bolumu aramaz
            value'su butun olarak arananDeger var mı diye bakar
         */

    }
}
