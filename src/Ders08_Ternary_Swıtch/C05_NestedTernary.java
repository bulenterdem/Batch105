package Ders08_Ternary_Swıtch;

public class C05_NestedTernary {
    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alin.
        //Sayi pozitifse, cift sayi veya cift sayi degil
        // seceneklerinden uygun olani yazdirin
        //Sayipozitif degilse, 3 basamakli veya 3 basamakli degil
        // seceneklerinden uygun olani yazdirin

        int sayi=-52;

        if (sayi>0){
            // cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirirn

            System.out.println(sayi%2==0 ? "cift sayi  " : "cift sayi degil");
        }  else {

            //  3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

            System.out.println(sayi <= -99 && sayi > -1000 ? "uc basamakli" : "uc basamakli degil");

            String sonuc= sayi>0
                    ?
                    sayi%2==0 ? "cift sayi  " : "cift sayi degil"
                    :
                    sayi <= -99 && sayi > -1000 ? "uc basamakli" : "uc basamakli degil";

        }
    }
}
