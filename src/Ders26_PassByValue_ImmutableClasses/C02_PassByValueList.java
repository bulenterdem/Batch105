package Ders26_PassByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {
    public static void main(String[] args) {

        // bir mehod olusturalim ve methodda listteki sayilari 5 arttiralim
        // ve methodda listenin son halini yazdiralim

        List<Integer>sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        elementleri5Artir(sayilar);
        elementleri5Artir(sayilar);
        elementleri5Artir(sayilar);

        // method call sonrasi main method icersinde listi tekrar yazdiralim

        System.out.println("method call sonrasi main method'da list: " + sayilar);

    }
     public static void elementleri5Artir(List<Integer>sayilar){

         for (int i = 0; i < sayilar.size(); i++) {

             sayilar.set(i, sayilar.get(i)+5);

         }
         System.out.println(sayilar);
     }

}
