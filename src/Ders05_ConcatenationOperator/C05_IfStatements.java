package Ders05_ConcatenationOperator;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // kullanicidan bir tam sayi alin
        // sayi 3 ile bolunebiliyorsa "uc ile bolunebilen sayi"
        // 5 ile bolunebiliyorsa " 5 ile bolunebilen sayi
        // hem 3 hem 5 ile bolunebiliyorsa "super sayi" yazdırsın

        System.out.println("Lutfen bir tam sayi girin");
        int girilenSayi= scan.nextInt();

        if (girilenSayi%3==0 &&  girilenSayi%5==0) {
            System.out.println(" super sayi");
        } else if (girilenSayi%5==0) {
            System.out.println("5'ebolunebilen sayi");}
        else if (girilenSayi%3==0)  {
            System.out.println("3'e bolunebilen sayi");

        }
    }


    }

