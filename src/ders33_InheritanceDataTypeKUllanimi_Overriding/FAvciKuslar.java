package ders33_InheritanceDataTypeKUllanimi_Overriding;

public class FAvciKuslar extends EKuslar{




    protected void hareket () {
        System.out.println("Avci kuslar ucarlar");

    }protected void beslenme(){
        System.out.println("Avci kuslar et yerler");


    }protected void pence(){

        System.out.println("Avci kuslar pencelidir");
    }
    protected void gaga(){

        System.out.println("Avci kuslar sivri gagalidir");
    }

    public static void main(String[] args) {

        FAvciKuslar avci1=new FAvciKuslar();
        /*
        bir obje olusturulurken constructor ve data turu ayni ise
        hangi methodun gecerli oldugunu bulmak icin o class a gider
        varsa kullaniriz
        yokssa sirasi ile parentlara gider ve ilk buldugumuzu kullaniriz
         */

        avci1.beslenme(); //Avci kuslar
        avci1.gaga(); //Avci kuslar
        avci1.pence(); //Avci kuslar
        avci1.hareket(); //Avci kuslar
        avci1.cogalma(); // Ekuslar
        avci1.kanat(); // Ekuslar
        avci1.omur(); // DHayvanlar
        avci1.solunum(); // Ekuslar

        EKuslar avci2=new FAvciKuslar();
        /*
        bir obje olusturulurken data turu ve constructor farkli ise
        hangi methodun gecerli olacagini bulmak icin

        once data turunun oldugu class ve parent larina bakarak
        o methodun buluruz
        bulmzsak CTE verir

        bulursak hemen CALISTIRMAYIZ
        calistirmadan once o method override edilmis  mi diye kontrol ederiz
        override edşlmis methodu kullaniriz
         */
        avci2.beslenme(); //Avci kuslar
        avci2.gaga(); //Avci kuslar
        //avci2.pence(); //CTE
        avci2.hareket(); //Avci kuslar
        avci2.cogalma(); // Ekuslar
        avci2.kanat(); // Ekuslar
        avci2.omur(); // DHayvanlar
        avci2.solunum(); // Ekuslar

        DHayvanlar avci3=new FAvciKuslar();

        avci3.beslenme(); //Avci kuslar
       // avci3.gaga(); //CTE
       // avci3.pence(); //CTE
        avci3.hareket(); //Avci kuslar
        avci3.cogalma(); // Ekuslar
       // avci3.kanat(); // CTE
        avci3.omur(); // DHayvanlar
        avci3.solunum(); // Ekuslar

        EKuslar kus1=new EKuslar();
        kus1.cogalma(); // Kuslar
        kus1.gaga(); // Kuslar
        kus1.kanat(); // Kuslar
        kus1.hareket(); // Hayvanlar
        kus1.solunum(); // Kuslar
        kus1.beslenme(); // Hayvanlar
        kus1.omur(); // Hayvanlar

        /*
        methodlarla belirlenen ozellikler en guncel bilgiyi bulurken
        variable ile belirlenen ozellikler ilk buldugu degeri kullanir

        bunun icin methodlara dinamik ozellik
        variablelara static ozellik denir
         */

        DHayvanlar kus2=new EKuslar();
        kus2.cogalma(); // Kuslar
        // kus2.gaga(); // CTE
        // kus2.kanat(); // CTE
        kus2.hareket(); // Hayvanlar
        kus2.solunum(); // Kuslar
        kus2.beslenme(); // Hayvanlar
        kus2.omur(); // Hayvanlar


    }
}
