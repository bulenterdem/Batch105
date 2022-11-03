package Ders20_MultiDimensionalArray;

public class C03_MDA_EnUzunKelime {

    public static void main(String[] args) {

        // verilen multi dimensional String bir arraydeki
        // en uzunStringi bulan kod yaziniz

        String[][] arr = {{"ilker", "Nesrin"}, {"Hasan", "Heysem", "Adem", "Yusuf Enes"}};

        String enUzunKelime = arr[0][0];

        for (int i = 0; i < arr.length; i++) {    // outer arrayin elementlerini kontrol eder

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].length() > enUzunKelime.length()) {
                    enUzunKelime = arr[i][j];

                }


            }

        }
        System.out.println("Enuzun kelime :" + enUzunKelime); //Enuzun kelime :Yusuf Enes
    }
}