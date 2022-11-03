package Ders10stringConcenations;

public class C09_soru {
    public static void main(String[] args) {

        /*
        kullanicidan bir cumle ve bir metin alin
        cumlede metnin durumuna göre
        1- cumle metni icermiyor
        2- cumle metni sadece 1 kere iceriyor
        3- cumle metni birden fazla iceriyor
        secenklerinde uygun olanı yazdırın.
         */

        String cumle = "java cok guzeldir cok";
        String metin = "cok";
        int ilkIndex = cumle.indexOf(metin);
        int sonIndex = cumle.lastIndexOf(metin);
        if (ilkIndex == -1) {

            System.out.println("cumle metni icermiyor");
       } else if (ilkIndex == sonIndex) {

            System.out.println("cumle metni sadece 1 kere iceriyor");

       } else {
            System.out.println("cumle metni birden fazla iceriyor");




            }
            }
}

