package Ders08_Ternary_Swıtch;

public class C02_Ternary {
    public static void main(String[] args) {

        String str1= "Ali";
        String str2= "Ali";
        int sayi=10;
        // verilen iki metin ayni ise "metinler aynı"
        // farkli ise "metinler farkli" yazdirin

        if (str1.equals(str2)){
            System.out.println("metinler ayni");
        } else {
            System.out.println("metinler farkli");
        }

        System.out.println(str1.equals(str2) ? "metinler ayni": "Metinler farkli");




    }
}
