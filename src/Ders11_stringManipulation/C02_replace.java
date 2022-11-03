package Ders11_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {

        String str= "java candir";

        System.out.println(str.replace("a","A")); //jAvA cAndir

        System.out.println(str.replace(' ' ,'_')); //java_candir

        System.out.println(str.replace("candir", "cok guzeldir")); //java cok guzeldir

        System.out.println(str.replace(" ", "")); //javacandir

        System.out.println(str.replace("a","")); //jv cndir

        System.out.println(str.replace("java","hava") //hava cok guzel
                .replace("candir","cok guzel"));

        // sadece 1 a'yi yapin

        System.out.println(str.replaceFirst("a","A")); //jAva candir

       // System.out.println(str.(""));


    }
}
