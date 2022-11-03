package Ders23_constructors;

public class DAraba {

    // bir proje olusturulurken tum classlarda main method olmasina gerek yoktur
    // cogu class obje olusturularak kullanilmak uzere hzirlanmis depolardir
    // bizde bu class'i araba objeleri icin bir depo olarak dizayn edelim

    // her class olustutuldugunda java o class tan obje olusturulabilmesi icin
    // default bir constructor olusturur
    // bu default constructor gorunmez
    // default constructor parametresizdir ve bize standart bir parametre olusturur

    String marka="Marka belirtilmedi";
    String model="Marka belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public String toString() {
        return "Araba ozellikleri{" +
                "\nmarka=" + marka +
                "\nmodel='" + model +
                "\nyakit='" + yakit +
                "\nyil=" + yil +
                "\nfiyat=" + fiyat;
    }

    public int maxHiz(String yakit){
        int maxHiz=120;

        if(yakit.equalsIgnoreCase("dizel")){
            maxHiz=200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
        }
        return maxHiz;
    }
}
