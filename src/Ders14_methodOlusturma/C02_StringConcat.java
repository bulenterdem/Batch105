package Ders14_methodOlusturma;

public class C02_StringConcat {
    public static void main(String[] args) {

        // verilen iki string'i parametre olarak kabul edip
        // bu iki string'i aralarinda bir bosluk olan tek bir string
        // olarak main methoda'a donduren bir method olusturun

        String str1= "java";
        String str2= "Candir";
        System.out.println(birlestirMethodu(str1, str2));
        System.out.println(birlestirMethodu("bu da" , "oldu"));;
    }

    public static String birlestirMethodu(String str1,String str2){

        return str1+" "+str2;



    }
}
