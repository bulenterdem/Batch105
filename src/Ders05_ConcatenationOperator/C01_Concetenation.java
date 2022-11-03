package Ders05_ConcatenationOperator;

public class C01_Concetenation {

    public static void main(String[] args) {
        // sadece asagida verilen variable'lari kullanrak istenen degerleri yazalim

        String s1= "Java";
        String s2= "Guzeldir";
        String s3= "";  // hiclik
        String s4= " "; // bosluk

        int sayi1=4;
        int sayi2=3;

        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2); // Java7 Guzeldir43

        System.out.println(s3+sayi2+sayi1+s4+s1); //34 Java

        System.out.println(sayi1+sayi2+s1+s4+s2);  // 7Java Guzeldir

        System.out.println(s1+s4+s2+(sayi1+sayi2));  // Java Guzeldir7

        System.out.println(s1+s4+s2+s4+sayi1*sayi2);  // java guzeldir 12
    }
}
