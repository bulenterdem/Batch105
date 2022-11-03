package Ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C08_NestedIfelseStataements {
    public static void main(String[] args) {
        // Kullanicidan gun ismini girmesini isteyin, girilen gun hafta ici bir gun ise
        //  “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        //  gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bulunugunuz gunu giriniz");

        String gun= scan.nextLine();

        if (gun.equalsIgnoreCase("pazartesi")) {
            System.out.println("simdi calisma zamani tatile 5 gun var");
        } else if (gun.equalsIgnoreCase("sali")){
            System.out.println("simdi calisma zamani tatile 4 gun var");
        } else if (gun.equalsIgnoreCase("carsamba")) {
            System.out.println("simdi calisma zamani tatile 3 gun var");
        } else if (gun.equalsIgnoreCase("persembe")) {
            System.out.println("simdi calisma zamani tatile 2 gun var");

        } else if (gun.equalsIgnoreCase("cuma")) {
            System.out.println("simdi calisma zamani tatile 1 gun var");

        } else if (gun.equalsIgnoreCase("cumartesi")) {
            System.out.println("simdi tatil zamani");

        } else if (gun.equalsIgnoreCase("pazar")) {
            System.out.println("simdi tatil zamani");
        }   else {
            System.out.println("yanlis gun girdiniz");


    }



    }
}
