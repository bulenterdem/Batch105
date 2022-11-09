package Ders31_Inheritance;

public class CSuv extends BinekArac{

    public static void main(String[] args) {

        CSuv suv1= new CSuv();

        System.out.println(suv1.marka); //Binek araclarin markasi vardir
        System.out.println(suv1.model); // Binek araclarin modeli olur
        System.out.println(suv1.motor); //Tum araclar motor kullanir
        System.out.println(suv1.plaka); // tum araclarin plakasi olur
        System.out.println(suv1.yakit); // araclar farkli yakitlar kullanir
        System.out.println(suv1.yil); // 1900
        suv1.hiz(); //binek araclarin hizi modele gore degisir
        suv1.teker(); //binek araclarin 4 tekeri olur


        CSuv suv2= new CSuv();

        suv2.marka="Toyota";
        suv2.model="Rav4";
        suv2.motor="1.6";
        suv2.plaka="06 ANK 06";
        suv2.yakit="benzin";
        suv2.yil=2012;
        suv2.hiz(suv2.yakit);


    }

    public void hiz(String yakit){

        if (yakit.equalsIgnoreCase("benzin")){
            System.out.println("Benzinli SUV'lar max 300 km yapar");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("Dizel SUV'lar max 260 km yapar");

            } else if (yakit.equalsIgnoreCase("hibrit")) {

            System.out.println("Hibrit SUV'lar max 220 km yapar");

        }else {
            System.out.println("yakit belli degil , max hiz soylenemez");

    }
    }
}
