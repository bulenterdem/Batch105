package Ders12_forLoops;

public class C02_forLoops {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {

            System.out.print(i+" ");

        }
        System.out.println();

        // iki basamakli sayilardan 7 ile bolunebilenleri yanyana yazdirin

        for (int i = 10; i <100; i+=7) {

            if (i%7==0);

            System.out.print(i+ " ");
            System.out.print("" );

        }

        // 13 den baslayan 100'e kadar 7'ser 7'ser arttirip yazdirin
        for (int i = 13; i <=100 ; i+=7) {

            System.out.print(i+" ");
            System.out.print("");
        }

        System.out.println("");
        // 1'den 10'a kadar (sinirlar dahil) sayilarin karelerini yazdiralim

        for (int i = 1; i <=10 ; i++) {

            System.out.print(i * i + " ");
        }
    }
}
