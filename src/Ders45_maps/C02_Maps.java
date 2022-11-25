package Ders45_maps;

import Ders44_maps.MapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {

        // ogrenciler map'inde subesi H olan ogrencilerin isim soyisim ve siniflarini yazdiralim

        Map<Integer,String>ogrenciMap= MapDepo.ornekMapOlustur();

         /*
            {101=Ali-Can-10-H-MF,
            102=Veli-Cem-11-M-Soz,
            103=Ali-Cem-11-H-TM,
            104=Ayse-Can-10-H-MF,
            105=Ayse-Cem-11-M-TM,
            106=Fatma-Han-10-K-Soz}
         */
             /*
               normalde bilgiler arasina java "," kullanir
               bizde virgul kullanabiliriz
               Ancak bu durumda value collection'in kac elementli olduguna dıkkat etmemiz gerekir
               virgulle ayrılmıs cok element olabilir
               fakat value'lerin bir butun olarak TEK BIR STRING oldugunu unutmamamliyiz
              */

        Set <Integer> ogrencikeySet=ogrenciMap.keySet(); // bir map'deki key'leri Set olarak dondurur

        System.out.println(ogrencikeySet);
        /*
        [101, 102, 103, 104, 105, 106]
         */

        Collection<String> ogrenciValueCollection=  ogrenciMap.values();
        // bir map'teki tum value'leri collection olarak dondurur

        System.out.println(ogrenciValueCollection);

       /* [Ali-Can-10-H-MF,
        Veli-Cem-11-M-Soz,
         Ali-Cem-11-H-TM,
         Ayse-Can-10-H-MF,
         Ayse-Cem-11-M-TM,
         Fatma-Han-10-K-Soz]
        */


    }
}
