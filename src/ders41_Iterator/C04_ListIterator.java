package ders41_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {

    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        ListIterator lit= sayilar.listIterator();

        // iterator kullanarak listenin elementlerini sondan basa dogru yazdirin

        // önce Iteratoru sona goturelim

        while (lit.hasNext()){
            lit.next();
        }

        // simdi sondan basa dogru gidelim giderken elemntleri yazdiralim

        while (lit.hasPrevious()){

            System.out.print(lit.previous()+" ");
        }

        // eger iterator' nerede biraktigimizi hatirlayamazsak
        // iterator.nextIndex() ile oncesinde oldugumuzu gorebiliriz
        System.out.println("");

        System.out.println(lit.nextIndex());

        // iterator kullanarak Listenin tum elementlerini 5 artirin

        while (lit.hasNext()){

            lit.set((Integer)lit.next()+5);
        }

        System.out.println(sayilar);

        // Iterator kullanarak 40'dan kucuk sayilari silin

        System.out.println(lit.nextIndex());

        while (lit.hasPrevious()){

            if ((Integer)lit.previous()>40){
                lit.remove();
            }


            System.out.print(lit.previous()+" ");

        }





    }
}
