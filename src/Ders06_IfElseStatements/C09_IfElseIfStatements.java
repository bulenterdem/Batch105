package Ders06_IfElseStatements;

public class C09_IfElseIfStatements {

    public static void main(String[] args) {
        // kullanicidan bir tam sayi alin
        // sayi negatif ise "gecesiz sayi"
        // tek basamakli ise "rakam"
        // iki basamakli ise "iki basamakli sayi"
        // bunun disindaki sayilar icin "buyuk sayi" yazdirin

        int sayi =85;
        if (sayi < 0) {
            System.out.println("gecersiz sayi");
        } else if (sayi < 10) {
            System.out.println("rakam");

        } else if (sayi < 100) {
            System.out.println("iki basamaki sayi");
        } else {
            System.out.println("buyuk sayi");

        }
    }
}