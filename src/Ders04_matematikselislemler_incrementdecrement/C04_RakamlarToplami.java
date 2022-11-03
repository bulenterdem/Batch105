package Ders04_matematikselislemler_incrementdecrement;

public class C04_RakamlarToplami {

    public static void main(String[] args) {
         // kullanicinin girdigi 4 basamakli bir sayinin
        // rakamlar toplamini veren bir kod yaziniz

        int input=1453;

        int birlerBasamagi;
        int rakamlartoplami=0;

        birlerBasamagi=input % 10; // 3
        rakamlartoplami = rakamlartoplami +birlerBasamagi;
        input=input/10;

        birlerBasamagi=input % 10; // 3
        rakamlartoplami = rakamlartoplami +birlerBasamagi;
        input=input/10;

        birlerBasamagi=input % 10; // 3
        rakamlartoplami = rakamlartoplami +birlerBasamagi;
        input=input/10;

        birlerBasamagi=input % 10; // 3
        rakamlartoplami = rakamlartoplami +birlerBasamagi;
        input=input/10;

        System.out.println("verilen sayinin rakamlar toplami;" + rakamlartoplami);





    }
}
