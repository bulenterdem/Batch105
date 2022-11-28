package Ders47_MapsMethodlari;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C04_soru {
    public static void main(String[] args) {

        // verilen bir cumlede kullanilan karakterleri
        // ve kacar kere kullanildigini yazin

        String str= "Javayi balonu patlatmadan bitirelim";


        String[] strArr = str.split("");

        Map<String,Integer>kullanimMiktarlariMap=new TreeMap<>();

        //[J, a, v, a, y, i,  , b, a, l, o, n, u,  , p, a, t, l, a, t, m, a, d, a, n,  , b, i, t, i, r, e, l, i, m, .]

        for (int i = 0; i <strArr.length ; i++) {


            // ele aldıgım elemnt map'te  varsa kullanim miktarini 1 artir
            kullanimMiktarlariMap.putIfAbsent(strArr[i],1);


            // ele aldgım eleman map'de yoksa kullanim miktarini 1 olarak map'e ekleyecem
            kullanimMiktarlariMap.computeIfPresent(strArr[i],(k,v)->v+1);

        }
        System.out.println(kullanimMiktarlariMap);


    }
}
