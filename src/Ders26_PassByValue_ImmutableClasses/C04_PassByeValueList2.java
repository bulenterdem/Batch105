package Ders26_PassByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByeValueList2 {
    public static void main(String[] args) {

        // bir mehod olusturalim ve methodda yeni bir liste olusturun
        // Listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin
        // sonra sayilar listesine deger olarak yeni listi atayin
        // ve sayilar listesini yazdirin


        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        yeniListdegeriAta(sayilar);
        System.out.println("method call dan sonra main methodda sayilar:"+ sayilar);

    }

    public  static void yeniListdegeriAta(List<Integer> sayilar){
        // bir mehod olusturalim ve methodda yeni bir liste olusturun
        // Listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin
        // sonra sayilar listesine deger olarak yeni listi atayin
        // ve sayilar listesini yazdirin

        List<Integer>yeniList=new ArrayList<>();

        for (int i = 0; i <sayilar.size() ; i++) {

            yeniList.add(sayilar.get(i)+5);

        }

        sayilar=yeniList;

        System.out.println("method'da sayilar listesinin son hali:"+ sayilar);





    }
}
