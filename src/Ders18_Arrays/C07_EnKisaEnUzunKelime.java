package Ders18_Arrays;

public class C07_EnKisaEnUzunKelime {
    public static void main(String[] args) {
        // Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] arr= {"Hasan","Adem","Senturk","Omer Faruk"};
       enUzunEnKisaIsimleriYazdir(arr);

    }

    public static void enUzunEnKisaIsimleriYazdir(String[]arr){

        String enuzunkelime=arr[0];
        String enkisaKelime=arr[0];

        for (int i = 1; i < arr.length ; i++) {

            if (arr[i].length()>=enuzunkelime.length()){
                enuzunkelime=arr[i];
            }

            if (arr[i].length()<=enkisaKelime.length()){
                enkisaKelime=arr[i];

            }



        }
        System.out.println("en uzun kelime:"+ enuzunkelime);// en uzun kelime:Omer Faruk
        System.out.println("en kisa kelime:"+ enkisaKelime);// en kisa kelime:Adem
    }
}
