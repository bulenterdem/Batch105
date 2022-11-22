package Ders42_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQueueDataturu {

    public static void main(String[] args) {


        Queue<String>q1=new LinkedList<>();

        q1.add("H");
        q1.add("Y");

        q1.offer("K");

        // kapasite sinirlamsi yapmadiginiz surece add() ile ayni islemi yapar

         System.out.println(q1.remove());  // H
         // Queue eklemeyi sona yapip kullanmayi bastan yaptigi icin parametre
        //  girmediginde bastaki elemani remove eder ve bize dondurur

        System.out.println(q1); // [Y, K]

        System.out.println(q1.remove("K")); //true

       // q1.remove(); // queue bos kaldi  nosuchElementexception verir

        System.out.println(q1.poll()); //null

        // q1.poll() remove ile ayni islemi yapar bastaki elementi siler ve bize dondurur
        // aralarindaki fark remove bos iken exception firlatir poll firlatmaz...

        q1.add("H");
        q1.add("Y");

        System.out.println("peek: "+ q1.peek()); //  H
        // silmeden queue'nin basindaki elemnti bize getiriyor
        // eger  queue bossa null getirir

        System.out.println("element: "+ q1.element()); // H

        q1.clear();//queue'yi bosalttik



       // System.out.println("element: "+ q1.element()); // NoSuchElementException

        System.out.println("peek: "+ q1.peek()); // null
        System.out.println(q1); // [H, Y]

    }
}
