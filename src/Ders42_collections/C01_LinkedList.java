package Ders42_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {

    public static void main(String[] args) {

        LinkedList<String>ll1=new LinkedList<>();

        ll1.add("K");
        ll1.add("T");

        // LinkedList 3 tane interface2i implement etmistir
        // List , Queue , Deque interface'leri
        // dolaisiyla bu interface'lerden sonra gelen ilk concrete class oldugundan
        // Bu 3 interface'deki tum abstract methodlari override etmistir.

        // Linklist olusturulurken secilen data turune gore
        // bu 3 interface'den birinin ozelliklerini alabilir
        // veya data turu LinkedList secilirse 3 interface ozelliklerini toptan alir

        List<String>ll2=new LinkedList<>();

        // Daha önceden arrayList olustururken List<> interface'ini data türü olarak
        //  kullandıgımızdan bu sekılde olusturulan LinkedList'lerin ozellıklerını biliyoruz.

        ll2.add("R"); // [R]

        ll2.add("Z"); //  [R,Z]

        ll2.add(0,"A");

        System.out.println(ll2); //[A, R, Z]

        ll2.addAll(2,ll1);

        System.out.println(ll2);  // [A, R, K, L, Z]

        ll2.set(3,"M");
        System.out.println(ll2); // [A, R, K, M, Z]

        ll2.add("K");
        ll2.add("T");

        System.out.println(ll2.get(0)); // A

        System.out.println(ll2.retainAll(ll1)); // true

        System.out.println(ll2); // [K, K, T]
        ll2.add("A");

        System.out.println(ll2.hashCode()); // 3232590

        //  System.out.println(ll2.get(4)); exception verir

        System.out.println(ll2.subList(2,4)); // 2 dahil 4 dahil olmadgından exception firlatmaz


    }
}
