package Ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C07_NestedIfElseStatements {
    public static void main(String[] args) {

        // Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
        //  “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        //  gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün giriniz" + "" +
                "\n(pazartesi için 1" +
                "\nsalı için 2" +
                "\nçarşamba için 3" +
                "\nperşembe için 4" +
                "\ncuma için 5" +
                "\ncumartesi için 6" +
                "\npazar için 7'ye basın)");
        int gun= scan.nextInt();
        if (gun<=5) {
            System.out.println("şimdi çallşma zamanı tatile "+(6-gun)+" gün var");
        } else if (gun>5) {
            System.out.println("şimdi dinlenme zamanı");
        }




    }
}
