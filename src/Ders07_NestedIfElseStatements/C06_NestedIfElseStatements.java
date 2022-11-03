package Ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C06_NestedIfElseStatements {

    public static void main(String[] args) {
        // Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi oldugunu yazdirin,
        // sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        double sayi = scan.nextDouble();

        if (sayi%2==1 &&  sayi>0){
            System.out.println( "Girdiginiz sayi pozitif tek sayidir");
        } else if (sayi%2==-1 && sayi <0) {
            System.out.println( "Girdiginiz sayi negatif tek sayidir");
        } else if (sayi%2==0 && sayi%10==0){
            System.out.println( "girdiginiz  sayi cift tamsayidir  \n10 ' nun tam katidir");
        }else {
            System.out.println( "girdiginiz  sayi cift tamsayidir  \n10 ' nun tam kati degildir");
        }



        }






    }


