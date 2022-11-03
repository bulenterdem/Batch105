package Ders22_arraylists;

public class C04_ForEachloop {
    public static void main(String[] args) {


        int[] arr = {3, 5, 7, 8, 4, 2, 6, 9, 6, 4, 5};
        // bu array'deki 5'ten buyuk elementleri toplayalim.
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                toplam += arr[i];

            }
        }
        System.out.println("for loop ile: " + toplam);

        // for-each loop daha basit bir kurgu ile calisir.
        // bu loop icin 3 seyi soylememiz lazim.
        //1- Hangi data turunde degiskenlerle ugrasacaksiniz,
        //2- Loop'un icerisinde her bir eleman geldiginde hangi isimle islem yapacaksiniz,
        //3- Hangi array veya collection dan elemanlar gelecek
        toplam = 0;
        for (int each : arr) // arr ye git, her bir int'i getir
        {
            if (each > 5) {
                toplam += each;
            }

        }
        System.out.println("For each ile: " + toplam);
    }
}
