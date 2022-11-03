package Ders08_Ternary_Swıtch;

import java.util.Scanner;

public class C11_Ternary {
    public static void main(String[] args) {

        // Kullanicidan notunu alin
        // 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not= scan.nextDouble();

        System.out.println(not>=50 ? "sinifi gectin" : "Maalesef kaldin");
    }
}
