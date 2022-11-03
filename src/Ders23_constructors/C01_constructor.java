package Ders23_constructors;

import java.util.Scanner;

public class C01_constructor {
    public static void main(String[] args) {

        // scanner classin daki method ve variable'lari kulanmak icin scan objesi olusturulur


        Scanner          scan   =       new                                Scanner(System.in);
        // class adi      obje       obje olusturmak icin keyword         Scanner constructor'i
        scan.nextInt();

        String str=new String("java candir");

        String str2= "java ne guzel";

        str.toLowerCase();

    }

    public static void constructor (){

        // method isimleri kucuk harfla baslar
        // class ismi ile ayni isimde olmamasi tercih edilir
        // return type var bu methoddur constructor olamaz
    }
}
