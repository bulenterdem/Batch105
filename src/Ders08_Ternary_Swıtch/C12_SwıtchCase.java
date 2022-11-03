package Ders08_Ternary_Swıtch;

import java.util.Scanner;

public class C12_SwıtchCase
{
    public static void main(String[] args) {

        // Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
        //  “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        //  gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bulunugunuz gunu giriniz");

       int gunNo= scan.nextInt();

        switch (gunNo) {
            case 1:
                System.out.println("simdi calisma zamani tatile 5 gun var");
                break;
            case 2:
                System.out.println("simdi calisma zamani tatile 4 gun var");
                break;
            case 3:
                System.out.println("simdi calisma zamani tatile 3 gun var");
                break;
            case 4:
                System.out.println("simdi calisma zamani tatile 2 gun var");
                break;
            case 5:
                System.out.println("simdi calisma zamani tatile 1 gun var");
                break;
            case 6:
                System.out.println("simdi tatil zamani");
                break;
            case 7:
                System.out.println("simdi tatil zamani");
                break;
            default:
                System.out.println("Gecersiz gun no");
        }
    }
}
