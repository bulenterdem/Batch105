package Ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {

    public static void main(String[] args) {

        Deque<String>dq1=new LinkedList<>();

        dq1.add("K");
        dq1.add("B"); // [K, B]

        dq1.addLast("F"); // [K, B, F]

        dq1.addFirst("A"); // [A, K, B, F]

        System.out.println( dq1.getFirst()); // A

        System.out.println(dq1.getLast()); // F

        System.out.println(dq1.remove()); //  A yi sildi ve gosterdi

        System.out.println(dq1.poll()); // K yi sildi ve gosterdi

        System.out.println(dq1.removeLast()); // F yi sildi

        System.out.println(dq1.remove()); // B yi sildi ve gosterdi

        System.out.println(dq1.poll()); // null  bos deque olmasina ragmen exception firlatmaz

        dq1.add("K");
        dq1.add("B"); // [K, B]

       dq1.push("F"); //[F, K, B]
        // deque nin basina element ekler
        // eger deque ile ilgili sinirlandirma varsa ve yer kalmamıssa
        // illegalStateexception verir

        System.out.println(dq1.pop());; //  F  ilk elementi siler ve bize dondurur removeFirst() ile ayni islevi gorur

        System.out.println(dq1.element()); // K
        // deque nin en basindaki elementi getirir ama silmez Bos deque'de calisirsa exception firlatir


        System.out.println(dq1.peek()); // K
        // deque nin en basindaki elementi getirir ama silmez Bos deque'de calisirsa null dondurur

        System.out.println(dq1.peekFirst()); // K   silmeden getirir
        System.out.println(dq1.peekLast());  // B   silmeden getirir

        System.out.println(dq1.offer("C"));  // TRUE verir deque nin sonuna elementi ekler. kapasite sinir varsa
                                                // elemnti koyamazsa false verir    [K, B, C]

        System.out.println(dq1.offerFirst("M"));// basa ekler TRUE dondurur    [M, K, B, C]



        System.out.println(dq1); //
    }
}
