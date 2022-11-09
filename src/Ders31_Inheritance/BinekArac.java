package Ders31_Inheritance;

public class BinekArac extends Arac {

    protected String marka="Binek araclarin markasi vardir";
    protected String model="Binek araclarin modeli olur";
    protected int yil=1900;


    protected void hiz () {

        System.out.println("binek araclarin hizi modele gore degisir");

    }

    @Override
    protected void teker() {
        System.out.println("binek araclarin 4 tekeri olur");
    }
}
