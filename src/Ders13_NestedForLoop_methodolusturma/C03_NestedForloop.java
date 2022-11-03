package Ders13_NestedForLoop_methodolusturma;

public class C03_NestedForloop {

    public static void main(String[] args) {

        // 1-4 arasindaki sayilar icin carpim tablosu olusturalim

        // dis dongu satirlari kontrol eder

        for (int i = 1; i <=4 ; i++) {

            // ic dongu her satirda alan degerleri kontrol eder

            for (int j = 1; j <=4; j++) {

                System.out.print(i*j+ " ");

            }
            System.out.println("");

        }
    }
}
